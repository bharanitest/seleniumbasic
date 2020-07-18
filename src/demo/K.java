package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class K {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		 Thread.sleep(3000);
        driver.findElement(By.id("DepartDate")).click();
        
        driver.findElement(By.xpath("//a[.='10']")).click();
        Thread.sleep(3000);
        driver.close();
	}

}
