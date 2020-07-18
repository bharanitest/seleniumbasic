package demo;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class G {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		//Typecasting
		TakesScreenshot t=(TakesScreenshot) driver;
		//photo is taken and stored in ram
		File src = t.getScreenshotAs(OutputType.FILE);
		//required location
		File dest=new File("./photo/flipkart.png");
		//copy paste src to dest
		FileUtils.copyFile(src, dest);
		Thread.sleep(3000);
		driver.close();
		
		
	}

}
