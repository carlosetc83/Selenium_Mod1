package com.qalabs.seleniumbasics;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import static java.lang.Thread.*;


public class SeleniumHandsOn2 {
    public static void main(String[] args) throws InterruptedException {
        //Define Browser
        String Browser = "chrome";

        //Get Driver for Browser
        WebDriver MyDriver = WebDriverFactory.getDriver(Browser);

        //Open WebPage
        MyDriver.get("http://www.google.com");

        //Synchronize web page
        sleep(10);

        //Get URL
        String URLInitial = MyDriver.getCurrentUrl();

        //Validate Right URL
        assert URLInitial.equals("http://www.google.com"):"Esta no es la URL esperada";
        System.out.println("La URL Initial es: " + URLInitial);

        //Find Search Box
        WebElement SearchBox = MyDriver.findElement(By.id("lst-ib"));

        //Type QA Minds
        SearchBox.sendKeys("QA Minds");

        //Click on Search
        SearchBox.sendKeys(Keys.ENTER);

        // Close Browser
        MyDriver.close();

    }




}
