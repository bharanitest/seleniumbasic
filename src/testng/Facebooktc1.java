package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class Facebooktc1 extends Sample{
	
	
	@Test
	public void createaccount()
	{
		driver.findElement(By.linkText("Forgotten account?")).click();
		driver.findElement(By.id("identify_email")).sendKeys("5645645656");
		String t = driver.getTitle();
	//	Assert.assertEquals(t, "abc");
		SoftAssert s=new SoftAssert();
		s.assertEquals(t,"abc");
		Reporter.log(t,true);
		String url = driver.getCurrentUrl();
		Reporter.log(url,true);
		s.assertAll();
	}
}

