package assertsiontestng;

import static org.testng.Assert.assertEquals;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionTesNg {
	
	
  @Test
  public void TestCase() 
  {
	  Reporter.log("launch the browser",true);
	  Reporter.log("launch the web app nby entering url",true);
	  
	  Reporter.log("verify login page title",true);
	  SoftAssert soft = new SoftAssert();
	  soft.assertEquals(true, true);
	  Reporter.log("perform login",true);
	 // assert.assertEquals(true, true,);
	  assertEquals(true, true);
	  Reporter.log("verfiy Home Page title",true);
	  Reporter.log("create user",true);
	  Reporter.log("Create contact",true);
	  
  }
}
