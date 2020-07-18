package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class D {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
		WebElement src = driver.findElement(By.xpath("//h1[.='Block 2']"));
		Thread.sleep(3000);
		WebElement dest = driver.findElement(By.xpath("//h1[.='Block 3']"));
		Actions a=new Actions(driver);
		Thread.sleep(3000);
		a.dragAndDrop(src,dest).perform();
		
		Thread.sleep(3000);
		driver.close();

		
	}

}
