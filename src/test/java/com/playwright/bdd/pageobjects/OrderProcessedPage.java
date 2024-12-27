package com.playwright.bdd.pageobjects;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;


public class OrderProcessedPage {

    private final Locator headingOrderProcessed;

    public OrderProcessedPage(Page page) {
        this.headingOrderProcessed = page.getByRole(AriaRole.HEADING, new Page.GetByRoleOptions().setName("Your Order Has Been Processed!"));
    }

    public void verifyOrder(String confirmationMessage) {
        assertThat(headingOrderProcessed).hasText(confirmationMessage);
    }

}
