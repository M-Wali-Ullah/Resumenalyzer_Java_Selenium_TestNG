package COMMUNICATION_CHANNEL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class My_Message_History {

    public static void main(String[] args) {
        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to a website
        driver.get("https://ns26njj87sh.dataflightit.com/");

        driver.manage().window().maximize();

        // Find and click the user account button
        WebElement userAccountButton = driver.findElement(By.id("navbarAccount"));
        userAccountButton.click();
        sleep(2000); // Wait for 2 seconds

        // Find and click the sign-in button
        WebElement signInButton = driver.findElement(By.xpath("//*[@id=\"navbarLogo\"]/ul/li/ul/div/a[1]/div/h6[2]"));
        signInButton.click();
        sleep(2000); // Wait for 2 seconds

        // Enter email address
        String emailAddress = "waliullah1070@gmail.com";
        WebElement emailInput = driver.findElement(By.xpath("//*[@id=\"id_email\"]"));
        emailInput.sendKeys(emailAddress);

        // Enter password
        WebElement passwordInput = driver.findElement(By.xpath("//*[@id=\"id_password\"]"));
        passwordInput.sendKeys("1070Waliarmy");

        // Click the sign-in button
        WebElement signInSubmitButton = driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/div/div[2]/form/button"));
        signInSubmitButton.click();
        sleep(2000); // Wait for 2 seconds

        // Click the user profile
        WebElement userProfileButton = driver.findElement(By.xpath("//*[@id=\"navbarAccount\"]/span[2]"));
        userProfileButton.click();
        sleep(2000); // Wait for 2 seconds

        // Click the profile home
        WebElement profileHomeButton = driver.findElement(By.xpath("//*[@id=\"navbarLogo\"]/ul/li/ul/div/a[1]/div/h6[1]"));
        profileHomeButton.click();
        sleep(2000); // Wait for 2 seconds

        // Click the Update Password
        WebElement mymessagehistoryButton = driver.findElement(By.xpath("/html/body/main/div/div[2]/div[1]/div/div/ul/li[2]/a"));
        mymessagehistoryButton.click();
        sleep(5000); // Wait for 5 seconds

        // Close the browser
       driver.quit();
    }

    private static void sleep(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
