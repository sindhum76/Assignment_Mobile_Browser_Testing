package Mobile_Browser_Testing;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Browser_Testing extends Capability{

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver = DesiredCapability();
		driver.get("https://m.cricbuzz.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.findElement(MobileBy.className("ui-btn-text")).click();
		//driver.findElementByAndroidUIAutomator("text(\"Menu\")").click();
		
		
		
		driver.findElement(MobileBy.xpath("//body[@id=\"top\"]/div/div[3]/div[2]/a/span[1]")).click();
		System.out.println("Clicked on Menu");
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(3000);
		System.out.println("Waited for sometime");
		driver.findElementByAndroidUIAutomator("text(\"Home\")").click();;
		
		System.out.println("Clicked on Home");
		
		//Scroll to "RR fielding coach set to join team in UAE"
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"RR fielding coach set to join team in UAE\"));");
		
		
		
	}

}
