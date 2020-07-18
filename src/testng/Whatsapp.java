package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Whatsapp {
	@Test(priority = 1,enabled=false)
	public void status()
	{
		Reporter.log("status",true);
	}
	
	@Test(invocationCount = 3,priority = 2)
	public void calls()
	{
		Reporter.log("calls",true);
	}
	
	@Test(priority = 1)
	public void chats()
	{
		Reporter.log("chats",true);
	}
	

}
