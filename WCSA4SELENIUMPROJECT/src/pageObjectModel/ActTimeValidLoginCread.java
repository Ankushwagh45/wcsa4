package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActTimeValidLoginCread extends BaseTest {
	@FindBy(name = "username")
	private WebElement username;
	@FindBy(name = "pwd")
	private WebElement password;
	@FindBy(id = "loginButton")
	private WebElement loginButton;

	@FindBy(id = "keepLoggedInCheckBox")
	private WebElement checkBox;
	@FindBy(xpath = "//a[.='Actimind Inc.']")
	private WebElement actimindLink;
	@FindBy(id = "licenseLink")
	private WebElement licenseLink;

	public ActTimeValidLoginCread(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getCheckBox() {
		return checkBox;
	}

	public WebElement getActimindLink() {
		return actimindLink;
	}

	public WebElement getLicenseLink() {
		return licenseLink;
	}

	public void actiTimeValidLoginCread(String validUserName, String validPassword) throws InterruptedException {
		username.sendKeys(validUserName);
		Thread.sleep(1000);

		password.sendKeys(validPassword);
		Thread.sleep(1000);

		loginButton.click();

	}

	public void actiTimeInvalidLoginCread(String invalidUserName, String invalidPassword) throws InterruptedException {
		username.sendKeys(invalidUserName);
		Thread.sleep(1000);

		password.sendKeys(invalidPassword);
		Thread.sleep(1000);

		loginButton.click();
		Thread.sleep(1000);

		username.clear();
	}

}
