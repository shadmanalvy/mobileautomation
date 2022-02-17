package base;

import java.io.File;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class baseClass {
	
	public AppiumDriver<MobileElement> driver;
	
	@BeforeSuite
	
	public void Setup() {
		
		try {
			
			DesiredCapabilities caps = new DesiredCapabilities();
			
			caps.setCapability("platformName", "Android");
			caps.setCapability("deviceName", "emulator-5554");
			//caps.setCapability("automationName", "uiautomator2");
			caps.setCapability("appPackage", "com.example.new_sample");
			caps.setCapability("appActivity", "com.example.new_sample.MainActivity");
			caps.setCapability("app", "/Users/shadman/Downloads/Elegant_Calculator-master/app/release/Calculator.apk");
			caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 120);
			caps.setCapability("fullReset", false);
			caps.setCapability("noReset", true);
			
			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			driver = new AppiumDriver<MobileElement>(url,caps);

		}
		
		catch (Exception exp) {
			System.out.println("Cause is: " +exp.getCause());
			System.out.println("Message: " +exp.getMessage());
			exp.printStackTrace();
		}
		
	}
	
	@AfterSuite
	public void tearDown() {
		driver.quit();
	}
}
