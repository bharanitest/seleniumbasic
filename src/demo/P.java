package demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P {
	public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.com/");
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_T);
	
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_T);
	
	//driver.get("https://demoapp.skillrary.com");
	
	String parent = driver.getWindowHandle();
	Set<String> ele = driver.getWindowHandles();
	for(String b:ele)
	
	{
		driver.switchTo().window(b);
	}
	
	driver.get("https://demoapp.skillrary.com");
	driver.findElement(By.xpath("//a[.='LOGIN']")).click();
	
	driver.switchTo().window(parent);
	
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phone");
	
	driver.quit();
}
}