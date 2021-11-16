package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class AddToCartPageObject extends Base{

	public AddToCartPageObject() {
		PageFactory.initElements(driver, this);
	}
	
@FindBy(xpath = "//a[text()='Laptops & Notebooks']")
private WebElement laptopsAndNoteBooks;

@FindBy(xpath = "//a[text()='Show All Laptops & Notebooks']")
private WebElement showAlllaptopsAndNoteBooks;

@FindBy(xpath = "(//img[@class='img-responsive'])[3]")
private WebElement macBook;

@FindBy(xpath = "//button[text()='Add to Cart']")
private WebElement addToCart;

@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
private WebElement verifyMessage;


public void clickOnLaptopsAndNoteBooks() {
	laptopsAndNoteBooks.click();
	
}

public void clickOnShowAllLaptopsAndNoteBooks() {
	showAlllaptopsAndNoteBooks.click();
}

public void clickOnMacBook() {
	macBook.click();
}

public void clickOnAddToCart() {
	addToCart.click();
}

public String VeryfiySuccesMessage() {
	String message = verifyMessage.getText();
	return message;
}

















	
}
