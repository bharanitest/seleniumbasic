package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Idloc {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("gfgfhghdfghfghghghghfghgshj");
		driver.findElement(By.name("firstname")).sendKeys("tfghhgghhghj");
       // driver.findElement(By.linkText("Forgotten account?")).click();
        driver.findElement(By.partialLinkText("account?")).click();
	}

}
