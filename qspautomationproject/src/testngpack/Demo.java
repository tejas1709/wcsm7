package testngpack;

import static org.testng.Assert.fail;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
	
  @Test
  public void a() 
  {
	  Reporter.log("method1 executed",true);
  }
  
  @Test
  public void b() 
  {
	  Reporter.log("method2 executed",true);
  }
  
  @Test
  public void method3() 
  {
	  
	  Reporter.log("method3 executed",true);
  }
  
  @Test
  public void method4() 
  {
	  Reporter.log("method4 executed",true);
  }
  @Test
  public void method5() 
  {
	  Reporter.log("method5 executed",true);
  }
}
