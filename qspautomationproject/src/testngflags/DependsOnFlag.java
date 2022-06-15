package testngflags;

import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnFlag {
  @Test()
  public void b()
  {
	  Assert.fail();
	  Reporter.log("b",true);
  }
  @Test(dependsOnMethods = "b")
  public void a()
  {
	  
	  Reporter.log("a",true);
  }
}
