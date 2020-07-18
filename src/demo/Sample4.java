package demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample4 {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException, IOException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Properties p=new Properties();
		p.load(new FileInputStream("./data.properties"));
		
		driver.get(p.getProperty("Url"));
		
		
		WebElement us = driver.findElement(By.id("username"));
		if(us.isDisplayed())
		{
			us.sendKeys("'admin");
			System.out.println("pass:element is dispalyed");
		}
		else
		{
			System.out.println("fail:element is not dispalyed");
		}
		WebElement ch = driver.findElement(By.id("keepLoggedInCheckBox"));
		if(ch.isSelected())
		{
			System.out.println("pass:element is selected");
		}
		else
		{
			System.out.println("fail:element is not selected");
		}
WebElement btn = driver.findElement(By.xpath("//div[.='Login ']"));
if(btn.isEnabled())
{
	System.out.println("pass:element is enabled");
	btn.click();
}
else
{
	System.out.println("fail:element is not enabled");
}
Thread.sleep(3000);
driver.close();
	}

}
