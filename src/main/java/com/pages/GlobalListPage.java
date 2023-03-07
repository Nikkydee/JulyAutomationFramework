package com.pages;
import com.POJO.JobDetailsPOJO;
import com.utils.BrowserUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class GlobalListPage extends BrowserUtility {
 private static final By JOB_DETAILS_TABLE_LOCATOR = By.tagName("mat-table");
 private static final By JOB_DETAILS_TABLE_ROW_LOCATOR = By.xpath(".//mat-row");
 private static final By JOB_DETAILS_TABLE_CELL_LOCATOR = By.xpath("//mat-cell");
    public GlobalListPage(WebDriver wd){

        super(wd);
    }

    public JobDetailsPOJO getJobDetails(){
        WebDriver wd = getWd();
        sleep(4);
        WebElement tableElement = wd.findElement(JOB_DETAILS_TABLE_LOCATOR);
        WebElement rowElement = tableElement.findElement(JOB_DETAILS_TABLE_ROW_LOCATOR);
        List<WebElement> cellList = rowElement.findElements(JOB_DETAILS_TABLE_CELL_LOCATOR);

        JobDetailsPOJO jobDetailsPOJO = new JobDetailsPOJO(cellList.get(0).getText(), cellList.get(1).getText(),
                cellList.get(2).getText(), cellList.get(3).getText(), cellList.get(4).getText(),
                cellList.get(5).getText(), cellList.get(6).getText());


        return jobDetailsPOJO;

        }


    }



