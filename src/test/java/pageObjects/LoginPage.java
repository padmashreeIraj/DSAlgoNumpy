package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@name='username']")
	WebElement txtEmailAddress;

	@FindBy(name = "password")
	WebElement txtPassword;
	
	/*@FindBy(name = "password2")
	WebElement txtConfirmPassword;*/

	@FindBy(xpath = "//body/div[2]/div[1]/div[2]/form[1]/input[4]")
	WebElement btnLogin;
	
	/*@FindBy(xpath = "//div[contains(text(),'password_mismatch')]='Your Account Has Been Created!']")
	WebElement msgConfirmation;*/

	
	public void setUser(String user) {
		txtEmailAddress.sendKeys(user);
	}

	public void setPassword(String pwd) {
		txtPassword.sendKeys(pwd);
	}
	
	/*public void setConfirmPassword(String pwd) {
		txtConfirmPassword.sendKeys(pwd);

	}*/

	public void clickLogin() {
		btnLogin.click();
	}
	
	/*public String getConfirmationMsg() {
		try {
			return (msgConfirmation.getText());
		} catch (Exception e) {
			return (e.getMessage());

		}*/
	
	
}
