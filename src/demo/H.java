package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class H {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		JavascriptExecutor j=(JavascriptExecutor)driver;
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.xpath("(//img[@class='product-image'])[6]"));
		Point loc = ele.getLocation();
		System.out.println(loc);
		int x = loc.getX();
		int y=loc.getY();
		j.executeScript("window.scrollBy("+x+","+y+")");
		Thread.sleep(3000);
		ele.click();
		
		
	}

}
