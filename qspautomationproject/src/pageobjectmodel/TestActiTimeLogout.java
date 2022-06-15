package pageobjectmodel;

import java.io.IOException;



public class TestActiTimeLogout extends BaseTest
{

	public static void main(String[] args) throws IOException, InterruptedException
	{
		BaseTest bt=new BaseTest();
		bt.setUp();
		
		Flib flib=new Flib();
		
		LoginPage lp=new LoginPage(driver);
		String username=flib.readPropData(PROP_PATH, "username");
		String password=flib.readPropData(PROP_PATH, "password");
		lp.actiTimeValidLogin(username, password);
		HomePage hp=new  HomePage(driver);
		Thread.sleep(3000);
		hp.clickLogout();
		

	}

}
