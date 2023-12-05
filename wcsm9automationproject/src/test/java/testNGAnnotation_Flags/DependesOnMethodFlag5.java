package testNGAnnotation_Flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependesOnMethodFlag5 {
	@Test(description ="Login Perform!!!!!")
	 public void loginMethod() {
	  Reporter.log("Method1 for Login Page",true);
	  }
	  @Test(description ="UserCreated",dependsOnMethods ="loginMethod" )
	  public void createUsersMethod() {
		  Reporter.log("Method2 for  Users Page",true);
		  }
	  @Test(description = "Logout Perform!!!",dependsOnMethods = "createUsersMethod")
	  public void logoutMethod() {
		  Reporter.log("Method3 for Logout Page",true);
		  }
}
