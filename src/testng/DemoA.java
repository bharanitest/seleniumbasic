package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoA {
	@DataProvider
	public Object[][] getdata()
	{
		Object[][] a=new Object[3][2];
		a[0][0]="abcqwreryu";
		a[0][1]="abvfdghfhsgh";
		
		a[1][0]="1234565";
		a[1][1]="1234567";
		
		a[2][0]="abc123#$%";
		a[2][1]="abvf567^*";
		return a;
		
	}
	@Test(dataProvider ="getdata" )
	public void test(String us,String pwd)
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys(us);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		driver.close();
	}

}
