package testngflags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupsFlag {
  @Test( groups = "Functional")
  public void f1() 
  {
	  Reporter.log("f1",true);
  }
  
  @Test( groups = "Integration")
  public void i1() 
  {
	  Reporter.log("i1",true);
  }
  
  @Test( groups = "Smoke")
  public void s1() 
  {
	  Reporter.log("s1",true);
  }
  
  //---------------------------------------------------------------------------//
  
  @Test( groups = "Functional")
  public void f2() 
  {
	  Reporter.log("f2",true);
  }
  
  @Test( groups = "Integration")
  public void i2() 
  {
	  Reporter.log("i2",true);
  }
  
  @Test( groups = "Smoke")
  public void s2() 
  {
	  Reporter.log("s2",true);
  }
  
  //--------------------------------------------------------------------------//
  
  @Test( groups = "Functional")
  public void f3() 
  {
	  Reporter.log("f3",true);
  }
  
  @Test( groups = "Integration")
  public void i3() 
  {
	  Reporter.log("i3",true);
  }
  
  @Test( groups = "Smoke")
  public void s3() 
  {
	  Reporter.log("s3",true);
  }
  
  //-----------------------------------------------------------------------------//
  
  @Test( groups = "Functional")
  public void f4() 
  {
	  Reporter.log("f4",true);
  }
  
  @Test( groups = "Integration")
  public void i4() 
  {
	  Reporter.log("i4",true);
  }
  
  @Test( groups = "Smoke")
  public void s4() 
  {
	  Reporter.log("s4",true);
  }
  
  //-------------------------------------------------------------------------------//
  
  @Test( groups = "Functional")
  public void f5() 
  {
	  Reporter.log("f5",true);
  }
  
  @Test( groups = "Integration")
  public void i5() 
  {
	  Reporter.log("i5",true);
  }
  
  @Test( groups = "Smoke")
  public void s5() 
  {
	  Reporter.log("s5",true);
  }
  
  //---------------------------------------------------------------------------//
  
  @Test( groups = "Functional")
  public void f6() 
  {
	  Reporter.log("f6",true);
  }
  
  @Test( groups = "Integration")
  public void i6() 
  {
	  Reporter.log("i6",true);
  }
  
  @Test( groups = "Smoke")
  public void s6() 
  {
	  Reporter.log("s6",true);
  }
}
