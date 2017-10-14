package com.qalabs.seleniumbasics;

import org.openqa.selenium.WebDriver;


import java.net.MalformedURLException;
import java.net.URL;

public class SeleniumExe3 {
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
        MyDriver.navigate().to(new URL("http://www.facebook.com"));

        //Go to ESPN Page
        MyDriver.navigate().to(new URL("http://www.ESPN.com"));

        // Move Backwards twice
        MyDriver.navigate().back();
        MyDriver.navigate().back();

        //Move Forwards
        MyDriver.navigate().forward();

        //Get Actual URL
        String URLFinal = MyDriver.getCurrentUrl();

        //Close Browser
        MyDriver.close();

        //Print Values
        System.out.println("La URL inicial es: " + UrlInitial);
        System.out.println("La URL actual es: " + URLFinal);
    }


}
