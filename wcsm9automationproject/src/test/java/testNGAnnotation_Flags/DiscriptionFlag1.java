package testNGAnnotation_Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DiscriptionFlag1 {
  @Test(description = "This performs login Operatins")
  public void Method1() {
	  Reporter.log("Method from flag1",true);
	  
  }
  }

