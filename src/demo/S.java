package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class S {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/index.php");
		//WebElement ele = driver.findElement(By.id("course"));
		Coursepage c=new Coursepage(driver);
		Actions a=new Actions(driver);
		a.moveToElement(c.getCourcetab()).perform();
		
		//driver.findElement(By.xpath("//a[.='Selenium Training']")).click();
		//driver.findElement(By.xpath("//a[@class='navbar-brand']")).click();
		c.option();
		Seleniumpage s=new Seleniumpage(driver);
		s.skillrary();
		
		a.moveToElement(c.getCourcetab()).perform();
		//driver.findElement(By.xpath("//a[.='Selenium Training']")).click();
		s.skillrary();

			
		
		

	}

}
