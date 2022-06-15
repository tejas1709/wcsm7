package testngflags;

import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AlwaysRunFlag 
{
	@Test()
	  public void b()
	  {
		  Assert.fail();
		  Reporter.log("b",true);
	  }
	  @Test(dependsOnMethods = "b",alwaysRun = true)
	  public void a()
	  {
		  
		  Reporter.log("a",true);
	  }

}
