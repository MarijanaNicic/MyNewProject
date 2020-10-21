import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

public class MouseControl extends BaseTest {

    @Test
    public void leftClickButton ()
    {
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo/trigger-left-click.html");

        WebElement button = driver.findElement(By.cssSelector("span.btn-neutral"));

        Actions act = new Actions (driver);
        act.click(button).perform();

        List<WebElement> elements = driver.findElements(By.cssSelector("li span"));

        System.out.println("WebElements After Left Click:");

        for (WebElement element : elements)
        {

            Highlighter.highlightElement(driver,element);

            System.out.println("\t" + element.getText());
        }
    }

    @Test
    public void rightClickButton ()
    {
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

        WebElement button = driver.findElement(By.className("btn"));

        Actions act = new Actions (driver);
        act.contextClick(button).perform();

        List <WebElement> elements = driver.findElements(By.cssSelector("li span"));

        System.out.println("WebElements After Right Click:");

        for (WebElement element : elements)
        {
            Highlighter.highlightElement(driver, element);

            System.out.println("\t" + element.getText());
        }
    }

    @Test
    public void doubleClickButton ()
    {
        driver.get("https://api.jquery.com/dblclick/");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 2500)");

        driver.switchTo().frame(0);

        WebElement box = driver.findElement(By.cssSelector("body > div"));

        System.out.println("Color Before: " + box.getCssValue("background-color"));

        Actions act = new Actions (driver);
        act.doubleClick(box).perform();

        System.out.println("Color After: " + box.getCssValue("background-color"));

    }

    @Test
    public void hoverAmazonMenu ()
    {
        driver.get("https://www.amazon.com");

        WebElement menuSignIn = driver.findElement(By.id("nav-link-accountList"));

        Actions act = new Actions (driver);
        act.moveToElement(menuSignIn).perform();

        driver.findElement(By.xpath("//span[text()='Your Account']")).click();

        System.out.println("Title = " + driver.getTitle());
    }


}
