package demo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Lauch {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver","./software/geckodriver.exe");
		//ChromeDriver driver=new ChromeDriver();
		FirefoxDriver driver=new FirefoxDriver();
		//InternetExplorerDriver i=new InternetExplorerDriver();

	}

}
