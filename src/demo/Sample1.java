package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/index.php");
		driver.findElement(By.linkText("LOGIN")).click();
		driver.findElement(By.id("email")).sendKeys("user");
		driver.findElement(By.id("password")).sendKeys("user");
		driver.findElement(By.id("last")).click();
		String t = driver.getTitle();
		System.out.println(t);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(3000);
		if(t.equals("SkillRary Courses"))
		{
			System.out.println("Pass:home page is disaplyed");
		}
		else
		{
			System.out.println("Fail:home page is not dispalyed");
		}
		driver.close();

	}

}
