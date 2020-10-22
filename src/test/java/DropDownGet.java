import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class DropDownGet extends BaseTest{

    @Test
    public void getFirstSelectedOption () {

        driver.get("https://www.toolsqa.com/automation-practice-form/");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");

        Select select = new Select (driver.findElement(By.id("continents")));
        System.out.println("1st Default Continent: " + select.getFirstSelectedOption().getText());

        select.selectByVisibleText("North America");
        System.out.println("What's Your Continent? " + select.getFirstSelectedOption().getText());
    }

    @Test
    public void getOptions () {

        driver.get("https://www.toolsqa.com/automation-practice-form/");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");

        Select select = new Select (driver.findElement(By.id("continentsmultiple")));
        List <WebElement> listContinents = select.getOptions();
        System.out.println("Get All Continents");

        for (WebElement continent : listContinents)
        {
            System.out.println("\t" + continent.getText());
        }
    }

    @Test
    public void getAllSelectedOptions () {

        driver.get("https://www.toolsqa.com/automation-practice-form/");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");

        Select select = new Select (driver.findElement(By.id("continentsmultiple")));

        select.selectByIndex(0); //Asia
        select.selectByValue("EU"); //Europe
        select.selectByVisibleText("Africa");

        List<WebElement> selectContinents = select.getAllSelectedOptions();
        System.out.println("What Continents Did You Selct?");

        for (WebElement continent : selectContinents)
        {
            System.out.println("\t" + continent.getText());
        }
    }

}
