package com.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BrowserUtility {



    private WebDriver wd;
    private WebDriverWait wait;
    public WebDriver getWd() {
        return wd;
    }

    public BrowserUtility(WebDriver wd) //constructor initializes instance variable
    {
        super();
        this.wd =wd;
        wait = new WebDriverWait(wd, Duration.ofSeconds(30));


    }

    public BrowserUtility(){
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "//driver//chromedriver.exe");
        wd = new ChromeDriver();//launch browser
        wait = new WebDriverWait(wd, Duration.ofSeconds(30));



    }
    public void  goToWebsite(String url){

        wd.get(url);
    }
    public void maximizeWindow(){

         wd.manage().window().maximize();
    }
   public void enterText(By elementLocator,String textToEnter){
       WebElement element= wait.until(ExpectedConditions.visibilityOfElementLocated(elementLocator));
      // WebElement element = wd.findElement(elementLocator);
       clearText(elementLocator);
       element.sendKeys(textToEnter);
   }

   public void enterSpecialKey(By elementLocator, Keys keyToEnter){
       WebElement element= wait.until(ExpectedConditions.visibilityOfElementLocated(elementLocator));
       //WebElement element = wd.findElement(elementLocator);
        element.sendKeys(keyToEnter);
   }
   public void clickOnButton(By elementLocator){
       WebElement element= wait.until(ExpectedConditions.elementToBeClickable(elementLocator));
       //WebElement element = wd.findElement(elementLocator);
        element.click();
   }
   public void clearText(By elementLocator){
       WebElement element= wait.until(ExpectedConditions.visibilityOfElementLocated(elementLocator));
       //WebElement element = wd.findElement(elementLocator);
        element.clear();

   }
   public void sleep(int seconds){
       try {
           Thread.sleep(seconds * 1000);
       }
       catch (InterruptedException e) {
           throw new RuntimeException(e);
       } ;

   }

   public String getVisibleText(By locatorForTheElement){
       WebElement element= wait.until(ExpectedConditions.visibilityOfElementLocated(locatorForTheElement));
       //WebElement element = wd.findElement(locatorForTheElement);
        String data = element.getText();
        return data;
   }


}
