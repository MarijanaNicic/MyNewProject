import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragSliderVertical extends BaseTest{

    @Test
    public void dragSliderDown ()
    {
        driver.get("https://foundation.zurb.com/sites/docs/v/5.5.3/components/range_slider.html");

        WebElement slider = driver.findElement(By.cssSelector("div.small-3 span.range-slider-handle"));

        WebElement value = driver.findElement(By.id("sliderOutput2"));

        Actions act = new Actions (driver);
        act.dragAndDropBy(slider, 0, 34).perform();

        System.out.println("What Is The Value After Dragging The Slider Down? " + value.getText());
    }

    @Test
    public void dragSliderUp ()
    {
        driver.get("https://foundation.zurb.com/sites/docs/v/5.5.3/components/range_slider.html");

        WebElement slider = driver.findElement(By.cssSelector("div.small-3 span.range-slider-handle"));

        WebElement value = driver.findElement(By.id("sliderOutput2"));

        Actions act = new Actions (driver);
        act.dragAndDropBy(slider, 0, -34).perform();

        System.out.println("What Is The Value After Dragging The Slider Up? " + value.getText());
    }


}
