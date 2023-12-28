package COMMUNICATION_CHANNEL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contact_Us {

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
        passwordInput.sendKeys("1070");

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

        // Click the Contact Us
        WebElement contactusButton = driver.findElement(By.xpath("/html/body/main/div/div[2]/div[1]/div/div/ul/li[1]/a"));
        contactusButton.click();
        sleep(2000); // Wait for 2 seconds
        
        // Write a subject line
        WebElement subjectlineInput = driver.findElement(By.xpath("//*[@id=\"id_subject\"]"));
        subjectlineInput.sendKeys("I have some concern.");
        
        
        // Write in details about your question
        WebElement descriptionInput = driver.findElement(By.xpath("//*[@id=\"id_msg\"]"));
        descriptionInput.sendKeys("I hope this message finds you well. I am writing to kindly request an official internship confirmation letter for my current role as an SQA Automation Intern at LegoIO. Having such a document would greatly assist me in various administrative and official matters during my internship period. It will serve as proof of my association with the company, which can be particularly useful for academic purposes and any future professional endeavors.");
        
        
        // Click the Submit Button
        WebElement submitButton = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/div[1]/div/form/button"));
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
