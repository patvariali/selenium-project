package com.cydeo.tests.day02_locators_getText_getAttribute;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_GoogleSearch {
    public static void main(String[] args) {

       // TC#3: Google search
       // 1- Open a chrome browser
        //WebDriverManager.chromedriver().setup();
       // WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();

       // 2- Go to: https://google.com
        //driver.get("https://google.com ");

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        // 3- Write “apple” in search box
        WebElement googleSearchBox = driver.findElement(By.name("q"));

        googleSearchBox.sendKeys("apple" + Keys.ENTER);

        // 4- Press ENTER to search
       //  googleSearchBox.sendKeys(keys.ENTER);

        //  5- Verify title:
        //Expected: Title should start with “apple” word

        String expectedInBeginningOfTitle = "apple";
        String actualTitle = driver.getTitle();

        if(actualTitle.startsWith(expectedInBeginningOfTitle)){
            System.out.println("title passed");
        }else{
            System.out.println("title failed");
        }
    }
}
