import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class IsDisplayedAndIsEnabled extends BaseTest{

    @Test
    public void testIsDisplayedIsEnabled ()
    {
        driver.get("https://opensource-demo.orangehrmlive.com/");

        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();

        driver.findElement(By.id("menu_admin_viewAdminModule")).click();

        WebElement buttonDelete = driver.findElement(By.id("btnDelete"));
        boolean isDeleteButtonDisplayed = buttonDelete.isDisplayed();
        boolean isDeleteButtonEnabled = buttonDelete.isEnabled();

        System.out.println("Before Click - Is Delete Button Displayed And Enabled? " + "\n \t"
                + "Displayed = " + isDeleteButtonDisplayed + "\n \t"
                + "Enabled = " + isDeleteButtonEnabled + "\n");

        driver.findElement(By.xpath("//input[@id='ohrmList_chkSelectRecord_45']")).click();

        isDeleteButtonDisplayed = buttonDelete.isDisplayed();
        isDeleteButtonEnabled = buttonDelete.isEnabled();

        System.out.println("After Click - Is Delete Button Displayed And Enabled? " + "\n \t"
                + "Displayed = " + isDeleteButtonDisplayed + "\n \t"
                + "Enabled = " + isDeleteButtonEnabled + "\n");



    }


}
