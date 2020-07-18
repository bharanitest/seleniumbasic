package sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		Loginpage l=new Loginpage(driver);
		l.usernametxtbox("admin");
		l.passwordtxtbox("manager");
		l.loginbutton();
		
		Homepage h=new Homepage(driver);
		h.usertab();
		Thread.sleep(3000);
		h.logoutbtn();

	}

}
