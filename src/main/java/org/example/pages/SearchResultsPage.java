package org.example.pages;

import org.example.BasePage;
import org.example.utils.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SearchResultsPage extends BasePage {


    public SearchResultsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//span[text()='მარაგში']/ancestor::div[contains(@class,'sc-3ff391e0-9')]//button[@aria-label='Add to cart']")
    WebElement inStockAddToCartButton;


    @FindBy(css = "button svg")
    WebElement cartButton;



//adds found product to the cart
    public void addInStockProductToCart() {
        waitForElementToBeClickable(inStockAddToCartButton);
        Utils.logInfo("Clicking 'Add to Cart' button for an in-stock product");
        inStockAddToCartButton.click();
    }


//clicks the cart button to go to the cart page
    public void goToCart() {
        Utils.logInfo("Clicking on the cart button to go to the cart page");
        clickToElement(cartButton);
    }

}
