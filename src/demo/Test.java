package demo;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class Test {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver","./software/IEDriverServer.exe");
		InternetExplorerDriver driver=new InternetExplorerDriver();

	}

}
