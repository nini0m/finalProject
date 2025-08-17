package org.example;

import org.example.utils.ConfigReader;
import org.example.utils.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected WebDriver driver;


    @BeforeMethod
    public void setup() {
        driver = DriverManager.getDriver();
        driver.manage().window().maximize();
        String baseUrl = ConfigReader.get("baseUrl");
        driver.get(baseUrl);
    }


    @AfterMethod
    public void tearDown() {
        DriverManager.quitDriver();
    }
}
