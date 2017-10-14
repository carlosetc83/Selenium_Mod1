package com.qalabs.seleniumbasics;

import org.openqa.selenium.WebDriver;

public class SeleniumExe2 {
    public static void main(String[] args) throws InterruptedException {
        //Select Browser
        String Browser = "chrome";

        //Get Browser Driver
        WebDriver MyDriver = WebDriverFactory.getDriver(Browser);

        //Open WebPage
        MyDriver.get("http://www.google.com");

        //Wait for Sync
        Thread.sleep(1000);

        //Get URL
        String currentUrl = MyDriver.getCurrentUrl();

        //Get Page Tittle
        String currentTittle = MyDriver.getTitle();

        //Get Source Code
        String currentPageSource = MyDriver.getPageSource();

        //Close Browser
        MyDriver.close();

        //Print Values
        System.out.println("La URL actual es: " + currentUrl);
        System.out.println("La PageTittle actual es: " + currentTittle);
        System.out.println("La Page Source actual es: " + currentPageSource);
    }

}


