package org.example.pages;

import org.example.BasePage;
import org.example.utils.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ChatPage extends BasePage {

    public ChatPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }


    //open chat
    @FindBy(xpath = "//jdiv[contains(@class,'button')]")
    WebElement chatOpenButton;


    //input text in chat
    @FindBy(css = "textarea[placeholder='Type here']")
    WebElement messageInput;


    //send button
    @FindBy(xpath = "//jdiv[@class='sendButton__JPZZP']")
    WebElement arrowSendButton;


    //name field
    @FindBy(name = "name")
    WebElement nameField;


//waits until element is visible
    private void waitForVisibility(WebElement element) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(element));
    }


//opens the chat window
    public void openChat() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(chatOpenButton));
        chatOpenButton.click();
        waitForVisibility(messageInput);
        Utils.logInfo("Chat window opened");
    }


//types text message in the chat input
    public void typeMessage(String text) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(messageInput));
        messageInput.clear();
        messageInput.sendKeys(text);
        Utils.logInfo("Typed message: " + text);
    }


//clicks send button
    public void clickSendArrow() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement sendButton = wait.until(ExpectedConditions.elementToBeClickable(arrowSendButton));
        sendButton.click();
        Utils.logInfo("Clicked send button");
    }


//waits until name input field is visible
    public void waitForNameField() {
        waitForVisibility(nameField);
    }


//checks if the name input field is visible
    public boolean isNameFieldVisible() {
        return nameField.isDisplayed();
    }

}
