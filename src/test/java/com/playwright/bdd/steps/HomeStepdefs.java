package com.playwright.bdd.steps;

import io.cucumber.java.en.Given;
import com.playwright.bdd.pageobjects.HomePage;
import com.playwright.bdd.pageobjects.SearchResultsPage;
import com.playwright.bdd.pageobjects.ShoppingCartPage;

public class HomeStepdefs {

    private final HomePage homePage;
    private final SearchResultsPage searchResultsPage;
    private final ShoppingCartPage shoppingCartPage;

    public HomeStepdefs(Init init) {
        this.homePage = init.getPageObjectManager().getHomePage();
        this.searchResultsPage = init.getPageObjectManager().getSearchResultsPage();
        this.shoppingCartPage = init.getPageObjectManager().getShoppingCardPage();
    }

    @Given("the user purchase an item {string} with a quantity {string}")
    public void theUserSelectsAnItemWithAQuantity(String item, String quantity) {
        homePage.clickTextBox();
        homePage.fillTextBox(item);
        homePage.clickQuickFind();
        searchResultsPage.clickProduct();
        shoppingCartPage.updateQuantity(quantity);
        shoppingCartPage.clickCheckout();
    }
}
