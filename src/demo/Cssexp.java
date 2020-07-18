package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cssexp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com");
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");
driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");

	}

}
