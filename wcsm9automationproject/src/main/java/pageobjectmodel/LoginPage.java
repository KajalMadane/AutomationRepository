package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//store all webelement of login page
	@FindBy(name="username") private WebElement usnTB;
	@FindBy(name="pwd") private WebElement passTB;
	@FindBy(id="loginButton") private WebElement loginButton;
	@FindBy(name="remember") private WebElement keepMeLoggedInCheckBox;
	@FindBy(partialLinkText  ="Actimin") private WebElement actiMindLink;
	@FindBy(partialLinkText ="License") private WebElement LicenseLink;
	
	
	//initialization
	//right click and source & Generet
		
	public LoginPage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);	
	
	}
	//right click and source &  getter and  Generet


	public WebElement getUsnTB() {
		return usnTB;
	}


	public WebElement getPassTB() {
		return passTB;
	}


	public WebElement getLoginButton() {
		return loginButton;
	}


	public WebElement getKeepMeLoggedInCheckBox() {
		return keepMeLoggedInCheckBox;
	}


	public WebElement getActiMindLink() {
		return actiMindLink;
	}


	public WebElement getLicenseLink() {
		return LicenseLink;
	}
//operational methods
	//right click and source & setter Generet
public void ValidLogin(String Validusn,String Validpass)

{

	usnTB.sendKeys(Validusn);
	passTB.sendKeys(Validpass);
	loginButton.click();
	
}
public void InvalidLogin(String Invalidusn,String Invalidpass)

{

	usnTB.sendKeys(Invalidusn);
	passTB.sendKeys(Invalidpass);
	loginButton.click();
	usnTB.clear();
}

	
	}
