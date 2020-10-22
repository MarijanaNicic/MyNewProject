import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

    public class SeleniumLocators extends BaseTest{


    @Test
    public void demoSeleniumLocators () {

        driver.get("https://opensource-demo.orangehrmlive.com/");

        // Find WebElement By id
        WebElement username = driver.findElement(By.id("txtUsername"));
        Highlighter.highlightElement(driver, username);

        // Find WebElement By name
        WebElement password = driver.findElement(By.name("txtPassword"));
        Highlighter.highlightElement(driver, password);

        // Find WebElement By className
        WebElement buttonLogIn = driver.findElement(By.className("button"));
        Highlighter.highlightElement(driver, buttonLogIn);

        //Find WebElement By linkText
        WebElement linkForgotPassword = driver.findElement(By.linkText("Forgot your password?"));
        Highlighter.highlightElement(driver, linkForgotPassword);

        // Scroll Down The Page
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1250)");

        // Find WebElement By partialLinkText
        WebElement linkOrangeHRM = driver.findElement(By.partialLinkText("OrangeHRM"));
        Highlighter.highlightElement(driver, linkOrangeHRM);

        // Find WebElement By tagName
        List<WebElement> images = driver.findElements(By.tagName("img"));

        for (WebElement image : images)
        {
            Highlighter.highlightElement(driver, image);
        }
    }

}
