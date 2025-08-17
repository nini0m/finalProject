package org.example.tests;

import org.example.BaseTest;
import org.example.pages.LanguagePage;
import org.testng.Assert;
import org.testng.annotations.Test;


//switches language to English and checks if it is changed correctly
public class LanguageTest extends BaseTest {

    @Test
    public void changeLanguageToEnglish() {
        LanguagePage languagePage = new LanguagePage(driver);

        languagePage.switchLanguage();

        String actualText = languagePage.getHotlineText();
        String expectedText = "hot line";

        Assert.assertEquals(actualText, expectedText, "Language did not switch to English correctly");
    }
}
