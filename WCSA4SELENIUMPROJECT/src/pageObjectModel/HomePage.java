package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

	@FindBy(className = "logout")
	private WebElement logoutLink;
	@FindBy(xpath = "//a[@class='content users']")
	private WebElement users;
	@FindBy(xpath = "//div[.='Tasks']")
	private WebElement tasks;
	@FindBy(className = "sizer")
	private WebElement reports;

	@FindBy(name = "usersSelector.selectedUser")
	private WebElement timetrack;

	@FindBy(xpath = "//input[@value='Create New User']")
	private WebElement createUser;

	public WebElement getCreateUser() {
		return createUser;
	}

	public void setCreateUser(WebElement createUser) {
		this.createUser = createUser;
	}

	public WebElement getTimetrack() {
		return timetrack;
	}

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	public void setLogoutLink(WebElement logoutLink) {
		this.logoutLink = logoutLink;
	}

	public void setUsers(WebElement users) {
		this.users = users;
	}

	public void setTasks(WebElement tasks) {
		this.tasks = tasks;
	}

	public void setReports(WebElement reports) {
		this.reports = reports;
	}
	
	

	public void logout() {
		logoutLink.click();
	}

	public void selectUSer(int index) {
		timetrack.click();

		Select sel = new Select(timetrack);

		sel.selectByIndex(index);

	}

	public void users() throws InterruptedException 
	{
		users.click();
		Thread.sleep(1000);
		
		createUser.click();

	}
}
