import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownSelect extends BaseTest{


    @Test
    public void accessEmployeeList ()
    {
        driver.get("https://opensource-demo.orangehrmlive.com/");

        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();
        driver.findElement(By.id("menu_pim_viewPimModule")).click();
    }

    @Test
    public void selectFromDropDown () {

        driver.get("https://opensource-demo.orangehrmlive.com/");

        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();
        driver.findElement(By.id("menu_pim_viewPimModule")).click();

        WebElement findJobTitle = driver.findElement(By.id("empsearch_job_title"));
        Select selectJobTitle = new Select (findJobTitle);
        selectJobTitle.selectByIndex(1); // Account Clerk

        Select selectSubUnit = new Select (driver.findElement(By.id("empsearch_sub_unit")));
        selectSubUnit.selectByValue("6"); // IT

        Select selectInclude = new Select (driver.findElement(By.id("empsearch_termination")));
        selectInclude.selectByVisibleText("Past Employees Only");
    }
}
