package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement ele = driver.findElement(By.name("q"));
		ele.sendKeys("seleni");
		Thread.sleep(6000);
		List<WebElement> ele1 = driver.findElements(By.cssSelector("li[class='sbct']"));
		System.out.println(ele1.size());
		ele.sendKeys(Keys.DELETE);
//		
//		for(int i=1;i<=ele1.size();i++)
//		{
//			WebElement b = ele1.get(i);
//			System.out.println(b.getText());
//		}
		
//		for(WebElement b:ele1)
//		{
//			System.out.println(b.getText());
//		}
Thread.sleep(3000);
driver.close();
	}

}
