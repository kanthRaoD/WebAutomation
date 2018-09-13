package Amazonautomation;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;		
import cucumber.api.java.en.Then;		
import cucumber.api.java.en.When;
import test.AmazonTestLoginPage;		

public class automateTest {				

	WebDriver driver;
	WebElement element;
	AmazonTestLoginPage amazon = new AmazonTestLoginPage();		

	@Given("^Open the Chrome and launch the application$")					
	public void open_the_Chrome_and_launch_the_application() throws Throwable							
	{		
		amazon.setup();
	}		

	@When("^I enter Username as \"([^\"]*)\" and Password as \"([^\"]*)\"$")		
	public void enter_the_Username_and_Password(String username,String password) throws Throwable 							
	{		
		amazon.test_amazon_login_page(username, password);
	}		

	@When("^I add electronics items to cart$")
	public void Add_items_to_cart() throws InterruptedException
	{
		amazon.test_amazon_home_page();
	}

	@Then("^Close the Browser$")					
	public void Reset_the_credential() throws Throwable 							
	{		
		amazon.close_the_browser();
	}		
}
