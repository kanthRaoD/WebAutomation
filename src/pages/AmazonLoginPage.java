package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AmazonLoginPage {

	WebDriver driver;
	WebElement element;
	
//	By siginbutton = By.xpath("//*[@id='rhf-container']/div/div[2]/div[1]/a/span");
	By user_name = By.id("ap_email");
	By clickcontinue = By.id("continue");
	By password = By.id("ap_password");
	By clicksigin = By.xpath("//*[@id='signInSubmit']");
	By titleText = By.xpath("//*[@id='auth-error-message-box']/div/div/ul/li/span");

	public AmazonLoginPage(WebDriver driver) {
		this.driver = driver;

	}
	public void login() {
		

		//driver.findElement(siginbutton).click();

	}
	

	public void setUserName(String username) {
		driver.findElement(user_name).sendKeys(username);
	}

	public void clickContinue() {
		driver.findElement(clickcontinue).click();
	}

	public void setPassword(String amazonloginpassword) {
		driver.findElement(password).sendKeys(amazonloginpassword);
	}

	public void clickLogin() {
		driver.findElement(clicksigin).click();
		
		
		

	}
	// Get the title of  Page
	public void getTitle()
	{
		 String expectedTitle = "Your password is incorrect";
	      String actualTitle = driver.findElement(titleText).getText();
	      Assert.assertEquals(actualTitle, expectedTitle);
	}
	

	public String getLoginTitle() {

		return driver.findElement(titleText).getText();

	}

	public void login_to_amazon_website(String username, String Password) {

	    //this.login();
		// enter username
		this.setUserName(username);

		// click on continue button
		this.clickContinue();

		// enter passwword
		this.setPassword(Password);

		// click login button
		this.clickLogin();
		
		this.getTitle();
	}
}
