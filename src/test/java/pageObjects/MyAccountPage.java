package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {

	public MyAccountPage(WebDriver driver) {
		super(driver);
	}

	/*@FindBy(name = "csrfmiddlewaretoken") // MyAccount Page heading
	WebElement msgHeading;*/
	
	@FindBy(linkText = "Register")
	WebElement lnkRegister;

	@FindBy(xpath = "//div[contains(text(),'You')]") // MyAccount Page heading
	WebElement msgHeading;

	@FindBy(xpath = "//div[@class='list-group']//a[text()='Logout']")
	WebElement lnkLogout;
	
	/*public String isMyAccountPageExists()   // MyAccount Page heading display status
	{
		try {
			return (msgHeading.getText());
		} catch (Exception e) {
			return (e.getMessage());
		}
	}*/
	public boolean isMyAccountPageExists()   // MyAccount Page heading display status
	{
		try {
			return (msgHeading.isDisplayed());
		} catch (Exception e) {
			return (false);
		}
	}

	public void clickRegister() {
		lnkRegister.click();
	}
	
	}
	

