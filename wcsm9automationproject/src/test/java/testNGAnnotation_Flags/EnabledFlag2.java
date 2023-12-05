package testNGAnnotation_Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnabledFlag2 {
  @Test(description = "It is used to perform login",enabled = true)
 public void method1() {
  Reporter.log("Method1 for Login Page",true);
  }
  @Test(description = "It is used to create users",enabled = true)
  public void method2() {
	  Reporter.log("Method2 for Users Page",true);
	  }
  @Test(description = "It is used to perform Logout",enabled = false)
  public void method3() {
	  Reporter.log("Method3 for Logout Page",true);
	  }
}
