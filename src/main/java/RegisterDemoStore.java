import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class RegisterDemoStore {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("http://demowebshop.tricentis.com/");

        //  Click Register Hyperlink
        driver.findElement(By.linkText("Register")).click();

        //  Your Personal Details
        driver.findElement(By.id("gender-female")).click();
        driver.findElement(By.id("FirstName")).sendKeys("Marijana");
        driver.findElement(By.id("LastName")).sendKeys("Nicic");
        driver.findElement(By.id("Email")).sendKeys("em@co.co");
        driver.findElement(By.id("Password")).sendKeys("123456");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("123456");
        driver.findElement(By.id("register-button")).click();


        Thread.sleep(4000);
        //  Click Email-Account
        driver.findElement(By.className("account")).click();

        //  Save Registration Information
        driver.findElement(By.xpath("//input[@name='save-info-button']")).click();

        //  Logout
        driver.findElement(By.partialLinkText("out")).click();


        driver.quit();



}}



