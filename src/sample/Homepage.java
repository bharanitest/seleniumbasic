package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

	@FindBy(xpath="//div[.='Users']")
	private WebElement users;
	
	@FindBy(id="logoutLink")
	private WebElement logout;
	
	public Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void usertab()
	{
		users.click();
	}
	
	public void logoutbtn()
	{
		logout.click();
	}
	
}
