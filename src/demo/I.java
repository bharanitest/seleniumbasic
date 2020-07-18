package demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class I {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
		driver.findElement(By.xpath("//button[@ondblclick='addtocart()']")).click();
		//handle
		Alert a = driver.switchTo().alert();
		Thread.sleep(3000);
		a.accept();
		a.dismiss();
		Thread.sleep(3000);
		driver.close();

	}

}
