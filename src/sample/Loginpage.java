package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	//declare
	
	@FindBy(id="username")
	private WebElement usernametb;
	
	@FindBy(name="pwd")
	private WebElement passwordtb;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement logintbn;
	
	//initalization
	
	public  Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//utilzation
	
	public void usernametxtbox(String us)
	{
		usernametb.sendKeys(us);
	}
		
	
	public void passwordtxtbox(String pwd)
	{
		passwordtb.sendKeys(pwd);
	}
	
	public void loginbutton()
	{
		logintbn.click();
	}
	}
	

