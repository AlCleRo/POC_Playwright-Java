package com.playwright.bdd.pageobjects;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.AriaRole;

public class SearchResultsPage {

    private final Locator continueButton;

    public SearchResultsPage(Page page) {
        this.continueButton = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Buy Now"));
    }

    public void clickProduct() {
        continueButton.click();
    }

}

