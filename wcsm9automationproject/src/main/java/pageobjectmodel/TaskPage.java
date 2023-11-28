package pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TaskPage {
	//store all the webElement of taskspage
	@FindBy(partialLinkText="Projects & Customers")private WebElement Projects_Customers_Sub_Module;
	@FindBy(xpath="//input[@value='Create New Customer']")private WebElement Create_New_Customer_Button;
	@FindBy(xpath="//input[@value='Create new Project']")private WebElement Create_New_Project_Button;
	
	@FindBy(name="name")private WebElement Customer_nameTB;
	@FindBy(name=" Create Coustomer Submit")private WebElement CreateCustomer_Button;
@FindBy(name="CustomerId")private WebElement Customer_name_Dropdown;
@FindBy(name="name")private WebElement Project_nameTB;
@FindBy(name="CreateProject_Button ")private WebElement CreateProject_Button;
public WebElement getProjects_Customers_Sub_Module() {
	return Projects_Customers_Sub_Module;
}
public WebElement getCreate_New_Customer_Button() {
	return Create_New_Customer_Button;
}
public WebElement getCreate_New_Project_Button() {
	return Create_New_Project_Button;
}
public WebElement getCustomer_nameTB() {
	return Customer_nameTB;
}
public WebElement getCreateCustomer_Button() {
	return CreateCustomer_Button;
}
public WebElement getCustomer_name_Dropdown() {
	return Customer_name_Dropdown;
}
public WebElement getProject_nameTB() {
	return Project_nameTB;
}
public WebElement getCreateProject_Button() {
	return CreateProject_Button;
}


}


	

//initilization

