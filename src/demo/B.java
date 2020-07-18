package demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class B {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement ele = driver.findElement(By.id("month"));
		Select s=new Select(ele);
		//select the options
		s.selectByIndex(6);
		s.selectByValue("7");
		s.selectByVisibleText("Aug");
		//count of the option
		List<WebElement> alloptions = s.getOptions();
		System.out.println(alloptions.size());
		
		ArrayList<String> a=new ArrayList<String>();
		
		//to get the text
		for(WebElement b:alloptions)
		{
			String text = b.getText();
			System.out.println(text);
			a.add(text);
		}
		//verify single or multiple
		System.out.println(s.isMultiple());
		System.out.println("******************");
		
		System.out.println("After sorting");
		System.out.println("******************");
		Collections.sort(a);
		
		for(String c:a)
		{
			System.out.println(c);
		}
		
		//verify the option 
		
		if(a.contains("May"))
		{
			System.out.println("Option is present");
		}
		
		else
		{
			System.out.println("option is not present");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	Thread.sleep(3000);
		driver.close();

	}

}
