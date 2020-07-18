package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoC {
	@Test
	public void openaccount()
	{
		Reporter.log("openaccount",true);
	}
	
	@Test(groups="closeaccount")
	public void closeaccount()
	{
		Reporter.log("closeaccount",true);
	}
	
	@Test
	public void createaccount()
	{
		Reporter.log("createaccount",true);
	}
	@Test
	public void deleteaccount()
	{
		Reporter.log("deleteaccount",true);
	}

}
