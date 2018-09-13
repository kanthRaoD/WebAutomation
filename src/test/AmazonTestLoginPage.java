package test;

import java.io.FileReader;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Library.GenericLibrary;
import Wait.WaitFor;
import junit.framework.Assert;
import pages.AmazonHomePage;
import pages.AmazonLoginPage;
import pages.AmazonLogoutpage;

public class AmazonTestLoginPage {
WebDriver driver;

AmazonLoginPage loginpage;
AmazonHomePage homepage;
AmazonLogoutpage logoutpage;
WaitFor wait=new WaitFor();
GenericLibrary generic=new GenericLibrary();



public void setup()
{
	String driverpath=generic.getDriverPath();
	System.setProperty("webdriver.chrome.driver",driverpath);  
    driver = new ChromeDriver();	
    wait.implictwait(driver,10);
    driver.manage().window().maximize();	
    
    driver.get(generic.getUrl());
    
 }	
	

/**

 * This test case will login in https://www.amazon.in 
 
 * Login to the application

 */

public void test_amazon_login_page(String username,String password)
{
    //Create Login Page object
	loginpage = new AmazonLoginPage(driver);
	wait.implictwait(driver,10);
	//login to application
	loginpage.login_to_amazon_website(username, password);
	
	
}
/**

 * This test case will mouse over on category and electronics items 
 
 * click on television link 
 * Add television  to cart
   proceed to checkout
 */

public void test_amazon_home_page()
{
	//go to homepage
	homepage= new AmazonHomePage(driver);
	//mouse over on category
	homepage.Mouse_over_on_category();
	//mouse over on electronics items
	homepage.mouse_over_on_elextronics();
	//click on television link
	wait.implictwait(driver,20);
	homepage.click_on_television_link();
	//add television to cart
	homepage.add_television_to_cart();
	//click on cart button
	homepage.click_on_cart_button();
	//click on proceed to checkout
	homepage.click_on_proceed_to_checkout();
	//click on link deliver to the address
	//homepage.click_on_deliver_to_the_address();
	
}
/**

 *close the browser
 */
public void close_the_browser(){
	logoutpage= new AmazonLogoutpage(driver);
}




}
