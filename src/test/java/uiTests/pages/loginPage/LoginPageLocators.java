package uiTests.pages.loginPage;

import org.openqa.selenium.By;

public class LoginPageLocators {
    protected static final String URL = "https://music.yandex.ru/home";
    protected static final By ENTER_BUTTON = By.xpath("/html/body/div[1]/div[6]/div/div[2]/a");
    protected static final By LOGIN_INPUT = By.id("passp-field-login");
    protected static final By LOGIN_BUTTON = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[3]/div[2]/div/div/div[1]/form/div[3]");
    protected static final By PASSWORD_INPUT = By.id("passp-field-passwd");
    protected static final By PASS_BUTTON = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[3]/div[2]/div/div/form/div[3]/button");
    protected static final By PASS_ALERT_MESSAGE = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[3]/div[2]/div/div/form/div[2]/div/div[2]");
    protected static final By LOGIN_ALERT_MESSAGE = By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[3]/div[2]/div/div/div[1]/form/div[1]/div[2]");
}
