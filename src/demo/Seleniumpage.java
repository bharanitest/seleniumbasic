package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Seleniumpage {

	@FindBy(xpath="//a[@class='navbar-brand']")
	private WebElement skillrarybtn;
	
	public Seleniumpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void skillrary()
	{
		skillrarybtn.click();
	}
}
