package testNGAssertations;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class NewTestAssert {
  @Test
  public void assertMethod() {
	  Reporter.log("Launch Browsers!!!!",true); 
	  Reporter.log("Launch WebApllication by using url!!!!",true); 
	  
	  
	  Reporter.log("Verify and validate  the LoginPage!!!!",true); 
	  SoftAssert sa=new SoftAssert();
	  sa.assertEquals(true, false);//soft assert
	  Reporter.log("Login Performed!!!!",true); 
	  
	  Reporter.log("Verify and validate the home page!!!!",true); 
	  Assert.assertEquals(true, false);//hard assert
	  Reporter.log("User Created!!!!",true); 
	  Reporter.log("Task Created!!!!",true); 
  }
}
