package com.cybertek.tests.day5_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class button3tikla {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        Thread.sleep(3000);

        WebElement button3 = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/button[3]"));

        button3.click();

        Thread.sleep(2000);

        driver.quit();

    }
}
