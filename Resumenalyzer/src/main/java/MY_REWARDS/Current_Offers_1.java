package MY_REWARDS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Current_Offers_1 {

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
        
     // Click Current Offers
        WebElement currentofferButton = driver.findElement(By.xpath("/html/body/main/div/div[1]/div[2]/div/div/ul/li[1]/a"));
        currentofferButton.click();
        sleep(2000); // Wait for 2 seconds

        // Click Current Offer 1
        WebElement offer1Button = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/div[1]/div[1]/div/div/p[5]/a"));
        offer1Button.click();
        sleep(2000); // Wait for 2 seconds
        
        
        // Section 1: About the product
        // Select Product
        WebElement dropdown = driver.findElement(By.id("id_product_liked"));
        Select select = new Select(dropdown);
        //select.selectByVisibleText("Option Text");
        select.selectByIndex(2);// The index of first one is 0.
        
        // Enter Feedback
        WebElement feedbackInput = driver.findElement(By.xpath("//*[@id=\"id_feedback\"]"));
        feedbackInput.sendKeys("This is awsome service.");
        
        
        // Section 2: About you
        // Enter First name
        WebElement firstnameInput = driver.findElement(By.xpath("//*[@id=\"id_first_name\"]"));
        firstnameInput.sendKeys("M Wali");
        
        // Enter Last name
        WebElement lastnameInput = driver.findElement(By.xpath("//*[@id=\"id_last_name\"]"));
        lastnameInput.sendKeys("Ullah");
        
        // Enter email address
        WebElement emailaddressInput = driver.findElement(By.xpath("//*[@id=\"id_email_address\"]"));
        emailaddressInput.sendKeys("waliullah1070@gmail.com");
        
        // Click Submit
        WebElement submitButton = driver.findElement(By.xpath("/html/body/div[7]/div/div/div[2]/div[2]/div/div/div/form/button"));
        submitButton.click();
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
