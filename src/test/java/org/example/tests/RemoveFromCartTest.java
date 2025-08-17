package org.example.tests;

import org.example.BaseTest;
import org.example.pages.CartPage;
import org.example.pages.MainPage;
import org.example.pages.SearchResultsPage;
import org.testng.Assert;
import org.testng.annotations.Test;


//tests removing a product from the cart
public class RemoveFromCartTest extends BaseTest {


    @Test
    public void removeProductFromCart() {
        MainPage mainPage = new MainPage(driver);
        mainPage.searchProduct("macbook");

        SearchResultsPage resultsPage = new SearchResultsPage(driver);
        resultsPage.addInStockProductToCart();

        resultsPage.goToCart();

        CartPage cartPage = new CartPage(driver);
        cartPage.removeProductFromCart();

        Assert.assertTrue(cartPage.isCartEmpty(), "კალათა არ არის ცარიელი");
    }
}
