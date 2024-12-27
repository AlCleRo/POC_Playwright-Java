package com.playwright.bdd.pageobjects;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.AriaRole;

public class LoginPage {

    private final String email = "<email>";
    private final String password = "<password>";
    private final Locator emailTextBox;
    private final Locator passwordTextBox;
    private final Locator singInButton;

    public LoginPage(Page page) {
        emailTextBox = page.locator("input[name=\"email_address\"]");
        passwordTextBox = page.locator("input[name=\"password\"]");
        singInButton = page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Sign In"));
    }

    public void fillCredentials() {
        emailTextBox.click();
        emailTextBox.fill(email);
        passwordTextBox.click();
        passwordTextBox.fill(password);
        singInButton.click();
    }

}
