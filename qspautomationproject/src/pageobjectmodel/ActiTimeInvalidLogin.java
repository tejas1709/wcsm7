package pageobjectmodel;

import java.io.IOException;

public class ActiTimeInvalidLogin extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException 
	{


		BaseTest bt=new BaseTest();
		Flib flib=new Flib();

		bt.setUp();

		LoginPage lp = new LoginPage(driver);
		int rc=flib.rowCount(EXCEL_PATH, "invalidcreds");

		for(int i=1;i<=rc;i++)
		{

			String username=flib.readExcelData(EXCEL_PATH, "invalidcreds", i, 0);
			String password=flib.readExcelData(EXCEL_PATH, "invalidcreds", i, 1);
			lp.actiTimeInvalidLogin(username, password);
			
			Thread.sleep(2000);


		}

		bt.tearDown();

	}
 
}
