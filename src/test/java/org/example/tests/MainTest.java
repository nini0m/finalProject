package org.example.tests;

import org.example.BaseTest;
import org.example.pages.MainPage;
import org.testng.annotations.Test;


//tests that hotline text color on the main page matches the expected color value
public class MainTest extends BaseTest {

    @Test
    public void testLoginButtonTextColor() {
        MainPage mainPage = new MainPage(driver);
        String expectedColor = "rgba(111, 120, 141, 1)";
        String actualColor = mainPage.getHotLineTextColor();
        mainPage.assertEquals(expectedColor, actualColor);
    }
}
