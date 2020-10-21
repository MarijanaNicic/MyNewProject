import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragAndDrop {

    WebDriver driver;

    @BeforeTest
    public void setUp ()
    {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void dragAndDropTarget ()
    {
        driver.get("https://jqueryui.com/droppable/");

        driver.switchTo().frame(0);

        WebElement source = driver.findElement(By.id("draggable"));

        WebElement target = driver.findElement(By.id("droppable"));

        Actions act = new Actions (driver);
        act.dragAndDrop(source, target).perform();
    }

    @AfterTest
    public void tearDown () throws InterruptedException
    {
        Thread.sleep(3000);
        driver.quit();
    }


}
