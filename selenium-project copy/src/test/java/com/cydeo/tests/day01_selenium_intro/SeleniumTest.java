package com.cydeo.tests.day01_selenium_intro;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class SeleniumTest {

    public static void main(String[] args) {

        //1 - Setting up the web driver manager

        //WebDriverManager.chromedriver().setup();

        //2 - Create the instance of Chrome browser driver

        //WebDriver driver = new ChromeDriver();

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //3 - Test if driver and browser are working as expected
        driver.get("https://www.google.com");


    }
}
