package demo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Du {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Bharani/Desktop/is.html");
		JavascriptExecutor j=(JavascriptExecutor) driver;
		j.executeScript("document.getElementById('t1').value='kjgfjgfhhjghghjgfjhgjhj'");
		Thread.sleep(3000);
		j.executeScript("document.getElementById('t1').value=''");
	}

}
