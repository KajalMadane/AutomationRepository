package testNGExecutionpackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test3 {
  @Test
  public void method1() {
	  Reporter.log("method1 from Test1 class",true);
  }
  public void method2() {
	  Reporter.log("method1 from Test1 class",true);
  }

}
