package com.pages;

import com.utils.BrowserUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public final class LoginPage extends BrowserUtility {

    private static final By USER_NAME_TEXTBOX_LOCATOR = By.id("username");
    private static final By PASSWORD_TEXTBOX_LOCATOR = By.id("password");
    private static final By SIGIN_BUTTON_LOCATOR = By.xpath("//span[contains(text(),'Sign in')]/../..");

    public LoginPage(WebDriver wd) {
        super();
        goToWebsite("http://phoenix.testautomationacademy.in/sign-in");
    }

    public LoginPage(){
        super();
        goToWebsite("http://phoenix.testautomationacademy.in/sign-in");
    }
   public DashboardPage  doLoginAs(String userName, String password) {
       enterText(USER_NAME_TEXTBOX_LOCATOR, userName);
       enterText(PASSWORD_TEXTBOX_LOCATOR, password);
       clickOnButton(SIGIN_BUTTON_LOCATOR);
       DashboardPage dashboardPage = new DashboardPage(getWd());
       return dashboardPage;
   }


}
