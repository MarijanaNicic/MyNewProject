import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Set;

public class CommonExceptions extends BaseTest{

    @Test
    public void showNoSuchElementException () {
        driver.get("https://www.google.com");

        driver.findElement(By.name("q1")).sendKeys("Test"); // Remove 1 From q1 To Avoid The Exception
    }

    @Test
    public void showNoSuchFrameException () {
        driver.get("https://www.yourhtmlsource.com/frames/inlineframes.html");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1250)");

        driver.switchTo().frame(34); // Change 34 To 2 And Avoid The Exception

        driver.findElement(By.xpath("//body[@id=\"htmlsource\"]/a")).click();
    }

    @Test
    public void showNoSuchWindowException () {
        driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
        String mainHandle = driver.getWindowHandle();
        System.out.println("Main Window ID? " + mainHandle + "\n");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 250)");
        driver.findElement(By.id("button1")).click();

        driver.switchTo().window("1"); // Remove Or Comment This Line To Avoid Exception
        Set<String> allHandles = driver.getWindowHandles();
        System.out.println("Windows Open After Click: " + allHandles.size());

        for (String windowHandle : allHandles) {
            if (mainHandle.equals(windowHandle))
            {
                System.out.println("\t Window ID 1: \t" + windowHandle +
                        "\n \t URL: \t \t" + driver.getCurrentUrl() +
                        "\n \t Title: \t \t" + driver.getTitle());
            }
            else {
                driver.switchTo().window(windowHandle);

                System.out.println("\t Window ID 2: \t" + windowHandle +
                        "\n \t URL: \t \t" + driver.getCurrentUrl() +
                        "\n \t Title: \t \t" + driver.getTitle());
            }
        }
    }

    @Test
    public void showElementNotVisibleException() {
        driver.get("https://amazon.com/");

        WebElement menuSignIn = driver.findElement(By.id("nav-link-accountList"));
	/*
		Actions act = new Actions (driver);

		act.moveToElement(menuSignIn).perform(); // Remove Comment To Avoid The Exception
	*/
        driver.findElement(By.xpath("//span[text()='Your Account']")).click();

        System.out.println("Title = " + driver.getTitle());
    }


}
