package MY_REWARDS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Current_Offers_2 {

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

        // Click Current Offers
        WebElement currentofferButton = driver.findElement(By.xpath("/html/body/main/div/div[1]/div[2]/div/div/ul/li[1]/a"));
        currentofferButton.click();
        sleep(2000); // Wait for 2 seconds
        
        
        // Click Offer 2
        WebElement offer2Button = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/div[1]/div[2]/div/div/p[4]/a"));
        offer2Button.click();
        sleep(2000); // Wait for 2 seconds
        
        
        
        
        
        
        
        
     // Enter Guest first name
        WebElement guestfirstnameInput = driver.findElement(By.xpath("//*[@id=\"id_guest_first_name\"]"));
        guestfirstnameInput.sendKeys("M Wali");
        
     // Enter Guest last name
        WebElement guestlastnameInput = driver.findElement(By.xpath("//*[@id=\"id_guest_last_name\"]"));
        guestlastnameInput.sendKeys("Ullah");
        
        
     // Enter Guest email address
        WebElement guestemailInput = driver.findElement(By.xpath("//*[@id=\"id_guest_email_address\"]"));
        guestemailInput.sendKeys("waliullah1070@gmail.com");
        
     // Enter Friend first name
        WebElement friendfirstnameInput = driver.findElement(By.xpath("//*[@id=\"id_friend_first_name\"]"));
        friendfirstnameInput.sendKeys("Asdf");
        
     // Enter Friend email address
        WebElement friendemailInput = driver.findElement(By.xpath("//*[@id=\"id_friend_email_address\"]"));
        friendemailInput.sendKeys("asdf@gmail.com");
        
        
     // Click Consent 
        WebElement consentButton = driver.findElement(By.xpath("//*[@id=\"id_consent\"]"));
        consentButton.click();
        sleep(2000); // Wait for 2 seconds
        

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

