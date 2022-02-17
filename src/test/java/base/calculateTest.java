package base;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.calculatorPage;

public class calculateTest extends baseClass {
	
	@Test
	public void getvalidResult() throws InterruptedException {
		
		//Thread.sleep(2000);
		calculatorPage res = new calculatorPage (driver);
		res.pressButton1();
		res.pressButtonadd();
		res.pressButton2();
		res.pressButtonequal();
		String finalresult = res.viewResult();
		Assert.assertEquals(finalresult, "3");
		
	}
}
	

