package com.pages;

import com.utils.BrowserUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class DashboardPage extends BrowserUtility {

    private  static final By PENDING_FOR_DELIVERY_LOCATOR = By
            .xpath("//div[contains(text(),\"Pending for delivery\")]/../div/button") ;

    private static final By SEARCH_TEXTBOX_LOCATOR = By.xpath("//input[@placeholder=\"Search for a Job or IMEI\"]");
    private static final By USER_PROFILE_ICON_LOCATOR = By.xpath("//user/button");
    private static final By USER_PROFILE_NAME_LOCATOR = By.xpath("//span[contains(text(),\"Signed in as\")]/../span[2]");
    private static final By CREATE_JOB_LINK_LOCATOR = By.xpath("//span[contains(text(), \"Create Job\")]/../../..");


    public  DashboardPage(WebDriver wd){
        super(wd);

    }
    public String getTotalPendingForDeliveryJobsCount(){

        sleep(4);
       String data =  getVisibleText(PENDING_FOR_DELIVERY_LOCATOR);
       return data;

    }

    public  String getUSerName(){
        clickOnButton(USER_PROFILE_ICON_LOCATOR);
        String data =getVisibleText(USER_PROFILE_NAME_LOCATOR);
        return data;

    }

    public CreateJobPage goToCreateJobPage(){
        clickOnButton(CREATE_JOB_LINK_LOCATOR);
        CreateJobPage createJobPage =  new CreateJobPage(getWd());
        return CreateJobPage ;
    }

    public GlobalListPage searchJobUsing (String imeiOrJobNumber){
        enterText(SEARCH_TEXTBOX_LOCATOR, imeiOrJobNumber);
        enterSpecialKey(SEARCH_TEXTBOX_LOCATOR, Keys.ENTER);
        GlobalListPage globalList = new GlobalListPage(getWd());
        return globalList;

    }
}