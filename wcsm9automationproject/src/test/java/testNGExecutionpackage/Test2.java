package testNGExecutionpackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2 {
  @Test
  public void method1() {
	  Reporter.log("method1 from Test1 class",true);
	  
  }
  public void method2() {
	  int a=2;
	  int b=4;
	  int res=a/b;
	  Reporter.log("method1 from Test1 class +res",true );
  }

}
