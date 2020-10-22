import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import java.util.Set;

public class SwitchMethodsInWindows extends BaseTest{


    @Test
    public void switchWindows () throws InterruptedException {


        driver.get("https://www.toolsqa.com/automation-practice-switch-windows-2/");

        String mainHandle = driver.getWindowHandle();
        System.out.println("Main Window ID: " + mainHandle + "\n");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 250)");

        driver.findElement(By.id("button1")).click();

        Set<String> allHandles = driver.getWindowHandles();
        System.out.println("Windows Open After Click: " + allHandles.size());

        for (String windowHandle : allHandles)
        {
            if(mainHandle.equals(windowHandle))
            {
                System.out.println("\t Window ID 1: \t" + windowHandle +
                        "\n \t URL: \t \t" + driver.getCurrentUrl() +
                        "\n \t Title: \t \t" + driver.getTitle());
            }
            else
            {
                driver.switchTo().window(windowHandle);

                System.out.println("\t Window ID 2: \t" + windowHandle +
                        "\n \t URL: \t \t" + driver.getCurrentUrl() +
                        "\n \t Title: \t \t" + driver.getTitle());

            }
        }
    }



}
