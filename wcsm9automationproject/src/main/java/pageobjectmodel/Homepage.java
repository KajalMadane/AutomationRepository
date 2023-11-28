package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
//store all the modules of Home page
@FindBy(xpath="//div[text()='Time-Track']/following-subling::div/img")private WebElement Time_Module;
@FindBy(xpath="//div[text()='Tasks']/following-subling::div/img")private WebElement Tasks_Module;
@FindBy(xpath="//div[text()='Reports']/following-subling::div/img")private WebElement Reports_Module;
@FindBy(xpath="//div[text()='Users']/following-subling::div/img")private WebElement Users_Module;
@FindBy(xpath="//div[text()='Work Schedule']/following-subling::div/img")private WebElement Work_Schedule_Module;
@FindBy(xpath="//div[text()='Settings']/following-subling::div/img")private WebElement Settings_Module;
@FindBy(partialLinkText ="Logout")private WebElement Logout_Link;

public Homepage(WebDriver driver) {
	// TODO Auto-generated constructor stub
}

public  void HomePage (WebDriver driver)
{
	PageFactory.initElements(driver,this);
}

public WebElement getTime_Module() {
	return Time_Module;
}

public WebElement getTasks_Module() {
	return Tasks_Module;
}

public WebElement getReports_Module() {
	return Reports_Module;
}

public WebElement getUsers_Module() {
	return Users_Module;
}

public WebElement getWork_Schedule_Module() {
	return Work_Schedule_Module;
}

public WebElement getSettings_Module() {
	return Settings_Module;
}

public WebElement getLogout_Link() {
	return Logout_Link;
}
public void click_on_Time_Track_Module()
{
Time_Module.click();
}
public void click_on_Tasks_Module()
{
	Tasks_Module.click();
}
public void click_on_Reports_Module()
{
	Reports_Module.click();
}
public void Users_Module()
{
	Users_Module.click();
}
public void click_on_Work_Schedule_Module()
{
	Work_Schedule_Module.click();
}
public void click_on_Settings_Module()
{
	Settings_Module.click();
}
public void click_on_Logout_Link()
{
	Logout_Link.click();
}
}
//utilizatin

