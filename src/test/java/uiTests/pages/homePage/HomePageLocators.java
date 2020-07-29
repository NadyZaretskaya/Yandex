package uiTests.pages.homePage;

import org.openqa.selenium.By;

public class HomePageLocators {
    protected static final By USER_ICON = By.cssSelector("head__user > user head__userpic");
    protected static final By USER_NAME = By.xpath("/html/body/div[16]/div/ul/li[2]/span/span/div");

    protected static final String HOME_PAGE_URL = "https://idemo.bspb.ru/welcome";
   }
