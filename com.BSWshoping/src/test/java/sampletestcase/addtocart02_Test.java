package sampletestcase;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.elementrepo.ElectronicspageBSW;
import com.genericclass.baseclassBSW;

public class addtocart02_Test extends baseclassBSW
{
	@Test
	public void addtocartelectronics()
	{
		ExtentTest test =extent.createTest("add to cart");
		basepageBSW.getElectronicslink().click();
		test.pass("electronics link clicked");
		ElectronicspageBSW elec=new ElectronicspageBSW(driver);
		elec.getCellphoneslink().click();
		test.pass("cellphone link clicked");
		elec.getProduct1().click();
		test.pass("product1 link clicked");
		
		
	}

}
