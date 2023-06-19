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
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserTesting {

    static String baseUrl = "https://opensource-demo.orangehrmlive.com/";
    static String browser = "Edge";

    static WebDriver driver;

    public static void main(String[] args) {

            if (browser.equalsIgnoreCase("chrome")){
                driver = new ChromeDriver();
            } else if (browser.equalsIgnoreCase("Edge")) {
                driver = new EdgeDriver();
            } else if (browser.equalsIgnoreCase("FireFox")) {
                driver = new FirefoxDriver();
            }else {
                System.out.println("Web browser is not valid : ");
            }

            driver.get(baseUrl);
            // maximize the window
            driver.manage().window().maximize();
            // manage the implicit wait time
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
            // get the title of the page
        System.out.println("Title of the page is :" + driver.getTitle());
            // get the current url
        System.out.println("The current Url is : " + driver.getCurrentUrl());
            // get the source of the page
        System.out.println("Page source is : " + driver.getPageSource());
            // enter the email or userName into the email or userName Field
        WebElement usernameField = driver.findElement(By.name("username"));
        usernameField.sendKeys("Admin");
            // enter the passwordField into the passwordField
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("admin123");
        // enter the web browser closure
        driver.close();

    }
}
