package com.pages;

import com.POJO.CustomerDataPOJO;
import com.utils.BrowserUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateJobPage extends BrowserUtility {
    private static final By OEM_DROPDOWN_LOCATOR = By.xpath("//mat-select[@formcontrolname=\"oem\"]");
    private static final By PRODUCT_NAME_DROPDOWN_LOCATOR = By
            .xpath("//span[contains(text(),'Select Product name')]/../../..");
    private static final By MODEL_NAME_DROPDOWN_LOCATOR = By
            .xpath("//mat-select[contains(@placeholder,'Select Model name')]");
    private static final By IMEI_TEXT_BOX_LOCATOR = By.xpath("//input[contains(@data-placeholder,'0123456789')]");
    private static final By PURCHASE_DATE_BOX_LOCATOR = By.xpath("//input[@data-placeholder='dd/mm/yyyy']");
    private static final By WARRANTY_DROPDOWN_LOCATOR = By.xpath("//mat-select[@placeholder='Select Warranty Status']");
    private static final By PROBLEM_DROPDOWN_LOCATOR = By.xpath("//mat-select[@placeholder='Select Problem']");
    private static final By REMARK_TEXT_BOX_LOCATOR = By.xpath("//input[@placeholder='Remarks']");
    private static final By FIRST_NAME_TEXT_BOX_LOCATOR = By.xpath("//input[@data-placeholder='First Name']");
    private static final By LAST_NAME_TEXT_BOX_LOCATOR = By.xpath("//input[@data-placeholder='Last Name']");
    private static final By CONTACT_TEXT_BOX_LOCATOR = By.xpath("//input[@data-placeholder='Contact No.']");
    private static final By EMAIL_TEXT_BOX_LOCATOR = By.xpath("//input[@data-placeholder='Email Id.']");
    private static final By FLAT_NUMBER_TEXT_BOX_LOCATOR = By.xpath("//input[@data-placeholder='Flat/Society No.']");
    private static final By APARTMENT_NAME_TEXT_BOX_LOCATOR = By.xpath("//input[@data-placeholder='Apartment Name']");
    private static final By LANDMARK_TEXT_BOX_LOCATOR = By.xpath("//input[@data-placeholder='Choose a Landmark']");
    private static final By STREET_NAME_TEXT_BOX_LOCATOR = By.xpath("//input[@data-placeholder='Street Name.']");
    private static final By AREA_NAME_TEXT_BOX_LOCATOR = By.xpath("//input[@data-placeholder='Area']");
    private static final By STATE_NAME_TEXT_BOX_LOCATOR = By.xpath("//input[@data-placeholder='Select State']");
    private static final By PIN_CODE_TEXT_BOX_LOCATOR = By.xpath("//input[@data-placeholder='Pincode']");
    private static final By SUBMIT_BUTTON_LOCATOR = By.xpath("//span[contains(text(),'Submit')]/..");
    private static final By JOB_TOAST_LOCATOR = By.xpath("	//span[contains(text(),\"Job created successfully\")]");

    public CreateJobPage(WebDriver wd){
        super(wd);
    }

    public void createJobUsing(CustomerDataPOJO data){
        enterText(IMEI_TEXT_BOX_LOCATOR, data.getImeiNumber());
        enterText(FIRST_NAME_TEXT_BOX_LOCATOR, data.getFirstName());
        enterText(LAST_NAME_TEXT_BOX_LOCATOR, data.getLastName());
        enterText(CONTACT_TEXT_BOX_LOCATOR, data.getContactNumber());
        enterText(EMAIL_TEXT_BOX_LOCATOR, data.getEmailAddress());
        enterText(PURCHASE_DATE_BOX_LOCATOR, "1/18/2023");
        enterText(REMARK_TEXT_BOX_LOCATOR, "test");
        enterText(STREET_NAME_TEXT_BOX_LOCATOR, "abc");
        enterText(APARTMENT_NAME_TEXT_BOX_LOCATOR, "abc apt");
        enterText(AREA_NAME_TEXT_BOX_LOCATOR, "xyz");
        enterText(PIN_CODE_TEXT_BOX_LOCATOR, "400104");
        enterText(FLAT_NUMBER_TEXT_BOX_LOCATOR, "111");
        enterText(LANDMARK_TEXT_BOX_LOCATOR, "ABC");
        enterText(STATE_NAME_TEXT_BOX_LOCATOR, "Maharashtra");
        //selectFromDropDown(OEM_DROPDOWN_LOCATOR, data.getOem());
       // selectFromDropDown(PRODUCT_NAME_DROPDOWN_LOCATOR, "Nexus 2");
      //  selectFromDropDown(MODEL_NAME_DROPDOWN_LOCATOR, "gallexy");
       // selectFromDropDown(WARRANTY_DROPDOWN_LOCATOR, " In Warrenty ");
        //selectFromDropDown(PROBLEM_DROPDOWN_LOCATOR, "Overheating");
        clickOnButton(SUBMIT_BUTTON_LOCATOR);

    }

}
