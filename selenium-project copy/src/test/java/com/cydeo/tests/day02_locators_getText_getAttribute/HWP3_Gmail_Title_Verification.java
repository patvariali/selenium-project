package com.cydeo.tests.day02_locators_getText_getAttribute;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HWP3_Gmail_Title_Verification {
    public static void main(String[] args) {
        //TC #3: Back and forth navigation
        //1- Open a chrome browser
        //2- Go to: https://google.com

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://google.com");

        //3- Click to Gmail from top right.

        WebElement gmailLink = driver.findElement(By.linkText("Gmail"));
        gmailLink.click();

        // 4- Verify title contains:
        //Expected: Gmail
        String expectedGmailTitle = "Gmail";
        String actualGmailTitle = driver.getTitle();

        System.out.println("actualGmailTitle = " + actualGmailTitle);

        if (actualGmailTitle.equals(expectedGmailTitle)){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }

        //5- Go back to Google by using the .back();

        driver.navigate().back();

        // 6- Verify title equals:
        //Expected: Google

        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }



    }
}
