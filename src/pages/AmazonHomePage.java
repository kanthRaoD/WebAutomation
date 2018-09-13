package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Wait.WaitFor;

public class AmazonHomePage {

	WebDriver driver;
	WebElement element;
	WaitFor wait = new WaitFor();
	By mouseover_on_category = By.xpath("//*[@id='nav-link-shopall']/span[2]");
	By mouseover_on_elextronics_items = By.xpath("//*[@id='nav-flyout-shopAll']/div[2]/span[7]/span");
	By clickontelevision = By.xpath("//*[@id='nav-flyout-shopAll']/div[3]/div[7]/div[1]/div/a[1]/span");
	By Add_television_to_cart = By
			.xpath("//*[@id='100_dealView_1']/div/div[2]/div/div/div[8]/div/span/span/span/button");
	By click_on_cart = By.xpath("//*[@id='nav-cart']");
	By click_on_proceed_to_checkout = By.xpath("//*[@id='sc-buy-box-ptc-button']/span/input");
	By click_on_deliver_to_the_address = By.xpath("//*[@id='address-book-entry-0']/div[2]/span/a");

	public AmazonHomePage(WebDriver driver) {
		this.driver = driver;
	}

	public void Mouse_over_on_category() {
		Actions builder = new Actions(driver);
		element = driver.findElement(mouseover_on_category);
		builder.moveToElement(element).build().perform();
	}

	public void mouse_over_on_elextronics() {
		Actions builder = new Actions(driver);
		element = driver.findElement(mouseover_on_elextronics_items);
		builder.moveToElement(element).build().perform();
	}

	public void click_on_television_link() {

		driver.findElement(clickontelevision).click();
	}

	public void add_television_to_cart() {

		wait.explictwait(driver, Add_television_to_cart);
		driver.findElement(Add_television_to_cart).click();
	}

	public void click_on_cart_button() {

		driver.findElement(click_on_cart).click();

	}

	public void click_on_proceed_to_checkout() {
		driver.findElement(click_on_proceed_to_checkout).click();
		;
	}

	public void click_on_deliver_to_the_address() {
		driver.findElement(click_on_deliver_to_the_address).click();
	}

}
