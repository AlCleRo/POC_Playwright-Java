package com.playwright.bdd.steps;

import com.playwright.bdd.pageobjects.LoginPage;
import io.cucumber.java.en.And;

public class LoginStepdefs {

    private final LoginPage loginPage;

    public LoginStepdefs(Init init) {
        this.loginPage = init.getPageObjectManager().getLoginPage();
    }

    @And("sign in filling his credentials")
    public void accessToLoginPage() {
        loginPage.fillCredentials();
    }

}
