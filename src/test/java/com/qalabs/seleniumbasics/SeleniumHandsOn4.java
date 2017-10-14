package com.qalabs.seleniumbasics;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;



public class SeleniumHandsOn4 {
    public static void main (String [] args) throws InterruptedException {

        //Define Browser
        String Browser = "chrome";

        //Get Driver for Browser
        WebDriver MyDriver = WebDriverFactory.getDriver(Browser);

        //open URL
        MyDriver.get("http://www.amazon.com");

        //sync
        Thread.sleep(10000);

        //Get Search Box
        WebElement Search = MyDriver.findElement(By.id("twotabsearchtextbox"));

        //Search for Selenium
        Search.sendKeys("selenium");

        Thread.sleep(10000);

        Search.sendKeys(Keys.ENTER);

        MyDriver.close();
    };

}
