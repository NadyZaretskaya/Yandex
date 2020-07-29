package uiTests.pages;

import io.qameta.allure.Step;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import uiTests.driver.DriverSingleton;
import uiTests.pages.homePage.HomePage;
import utils.Waiters;

import java.util.ArrayList;


public class Page {
    private final Logger log = LogManager.getRootLogger();
    protected WebDriver webDriver = DriverSingleton.getDriver();
    private ArrayList<String> tabs;

    protected WebElement findElement(By by) {
        return webDriver.findElement(by);
    }

    protected void waitForElementVisible(By by) {
        Waiters.waitForElementVisible(webDriver, by);
     }

    protected void waitForElementClickable(By by) {
        Waiters.waitForElementClickable(webDriver, by);
    }

    public String getCurrentUrl() {
        return webDriver.getCurrentUrl();
    }

    @Step("Open {pageURL}")
    public void open(String pageURL) {
        webDriver.get(pageURL);
    }

    protected void clickButton(By by) {
        waitForElementVisible(by);
        findElement(by).click();
    }

    protected void enterText(By by, String text) {
        findElement(by).sendKeys(text);
    }

    protected String getText(By by) {
        waitForElementVisible(by);
        return findElement(by).getText();
    }

//    public void pressEnter() {
//        webDriver.sendKeys(Keys.ENTER);
//    }

    public HomePage getTab(int tab) {
        if (tabs == null) {
            tabs = new ArrayList<>(webDriver.getWindowHandles());
        }
        webDriver.switchTo().window(tabs.get(tab));
        return new HomePage();
    }


//    String Tab1 = webDriver.getWindowHandle();
//    ArrayList<String> availableWindows = new ArrayList<String>(webDriver.getWindowHandles());
//    if (!availableWindows.isEmpty()) {
//        webDriver.switchTo().window(availableWindows.get(1));
//    }
////
//    protected boolean elementIsDisplayed(By by) {
//        try {
//            Waiters.waitForElementVisible(webDriver, by);
//            return findElement(by).isDisplayed();
//        } catch (NoSuchElementException e) {
//            log.error(e.getMessage());
//            return false;
//        }
//    }
//        protected void waitForElementVisibility(By locator) {
//        new WebDriverWait(webDriver, 20).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
//    }
//
//    protected void waitForElementToBeClickable(By locator) {
//        new WebDriverWait(webDriver, 20).until(ExpectedConditions.elementToBeClickable(locator));
//    }


}
