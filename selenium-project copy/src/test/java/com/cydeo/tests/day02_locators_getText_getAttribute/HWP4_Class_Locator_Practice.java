package com.cydeo.tests.day02_locators_getText_getAttribute;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HWP4_Class_Locator_Practice {
    public static void main(String[] args) throws InterruptedException {

        //TC #4: Practice Cydeo – Class locator practice
        //1- Open a Chrome browser
        //2- Go to: https://practice.cydeo.com/inputs

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/inputs");

        //3- Click to “Home” link
        WebElement homeLink = driver.findElement(By.className("nav-link"));

        Thread.sleep(2000);
        homeLink.click();

        //4- Verify title is as expected: Expected: Practice
        //PS: Locate “Home” link using “className” locator

        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }

    }
}
