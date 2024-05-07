package sampletestcase;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.elementrepo.computerpageBSW;
import com.genericclass.baseclassBSW;


public class addtocart01_Test extends baseclassBSW
{
	@Test
	public void addtocartcomp() 
	{
		ExtentTest test =extent.createTest("add to cart");
		
		basepageBSW.getComputerslink().click();
		test.pass("computer link clicked");
		computerpageBSW comp = new computerpageBSW(driver);
		comp.getDestoplink().click();
		test.pass("destop link clicked");
		comp.getProduct1().click();
    		
	}
	
	

}
