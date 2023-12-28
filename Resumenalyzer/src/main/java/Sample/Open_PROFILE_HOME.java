package Sample;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class Open_PROFILE_HOME {
	public static void main(String[] args) {

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to a website
        driver.get("https://ns26njj87sh.dataflightit.com/");

        // Find an element by its ID
        WebElement useraccount = driver.findElement(By.id("navbarAccount"));
        useraccount.click();
        
        
        WebElement signin = driver.findElement(By.xpath("//*[@id=\"navbarLogo\"]/ul/li/ul/div/a[1]/div/h6[2]"));
        signin.click();
        String emailaddress = "waliullah1070@gmail.com";
        WebElement email = driver.findElement(By.xpath("//*[@id=\"id_email\"]"));
        email.sendKeys(emailaddress);
        
        WebElement password = driver.findElement(By.xpath("//*[@id=\"id_password\"]"));
        password.sendKeys("1070Waliarmy");
        
        WebElement signinbutton = driver.findElement(By.xpath("/html/body/section/div/div/div[1]/div/div/div[2]/form/button"));
        signinbutton.click();
        
        WebElement user = driver.findElement(By.xpath("//*[@id=\"navbarAccount\"]/span[2]"));
        user.click();
        
        WebElement profilehome = driver.findElement(By.xpath("//*[@id=\"navbarLogo\"]/ul/li/ul/div/a[1]/div/h6[1]"));
        profilehome.click();
        
        String pageTitle = driver.getTitle();

        
        System.out.println("Page Title: " + pageTitle);
        
        // Close the browser
        driver.quit();
    }
}
