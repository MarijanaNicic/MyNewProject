import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class FindElementAndFindElements extends BaseTest{

    @Test
    public void differenceFindElement_FindElements () {

        driver.get("https://www.yahoo.com/");

        WebElement yahooLink = driver.findElement(By.cssSelector("div#ybar-navigation a"));

        System.out.println("findElement: \n \t" + yahooLink.getText());

        List<WebElement> yahooLinks = driver.findElements(By.cssSelector("div#ybar-navigation a"));

        System.out.println("findElements: ");

        for (WebElement tempYahooLink : yahooLinks)
        {
            System.out.println("\t " + tempYahooLink.getText());
        }
    }

}
