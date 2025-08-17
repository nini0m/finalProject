package org.example;

import org.example.utils.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;

public class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;


    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }


//clicks on an element after waiting for it to be clickable
    public void clickToElement(WebElement locator) {
        waitForElementToBeClickable(locator);
        locator.click();
        Utils.logInfo("click to element: " + locator);
    }


//waits until element is clickable
    public void waitForElementToBeClickable(WebElement locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator));
        Utils.logInfo("waiting " + locator + " if it is clickable");
    }


//waits until element is visible
    public void waitForElementToBeVisible(WebElement locator) {
        wait.until(ExpectedConditions.visibilityOf(locator));
        Utils.logInfo("waiting element: " + locator);
    }


//asserts equality of expected and actual strings
    public void assertEquals(String expected, String actual) {
        Assert.assertEquals(actual, expected);
    }


//gets css value of a property from an element
    public String getCssValue(WebElement locator, String propertyName) {
        waitForElementToBeVisible(locator);
        Utils.logInfo("Property name is: " + propertyName);
        return locator.getCssValue(propertyName);
    }


//enters text after waiting for it to be visible
    public void sendKeysToElement(WebElement element, String text) {
        wait.until(ExpectedConditions.visibilityOf(element));
        element.clear();
        element.sendKeys(text);
    }


}
