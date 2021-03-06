package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//webelement 2 METHODS
//	By USERNAME_LOCATOR = By.xpath("//*[@id=\"username\"]");
//	WebElement USERNAME_ELEMENT_1 = driver.findElement(By.xpath("//*[@id=\"username\"]"));
	
	//webelement PAGE METHODS
	@FindBy(how = How.XPATH, using = "//*[@id=\"username\"]") WebElement USERNAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"password\"]") WebElement PASSWORD_ELEMENT;
	@FindBy(how = How.XPATH, using = "/html/body/div/div/div/form/div[3]/button") WebElement SIGNIN_BUTTON_ELEMENT;
	
	//Interactable Methods
	public void insertUserName(String userName) {
		USERNAME_ELEMENT.sendKeys(userName);
		
	}
	
	public void insertPassword(String password) {
		PASSWORD_ELEMENT.sendKeys(password);
		
	}
	
	public void clickSigninButton() {
		SIGNIN_BUTTON_ELEMENT.click();
		
	}
	// Combining Methods 
//	public void loginIn(String userName, String password) {
//		USERNAME_ELEMENT.sendKeys(userName);
//		PASSWORD_ELEMENT.sendKeys(password);
//		SIGNIN_BUTTON_ELEMENT.click();
//	}
}

