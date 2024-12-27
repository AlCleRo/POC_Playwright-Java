package com.playwright.bdd.pageobjects;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.AriaRole;

public class HomePage {

    private final Locator textBox;
    private final Locator quickFindButton;


    public HomePage(Page page) {
        this.textBox = page.getByRole(AriaRole.TEXTBOX);
        this.quickFindButton = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Quick Find"));
    }

    public void clickTextBox() {
        textBox.click();
    }

    public void fillTextBox(String item) {
        textBox.fill(item);
    }

    public void clickQuickFind() {
        quickFindButton.click();
    }

}
