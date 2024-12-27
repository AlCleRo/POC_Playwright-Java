package com.playwright.bdd.steps;

import com.microsoft.playwright.*;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.apache.log4j.Logger;
import java.nio.file.Paths;

public class Init {

    private Playwright playwright;
    private Browser browser;
    private Page page;
    private PageObjectManager pageObjectManager;
    private BrowserContext browserContext;

    @Before
    public void before() {

        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        browserContext = browser.newContext();
        page = browserContext.newPage();
        page.navigate("<webpage_url>");
        pageObjectManager = new PageObjectManager(page);

    }

    @After
    public void after() {
        page.close();
        browser.close();
        playwright.close();
    }

    public PageObjectManager getPageObjectManager() {
        return pageObjectManager;
    }

}
