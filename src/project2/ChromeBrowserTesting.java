package project2;
/**
 * Project-2 - Project Name: com-orangehrmlive
 * BaseUrl = https://opensource-demo.orangehrmlive.com/
 * 1. Setup Chrome browser
 * 2. Open URL
 * 3. Print the title of the page
 * 4. Print the current url
 * 5. Print the page source
 * 6. Enter the email to email field
 * 7. Enter the password to password field
 * 8. Close the browser
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTesting {

    public static void main(String[] args) {

            String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        // launching the Chrome browser
            WebDriver driver = new ChromeDriver();
        // get the base url
        driver.get(baseUrl);
        // maximise the browser
        driver.manage().window().maximize();
        //implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        // get title
        System.out.println("Page title is :" +driver.getTitle());
        // get the url
        System.out.println("The current Url : " + driver.getCurrentUrl());
        // get the page source
        System.out.println("The source of the Page : " + driver.getPageSource());

        // enter the email address to emailField
        WebElement userNameField = driver.findElement(By.name("username"));
        userNameField.sendKeys("Admin");
        // Enter the password to the passwordField
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("admin123");
        // closing the browser
        driver.close();



    }


}
