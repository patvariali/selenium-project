package com.cydeo.tests.shorts;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P07_FindElementByTagName {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://www.practice.cydeo.com");

        WebElement header = driver.findElement(By.tagName("h1"));

        System.out.println("header.getText() = " + header.getText());

    }
}
