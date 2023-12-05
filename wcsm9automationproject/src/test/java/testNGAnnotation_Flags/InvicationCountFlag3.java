package testNGAnnotation_Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvicationCountFlag3 {
  @Test(invocationCount =100)
  public void Method1() {
	  Reporter.log("Login!!!!");
  }
}
