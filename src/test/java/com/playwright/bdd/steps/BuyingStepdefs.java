package com.playwright.bdd.steps;

import io.cucumber.java.en.Then;
import com.playwright.bdd.pageobjects.DeliveryInformationPage;
import com.playwright.bdd.pageobjects.PaymentInformationPage;
import com.playwright.bdd.pageobjects.OrderConfirmationPage;
import com.playwright.bdd.pageobjects.OrderProcessedPage;
import io.cucumber.java.en.When;

public class BuyingStepdefs {

    private final DeliveryInformationPage deliveryInformationPage;
    private final PaymentInformationPage paymentInformationPage;
    private final OrderConfirmationPage orderConfirmationPage;
    private final OrderProcessedPage orderProcessedPage;

    public BuyingStepdefs(Init init) {
        this.deliveryInformationPage = init.getPageObjectManager().getDeliveryInformationPage();
        this.paymentInformationPage = init.getPageObjectManager().getPaymentInformationPage();
        this.orderConfirmationPage = init.getPageObjectManager().getOrderConfirmationPage();
        this.orderProcessedPage = init.getPageObjectManager().getOrderProcessedPage();
    }

    @When("the user confirms the order with cash on delivery as payment method")
    public void theUserConfirmsTheOrderWithCashOnDeliveryAsPaymentMethod() {
        deliveryInformationPage.clickContinueOnDeliveryInformation();
        paymentInformationPage.clickCashOnDeliveryOption();
        paymentInformationPage.clickContinueOnPaymentInformation();
        orderConfirmationPage.clickConfirmOrder();
    }

    @Then("the homepage is displayed with message {string}")
    public void theHomepageIsDisplayedWithMessageYourOrderHasBeenProcessed(String msg) {
        orderProcessedPage.verifyOrder(msg);
    }

}
