package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class calculatorPage {
	
	public calculatorPage(AppiumDriver<MobileElement> driver)
	
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		//PageFactory.initElements(driver, this);
	}
	
	@AndroidFindBy (id="com.example.new_sample:id/button1")
	MobileElement button1;
	
	
	public void pressButton1() {
		button1.click();
		System.out.println("Clicked 1");
	}
	
	@AndroidFindBy (id="com.example.new_sample:id/button_add")
	
	MobileElement buttonadd;
	
	public void pressButtonadd() {
		buttonadd.click();
		System.out.println("Clicked add");
	}
	
	@AndroidFindBy (id="com.example.new_sample:id/button2")
	MobileElement button2;
	
	public void pressButton2() {
		button2.click();
		System.out.println("Clicked 2");
	}
	
	@AndroidFindBy (id="com.example.new_sample:id/button_equal")
	MobileElement buttonequal;
	
	public void pressButtonequal() throws InterruptedException {
		buttonequal.click();
		System.out.println("Clicked equal");
		Thread.sleep(5000);
	}
	

	
	@AndroidFindBy (id="com.example.new_sample:id/output")
	//@AndroidFindBy (xpath="//android.widget.TextView[@text='3']")
	//driver.findElement(By.xpath("//android.widget.TextView[@text='3']"));
	//@AndroidFindBy (className="android.widget.TextView")
	//@AndroidFindBy (xpath="//*[contains(text(), '3')]")
	MobileElement result;
	
	public String viewResult() {
		
		String finalresult = result.getText();
		return finalresult;
		
		
//	if(result.getText().equals("3"))
  //  {
    //    System.out.println("Test Passed...");
    //}
   // else
    //{
      //  System.out.println("Test Failed...");
   // }
	}
}

  