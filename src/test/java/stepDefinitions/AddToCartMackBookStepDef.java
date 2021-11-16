package stepDefinitions;

import org.junit.Assert;

import core.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import freemarker.log.Logger;
import pageObject.AddToCartPageObject;
import utilities.WebDriverUtility;

public class AddToCartMackBookStepDef extends Base {

	AddToCartPageObject macBook = new AddToCartPageObject();

	@Given("^open Retail website$")
	public void open_Retail_website() {
		openBrowser();
		logger.info("Retail website is opened");
	}

	@When("^user click on Laptops&NoteBooks$")
	public void user_click_on_Laptops_NoteBooks() {
		macBook.clickOnLaptopsAndNoteBooks();
		logger.info("user clicked on Laptops&NoteBooks");
	}

	@When("^User click on ShowAllLaptops&NoteBooks$")
	public void user_click_on_ShowAllLaptops_NoteBooks() {
		macBook.clickOnShowAllLaptopsAndNoteBooks();
		logger.info("user clicked on showAllLaptops&NoteBooks");
	}

	@When("^User click on Macbook$")
	public void user_click_on_Macbook() {
		macBook.clickOnMacBook();
		logger.info("User clicked on macBook");
	}

	@When("^User click on Add to cart$")
	public void user_click_on_Add_to_cart() {
		macBook.clickOnAddToCart();
		logger.info("User clicked on add to Cart");
	}

	@Then("^verify the success message ‘Success: You have added’$")
	public void verify_the_success_message_Success_You_have_added() {
		String actual = "Success: You have added";
		String expected = macBook.VeryfiySuccesMessage();
		
		Assert.assertEquals(actual.substring(0, 7), expected.substring(0, 7));
		logger.info("the Success message is displayed");
		WebDriverUtility.screenShot();

	}

}
