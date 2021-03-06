import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionAndActionsInSelenium extends BaseTest{

        @Test
        public void enterAllCaps_Action ()
        {
            driver.get("https://www.google.com");

            WebElement searchBox = driver.findElement(By.name("q"));

            Actions act = new Actions (driver);
            act.keyDown(searchBox, Keys.SHIFT);
            act.sendKeys(searchBox, "with build");
            act.keyUp(searchBox, Keys.SHIFT);

            Action action = act.build();
            action.perform();
        }

        @Test
        public void enterAllCaps_Actions ()
        {
            driver.get("https://www.google.com");

            WebElement searchBox = driver.findElement(By.name("q"));

            Actions act = new Actions (driver);
            act.keyDown(searchBox, Keys.SHIFT);
            act.sendKeys(searchBox, "without build");
            act.keyUp(searchBox, Keys.SHIFT);
            act.perform();

            act.keyDown(searchBox, Keys.SHIFT).sendKeys(" Works Too").keyUp(searchBox, Keys.SHIFT).perform();
        }


}





