package org.example.tests;

import org.example.BaseTest;
import org.example.pages.MainPage;
import org.testng.annotations.Test;
import org.example.pages.SearchResultsPage;


//tests searching for a product and adding the first product from search results to the cart
public class SearchResultsTest extends BaseTest {


    @Test
    public void searchMacbookAndAddProductToCart() {
        MainPage mainPage = new MainPage(driver);
        mainPage.searchProduct("macbook");

        SearchResultsPage resultsPage = new SearchResultsPage(driver);
        resultsPage.addInStockProductToCart();
    }
}
