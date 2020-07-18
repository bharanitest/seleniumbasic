package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(12,TimeUnit.SECONDS);
		driver.findElement(By.linkText("LOGIN")).click();
		driver.findElement(By.id("email")).sendKeys("user");
		driver.findElement(By.id("password")).sendKeys("user");
		driver.findElement(By.id("last")).click();
	WebElement ele = driver.findElement(By.id("course"));
	Actions a=new Actions(driver);
	a.moveToElement(ele).perform();
	driver.findElement(By.xpath("//a[.='Cucumber']")).click();
	WebElement dd = driver.findElement(By.id("add"));
	a.doubleClick(dd).perform();
	driver.findElement(By.xpath("//button[@ondblclick='addtocart()']")).click();
	driver.switchTo().alert().accept();
	driver.findElement(By.xpath("//li[@class='dropdown messages-menu']")).click();
	driver.findElement(By.xpath("//a[.='Go to Cart']")).click();
	driver.findElement(By.xpath("//button[.='Checkout']")).click();
	driver.switchTo().frame(0);
	driver.findElement(By.xpath("(//a[@target='_blank'])[6]")).click();
	//driver.switchTo().alert().accept();
	}

}
