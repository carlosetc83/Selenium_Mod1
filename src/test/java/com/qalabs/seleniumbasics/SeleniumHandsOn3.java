package com.qalabs.seleniumbasics;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;


public class SeleniumHandsOn3 {
    public static void main(String[] args) throws InterruptedException {
        //Define browser
        String Browser = "chrome";

        //Get Driver for Browser
        WebDriver MyDriver = WebDriverFactory.getDriver(Browser);

        //Open URL
        MyDriver.get("http://www.facebook.com");

        Thread.sleep(3000);

        //Get UserName textbox
        WebElement UserName = MyDriver.findElement(By.id("email"));

        //Set username
        UserName.sendKeys("carlosetc83@gmail.com");

        //Get PWD textbox
        WebElement Pwd = MyDriver.findElement(By.id("pass"));

        //Set PWD
        Pwd.sendKeys("MonterreyChivas1!");

        //Get Login Button
        WebElement LoginB = MyDriver.findElement(By.id("loginbutton"));

        //Click Login
        LoginB.click();

        //Sync 5 Seconds
        Thread.sleep(5000);

        //Close Browser
        MyDriver.close();


    }




}