package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DemoB {
	public WebDriver driver;
static
{
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	System.setProperty("webdriver.ie.driver","./software/IEDriverServer.exe");
}

@Parameters({"browsername"})
@Test
public void testA(String browser) throws InterruptedException
{
	if(browser.equals("chrome"))
	{
		driver=new ChromeDriver();
	}
	else
	{
		driver=new InternetExplorerDriver();
	}
	driver.get("https://demo.actitime.com/login.do");
	Thread.sleep(3000);
	driver.findElement(By.id("username")).sendKeys("admin");
	Thread.sleep(3000);
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.close();
}
}
