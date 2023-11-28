package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Createcusomer_projectTestCase extends BaseTest {
	static WebDriver driver;

BaseTest bt1 = new BaseTest();
bt.setup();
Flib flib=new Flib();
LoginPage lp =new LoginPage(driver);

//lp.validLogin(flib.readDataFromProperty(prop_path,"Username"),flib.readDataFromProperty(prop_path,"Password"));
Thread.sleep(2000);
Homepage hp=new Homepage(driver);
hp.click_on_Tasks_Module();
Thread.sleep(2000);
Tasks tp =new Taskspage(driver);
tp.CreateCustomer_createProject
bt.tearDown();
}
