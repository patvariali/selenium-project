package com.cydeo.tests.shorts;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class P03_GettingPageTitle {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://cydeo.com");
        System.out.println(driver.getTitle());

        if(driver.getTitle().equals("Cydeo")){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }

        driver.quit();


        /*
        TC #1: Cydeo practice tool verifications
        1. Open Chrome browser
        2. Go to https://practice.cydeo.com
        3. Verify URL contains
Expected: cydeo
4. Verify title:
Expected: Practice
         */

    }
}
