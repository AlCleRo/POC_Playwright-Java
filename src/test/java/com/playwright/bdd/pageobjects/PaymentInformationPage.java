package com.playwright.bdd.pageobjects;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.AriaRole;

public class PaymentInformationPage {

    private final Locator cashOnDeliveryOption;
    private final Locator continueButton;

    public PaymentInformationPage(Page page) {
        this.cashOnDeliveryOption = page.getByRole(AriaRole.ROW, new Page.GetByRoleOptions().setName("Cash on Delivery")).getByRole(AriaRole.RADIO);
        this.continueButton = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue"));
    }

    public void clickCashOnDeliveryOption() {
        cashOnDeliveryOption.check();
    }

    public void clickContinueOnPaymentInformation() {
        continueButton.click();
    }

}
