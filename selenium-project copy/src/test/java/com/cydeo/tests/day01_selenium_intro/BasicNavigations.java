package com.cydeo.tests.day01_selenium_intro;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {

        // set up browser driver
      // WebDriverManager.chromedriver().setup();

        // create instance of Chrome browser

//        WebDriver driver = new ChromeDriver();

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        // this line will maximize the currently opened browser
        driver.manage().window().fullscreen(); // only fir MacOs


        // go to tesla.com
        driver.get("https://www.tesla.com");
        
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        // get title of the page
        //System.out.println("driver.getTitle() = " + driver.getTitle());
        String currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);


        // use navigate back() to go back
        driver.navigate().back();

        // stop execution for 3 seconds
        Thread.sleep(1000);

        // user navigate forward () to go forward
        driver.navigate().forward();

        Thread.sleep(1000);

        // user refreshes the page using navigate.refresh()
        driver.navigate().refresh();

        Thread.sleep(1000);

        // navigate to google.com using navigate().to();
        driver.navigate().to("https://google.com");

        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        // get title of the page
        //System.out.println("driver.getTitle() = " + driver.getTitle());

        String currentTitle2 = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle2);


        // closes only the currently focused window/tab
        driver.close();

        //closes all-of-the opened windows
        driver.quit();


    }
}
