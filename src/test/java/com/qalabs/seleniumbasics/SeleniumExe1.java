package com.qalabs.seleniumbasics;

import org.openqa.selenium.WebDriver;

public class SeleniumExe1 {
    public static void main(String[] args) throws InterruptedException {
        //Select Browser
        String Browser = "chrome";

        //Get Browser Driver
        WebDriver MyDriver = WebDriverFactory.getDriver(Browser);

        //Open WebPage
        MyDriver.get("http://www.google.com");

        Thread.sleep(1000);

        MyDriver.close();
    }

}
