package uiTests.tests;

import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import uiTests.businessObjects.User;
import uiTests.pages.homePage.HomePage;
import uiTests.pages.loginPage.LogInPage;

public class LoginTest extends BaseTest{
    private static final User VALID_USER = new User("Надя Зарецкая", "ko6ka.n@gmail.com",
            "superstar");

    private LogInPage logInPage;
    private HomePage homePage;

    @BeforeMethod
    public void setup() {
        logInPage = new LogInPage();
        logInPage.open();
    }

    @AfterMethod
    public void tearDown() {
        super.tearDown();
        logInPage = null;
        homePage = null;
    }

    /* 1. В поле "Логин" ввести валидный логин и нажать кнопку "Войти".
           2. В поле "Пароль" ввести валидный пароль и нажать кнопку "Войти".
           ОР: Пользователь перенаправлен на главную страницу и авторизован под своим именем.
         */
//    @Test(description = "Log in to Yandex music")
//    @Issue("1")
//    @TmsLink("Post-1")
//    @Epic("Yandex music")
//    @Story("Log in with valid credentials")
//    @Severity(SeverityLevel.CRITICAL)
//    public void logInWithValidValues() {
//        logInPage.enterValueInLogInField(VALID_USER.getLogin());
//        logInPage.clickLogInButton();
//        logInPage.enterValueInPasswordField(VALID_USER.getPassaword());
//        logInPage.clickPasswordButton();
//        homePage = logInPage.getTab(0);
////       homePage.getUserName();
//
//       Assert.assertEquals(VALID_USER.getUserName(), homePage.getUserName());
//
//    }

    /* В поле "Логин" ввести валидный логин и нажать кнопку "Войти".
         ОР: Пользователь остался на странице авторизации и появилось сообщение о некорректно введенных данных.
     */
    @Test(description = "Log in to Yandex music")
    @Issue("2")
    @TmsLink("Post-2")
    @Epic("Yandex music")
    @Story("Log in with empty login")
    @Severity(SeverityLevel.CRITICAL)
    public void logInWithEmptyLogin() {
        logInPage.enterValueInLogInField("");
        logInPage.clickLogInButton();

        Assert.assertTrue(logInPage.isLoginAlertMessageDisplayed());
    }

    /* 1. В поле "Логин" ввести валидный логин и нажать кнопку "Войти".
        2. Поле "Пароль" оставить пустым и нажать кнопку "Войти".
        ОР: Пользователь остался на странице ввода кода авторизации и появилось сообщение о некорректно введенных данных.
     */
    @Test(description = "Log in to Yandex music")
    @Issue("3")
    @TmsLink("Post-3")
    @Epic("Yandex music")
    @Story("Log in without password")
    @Severity(SeverityLevel.CRITICAL)
    public void logInWithEmptyPassword() {
         logInPage.enterValueInLogInField(VALID_USER.getLogin());
        logInPage.clickLogInButton();
        logInPage.enterValueInPasswordField("");
        logInPage.clickPasswordButton();
        Assert.assertTrue(logInPage.isPasswordAlertMessageDisplayed());
    }

}
