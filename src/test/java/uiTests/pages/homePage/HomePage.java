package uiTests.pages.homePage;

import io.qameta.allure.Step;
import uiTests.pages.Page;
import static uiTests.pages.homePage.HomePageLocators.*;

public class HomePage extends Page {

    @Step("Get user's name on Home page")
    public String getUserName() {
        clickButton(USER_ICON);
        waitForElementVisible(USER_NAME);
        return findElement(USER_NAME).getText();
    }



}
