package testNGPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Remo {
  @Test
  public void method1() {
	 // System.out.println("Method1 form Demo class",true) ; 
	  Reporter.log("Method2 form Remo class",true);
	   }
  @Test
  public void method2()
  {
	  Reporter.log("Method2 form Remo class",false);

}
}
