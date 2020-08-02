package uiTests.pages.loginPage;

import io.qameta.allure.Step;
import uiTests.pages.Page;
import uiTests.pages.homePage.HomePage;

import static uiTests.pages.loginPage.LoginPageLocators.*;

public class LogInPage extends Page {

    @Step("Open {pageURL}")
    public void open() {
        super.open(URL);
        clickButton(ENTER_BUTTON);
        getTab(1);
    }

    @Step("Entering {value} in Login field")
    public void enterValueInLogInField(String value) {
        enterText(LOGIN_INPUT, value);
    }

    @Step("Entering {value} in Password field")
    public void enterValueInPasswordField(String value) {
        enterText(PASSWORD_INPUT, value);
    }

    @Step("Click \"Войти\" button on Login page")
    public HomePage clickLogInButton() {
        clickButton(LOGIN_BUTTON);
        return new HomePage();
    }

    @Step("Click \"Войти\" button on Login page")
    public HomePage clickPasswordButton() {
        clickButton(PASS_BUTTON);
        return new HomePage();
    }

    @Step("Check if alert 'No password entered' message is displayed")
    public Boolean isPasswordAlertMessageDisplayed() {
        waitForElementVisible(PASS_ALERT_MESSAGE);
        return findElement(PASS_ALERT_MESSAGE).isDisplayed();
    }

    @Step("Check if alert 'No login entered' message is displayed")
    public Boolean isLoginAlertMessageDisplayed() {
        waitForElementVisible(LOGIN_ALERT_MESSAGE);
        return findElement(LOGIN_ALERT_MESSAGE).isDisplayed();
    }
}
