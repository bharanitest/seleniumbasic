package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Coursepage {
	
	@FindBy(id="course")
	private WebElement courcetab;
	
	public WebElement getCourcetab() {
		return courcetab;
	}

	@FindBy(xpath="//a[.='Selenium Training']")
	private WebElement seleniumbtn;
	
	public Coursepage(WebDriver driver)
	
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public void option()
	{
		seleniumbtn.click();
	}

}
