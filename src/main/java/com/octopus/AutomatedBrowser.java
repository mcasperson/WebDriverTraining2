package com.octopus;

import org.openqa.selenium.WebDriver;

public interface AutomatedBrowser {

    WebDriver getWebDriver();

    void setWebDriver(WebDriver webDriver);

    void init();

    void destroy();

    void goTo(String url);

    void clickElementWithId(String id);

    void clickElementWithId(String id, int waitTime);

    void selectOptionByTextFromSelectWithId(String optionText, String id);

    void selectOptionByTextFromSelectWithId(String optionText, String id, int waitTime);

    void populateElementWithId(String id, String text);

    void populateElementWithId(String id, String text, int waitTime);

    String getTextFromElementWithId(String id);

    String getTextFromElementWithId(String id, int waitTime);

    void clickElementWithXPath(String xpath);

    void clickElementWithXPath(String xpath, int waitTime);

    void selectOptionByTextFromSelectWithXPath(String optionText, String xpath);

    void selectOptionByTextFromSelectWithXPath(String optionText, String xpath, int waitTime);

    void populateElementWithXPath(String xpath, String text);

    void populateElementWithXPath(String xpath, String text, int waitTime);

    String getTextFromElementWithXPath(String xpath);

    String getTextFromElementWithXPath(String xpath, int waitTime);

    void clickElementWithCSSSelector(String cssSelector);

    void clickElementWithCSSSelector(String cssSelector, int waitTime);

    void selectOptionByTextFromSelectWithCSSSelector(String optionText, String cssSelector);

    void selectOptionByTextFromSelectWithCSSSelector(String optionText, String cssSelector, int waitTime);

    void populateElementWithCSSSelector(String cssSelector, String text);

    void populateElementWithCSSSelector(String cssSelector, String text, int waitTime);

    String getTextFromElementWithCSSSelector(String cssSelector);

    String getTextFromElementWithCSSSelector(String cssSelector, int waitTime);
}