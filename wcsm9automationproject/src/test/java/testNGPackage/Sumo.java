package testNGPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sumo {
  @Test
  public void method1() 
  {
	 // System.out.println("Method3 form Remo class") ; 
	  Reporter.log("Method1 form Remo class",true);
  }
  @Test
  public void method2()
  {
	  Reporter.log("Method2 form Remo class",false);
  }
}
