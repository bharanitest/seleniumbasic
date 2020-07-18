package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class M {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[.='✕']")).click();
		WebElement wb = driver.findElement(By.xpath("//span[.='Electronics']"));
		Actions a=new Actions(driver);
		a.moveToElement(wb).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[.='Samsung'])[1]")).click();
		 
	}

}
