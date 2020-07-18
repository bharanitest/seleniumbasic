package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselectdd {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/");
		WebElement ele = driver.findElement(By.id("cars"));
		Select s=new Select(ele);
		s.selectByIndex(0);
		s.selectByValue("199");
		s.selectByVisibleText("INR 50 - INR 99 ( 1 )");
		System.out.println(s.isMultiple());
		List<WebElement> options = s.getOptions();
		int count = options.size();
		System.out.println(count);
		
//		for(WebElement b:options)
//		{
//			System.out.println(b.getText());
//		}
		
		for(int i=0;i<count;i++)
		{
			WebElement c = options.get(i);
			System.out.println(c.getText());
		}
		
		Thread.sleep(3000);
		driver.close();
		
	}

}
