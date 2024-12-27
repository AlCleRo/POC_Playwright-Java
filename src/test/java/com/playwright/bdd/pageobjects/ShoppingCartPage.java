package com.playwright.bdd.pageobjects;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.AriaRole;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class ShoppingCartPage {

    private final Locator quantityBox;
    private final Locator updateButton;
    private final Locator checkOutButton;

    public ShoppingCartPage(Page page) {
        this.quantityBox = page.locator("input[name=\"cart_quantity\\[\\]\"]");
        this.updateButton = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Update"));
        this.checkOutButton = page.locator("#bodyContent").getByRole(AriaRole.BUTTON, new Locator.GetByRoleOptions().setName("Checkout"));
    }

    public void updateQuantity(String quantity) {
        quantityBox.click();
        quantityBox.fill(quantity);
        updateButton.click();
        assertThat(quantityBox).hasValue(quantity);

    }

    public void clickCheckout() {
        checkOutButton.click();
    }

}
