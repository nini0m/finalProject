package org.example.pages;

import org.example.BasePage;
import org.example.utils.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends BasePage {

    public CartPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }


    @FindBy(css = "button svg[viewBox='0 0 16 16']")
    WebElement removeButton;

    @FindBy(css = "img[src='/icons/empty-cart.svg']")
    WebElement emptyCartImage;



//clicks remove from cart button
    public void removeProductFromCart() {
        clickToElement(removeButton);
        Utils.logInfo("Clicked remove button to delete product from cart");
    }


//checks if the cart is empty
    public boolean isCartEmpty() {
        try {
            waitForElementToBeVisible(emptyCartImage);
            return emptyCartImage.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

}
