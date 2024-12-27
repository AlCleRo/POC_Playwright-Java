package com.playwright.bdd.steps;

import com.microsoft.playwright.Page;
import com.playwright.bdd.pageobjects.HomePage;
import com.playwright.bdd.pageobjects.SearchResultsPage;
import com.playwright.bdd.pageobjects.ShoppingCartPage;
import com.playwright.bdd.pageobjects.LoginPage;
import com.playwright.bdd.pageobjects.DeliveryInformationPage;
import com.playwright.bdd.pageobjects.PaymentInformationPage;
import com.playwright.bdd.pageobjects.OrderConfirmationPage;
import com.playwright.bdd.pageobjects.OrderProcessedPage;

public class PageObjectManager {

    private final HomePage homePage;
    private final SearchResultsPage searchResultsPage;
    private final ShoppingCartPage shoppingCardPage;
    private final LoginPage loginPage;
    private final DeliveryInformationPage deliveryInformationPage;
    private final PaymentInformationPage paymentInformationPage;
    private final OrderConfirmationPage orderConfirmationPage;
    private final OrderProcessedPage orderProcessedPage;

    public PageObjectManager(Page page) {
        this.homePage = new HomePage(page);
        this.searchResultsPage = new SearchResultsPage(page);
        this.shoppingCardPage = new ShoppingCartPage(page);
        this.loginPage = new LoginPage(page);
        this.deliveryInformationPage = new DeliveryInformationPage(page);
        this.paymentInformationPage = new PaymentInformationPage(page);
        this.orderConfirmationPage = new OrderConfirmationPage(page);
        this.orderProcessedPage = new OrderProcessedPage(page);
    }

    public HomePage getHomePage() {
        return homePage;
    }

    public SearchResultsPage getSearchResultsPage() {
        return searchResultsPage;
    }

    public ShoppingCartPage getShoppingCardPage() {
        return shoppingCardPage;
    }

    public LoginPage getLoginPage() {
        return loginPage;
    }

    public DeliveryInformationPage getDeliveryInformationPage() {
        return deliveryInformationPage;
    }

    public PaymentInformationPage getPaymentInformationPage() {
        return paymentInformationPage;
    }

    public OrderConfirmationPage getOrderConfirmationPage() {
        return orderConfirmationPage;
    }

    public OrderProcessedPage getOrderProcessedPage() {
        return orderProcessedPage;
    }
}
