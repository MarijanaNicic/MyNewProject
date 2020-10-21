import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchTShirts {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        // Go to http://automationpractice.com/index.php
        driver.get("http://automationpractice.com/index.php");

        // Click Sign in hyperlink
        driver.findElement(By.linkText("Sign in")).click();

        // Enter Email address "Selenium@Automation.com"
        driver.findElement(By.id("email")).sendKeys("Selenium@Automation.com");
        Thread.sleep(4000);

        // Enter Password "SeleniumAutomation1234"
        driver.findElement(By.name("passwd")).sendKeys("SeleniumAutomation1234");
        Thread.sleep(3000);

        // Click Sign in button
        driver.findElement(By.cssSelector("#SubmitLogin")).click();

        // Click T-SHIRTS
        driver.findElement(By.partialLinkText("SHIRTS")).click();

        // Enter Orange in Search text field
        driver.findElement(By.xpath("//*[@id=\"search_query_top\"]")).sendKeys("Orange");

        // Click Search button
        driver.findElement(By.xpath("//*[@type='submit']")).click();

        // Click Sign out hyperlink
        driver.findElement(By.className("logout")).click();

  

        // Close web browser
        driver.quit();


    }
}
