package com.playwright.bdd.pageobjects;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.AriaRole;

public class DeliveryInformationPage {

    private final Locator continueButton;

    public DeliveryInformationPage(Page page) {
        this.continueButton = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue"));
    }

    public void clickContinueOnDeliveryInformation() {
        continueButton.click();
    }

}
