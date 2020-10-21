import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragSliderHorizontal extends BaseTest{

    @Test
    public void dragSliderLeft ()
    {
        WebElement slider = driver.findElement(By.xpath("//div[@id='js-rangeslider-0']/div[2]"));

        WebElement output = driver.findElement(By.id("js-output"));

        Actions act = new Actions (driver);
        act.dragAndDropBy(slider, -100, 0).perform();

        System.out.println("What Is The Output After Dragging Left? " + output.getText());
    }

    @Test
    public void dragSliderRight ()
    {
        WebElement slider = driver.findElement(By.xpath("//div[@id='js-rangeslider-0']/div[2]"));

        WebElement output = driver.findElement(By.id("js-output"));

        Actions act = new Actions (driver);
        act.dragAndDropBy(slider, 100, 0).perform();

        System.out.println("What Is The Output After Dragging Right? " + output.getText());
    }

}
