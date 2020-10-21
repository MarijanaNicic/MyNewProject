import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDrop extends BaseTest{

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

}
