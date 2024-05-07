package parameterization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class sampletestcase
{
	@Test
	public void lounchingoogleusingparameterzation() 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String URL=System.getProperty("url");
		driver.get(URL);
		String TESTDATA =System.getProperty("data");
		driver.findElement(By.name("q")).sendKeys(TESTDATA,Keys.ENTER);
		
		
	}

}
