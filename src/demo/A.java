package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Bharani/Desktop/dis.html");
		WebElement ele = driver.findElement(By.xpath("//input[@type='text']"));
		if(ele.isEnabled())
		{
			ele.sendKeys("fghgfd");
		}
		else
		{
			System.out.println("fail");
		}
	}

}
