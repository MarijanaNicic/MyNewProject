import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

public class PressKey extends BaseTest{

    @Test
    public void useKeysClass ()
    {
        driver.get("https://api.jquery.com/");

        driver.findElement(By.name("s")).sendKeys("Test");
        driver.findElement(By.name("s")).sendKeys(Keys.ENTER);
    }

    @Test
    public void useRobotClass () throws Exception
    {
        driver.get("https://api.jquery.com/");

        Robot robot = new Robot ();
        driver.findElement(By.name("s")).sendKeys("json");

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }

}
