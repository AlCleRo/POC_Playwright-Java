package com.playwright.bdd.pageobjects;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.AriaRole;

public class OrderConfirmationPage {

    private final Locator confirmOrderButton;

    public OrderConfirmationPage(Page page) {
        confirmOrderButton = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Confirm Order"));
    }

    public void clickConfirmOrder() {
        confirmOrderButton.click();
    }

}
