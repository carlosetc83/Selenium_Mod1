package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.net.URL;

public class SeleniumExe4 {
    public static void main(String[] args) throws InterruptedException, MalformedURLException {
        //Select Browser
        String Browser = "chrome";

        //Get Browser Driver
        WebDriver MyDriver = WebDriverFactory.getDriver(Browser);

        //Open WebPage
        MyDriver.get("http://www.google.com");

        //Wait for Sync
        Thread.sleep(1000);

        //Get URL
        String UrlInitial = MyDriver.getCurrentUrl();

        //Got to Facebook Page
        MyDriver.navigate().to(new URL("http://www.youtube.com"));

        //Find Search element
        WebElement searchTextBox = MyDriver.findElement(By.id("search"));

        boolean searchDisplay;
        if (searchTextBox.isDisplayed()) {
            searchDisplay = true;
        } else {
            searchDisplay = false;
        }

        boolean searchEnabled;
        if (searchTextBox.isEnabled()) {
            searchEnabled = true;
        }
        else {
            searchEnabled = false;
        }

        searchTextBox.sendKeys("Selenium");

        WebElement searchSearch = MyDriver.findElement(By.id("search-icon-legacy"));

        searchSearch.click();

        Thread.sleep(5000);

        MyDriver.close();

    }
}



