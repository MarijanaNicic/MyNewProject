import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownDeselect extends BaseTest{

    @Test
    public void deselectFromDropDown () {

        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");

        driver.switchTo().frame(driver.findElement(By.id("iframeResult")));

        Select select = new Select (driver.findElement(By.name("cars")));

        select.selectByIndex(0);  //Volvo
        select.selectByValue("saab");
        select.selectByVisibleText("Opel");

        select.deselectByIndex(0);
        select.deselectByValue("saab");
        select.deselectByVisibleText("Opel");
    }

    @Test
    public void deselectAllFromDropDown () {

        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");

        driver.switchTo().frame(driver.findElement(By.id("iframeResult")));

        Select select = new Select (driver.findElement(By.name("cars")));
        System.out.println("Drop Down Supports Multiple Selections? " + select.isMultiple());

        select.selectByIndex(0);  //Volvo
        select.selectByValue("saab");
        select.selectByVisibleText("Opel");
        select.selectByVisibleText("Audi");

        select.deselectAll();
    }


}
