package org.example.pages;

import org.example.BasePage;
import org.example.utils.Utils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BasePage {

    public MainPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }


    @FindBy(css = "span.sc-3298a860-11.kOpmBt")
    WebElement hotLineText;


    @FindBy(css = "input[placeholder='ძიება...']")
    WebElement searchInput;



//gets CSS color value of the hotline text
    public String getHotLineTextColor() {
        Utils.logInfo(getCssValue(hotLineText, "color"));
        return getCssValue(hotLineText, "color");
    }


//types search text in the search input
    public void enterSearchText(String productName) {
        sendKeysToElement(searchInput, productName);
    }


//searches for a product
    public void searchProduct(String productName) {
        enterSearchText(productName);
        searchInput.sendKeys(Keys.ENTER);
    }
}
