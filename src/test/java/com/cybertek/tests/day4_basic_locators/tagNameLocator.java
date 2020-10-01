package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tagNameLocator {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //make browser fullscreen
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/sign_up");

        //sendKeys to FullName
        WebElement fullNameInput = driver.findElement(By.tagName("input"));
        fullNameInput.sendKeys("Mike Smith With Tagname");

        //sendKeys to email
        WebElement EmailInput = driver.findElement(By.name("email"));
        EmailInput.sendKeys("mike@smith.com");

        Thread.sleep(2000);

        //proper way
        WebElement signUp = driver.findElement(By.tagName("button"));
        signUp.click();

        //lazy way to click button
        //driver.findElement(By.tagName("button")).click();

        Thread.sleep(3000);

        driver.quit();
    }
}
