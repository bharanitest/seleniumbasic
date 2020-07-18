package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Facebooktc3 {
	
	@Test
	public void createaccount() throws InterruptedException
	{
		driver.findElement(By.name("firstname")).sendKeys("hgfgjhgfj");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Create a Page")).click();
		String t = driver.getTitle();
		Reporter.log(t,true);
		String url = driver.getCurrentUrl();
		Reporter.log(url,true);
	}
	
	

}
