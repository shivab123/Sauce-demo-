package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.Baseclass;
import UtilityLayer.Wait;

public class LoginPage extends Baseclass {
	
	@FindBy(name="user-name")
 private WebElement UserName;
	

	@FindBy(name="password")
	 private WebElement password;
	
	@FindBy(name="login-button")
	 private WebElement login;
	
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void login(String Uname,String pass) {
		Wait.sendKeys(Uname, UserName);
		Wait.sendKeys(pass, password);
	}
	
	public void loginclick() {
		
		Wait.click(login);
	}
}
