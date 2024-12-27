package com.playwright.bdd.cucumber.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"com.playwright.bdd"},
        monochrome = true,
        tags = "@regression",
        plugin = {"pretty",
                "json:target/cucumber-report/cucumber.json",
                "html:target/reports/cucumber/cucumber.html",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
        }
)

public class CucumberTestRunner {
}
