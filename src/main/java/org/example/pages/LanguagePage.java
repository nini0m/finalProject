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

public class LanguagePage extends BasePage {

    public LanguagePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }


    //language selector
    @FindBy(css = "div.sc-b8c3bfcd-1.dgWBrp")
    WebElement languageButton;


    //dropdown language option - English
    @FindBy(css = "div.sc-b8c3bfcd-2.cQewSh a.cfuMWQ")
    WebElement englishOption;


    //hotline element
    @FindBy(css = "span.sc-3298a860-11.kOpmBt")
    WebElement hotlineText;



    //waits until element is visible
    public void waitForVisibility(WebElement element) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(element));
    }


    //switches language from Georgian to English
    public void switchLanguage() {
        waitForVisibility(languageButton);
        Utils.logInfo("Opening language dropdown");
        languageButton.click();

        waitForVisibility(englishOption);
        Utils.logInfo("Selecting English language");
        englishOption.click();
        Utils.logInfo("Language switched to English");
    }


    //gets text of the hotline element
    public String getHotlineText() {
        waitForVisibility(hotlineText);
        return hotlineText.getText();
    }





}
