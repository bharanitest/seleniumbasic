package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?");
		driver.findElement(By.cssSelector("a[class='login']")).click();
		driver.findElement(By.id("email")).sendKeys("bharani.r@skillrary.com");
		driver.findElement(By.id("passwd")).sendKeys("bharani123");
		driver.findElement(By.id("SubmitLogin")).click();
		driver.findElement(By.id("search_query_top")).sendKeys("dress");
		driver.findElement(By.name("submit_search")).click();
		driver.findElement(By.xpath("(//a[@title='Printed Summer Dress'])[2]")).click();
		for(int i=1;i<=3;i++)
		{
		driver.findElement(By.cssSelector("i[class='icon-plus']")).click();
		}
		driver.findElement(By.name("Yellow")).click();
		driver.findElement(By.xpath("//span[.='Add to cart']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();
		Thread.sleep(3000);
		driver.close();
	}


}
