package com.cydeo.tests.shorts;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class P02_Close_Quit_Page {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cydeo.com/open_new_tab");

        Thread.sleep(5000);

        // it will close currently open page
        driver.close();

        // it will close all windows
        //driver.quit();
    }
}
