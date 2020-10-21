import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class ScreenshotsTest {

    WebDriver driver;

    @BeforeTest
            public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @Test
    public void takeGreyHoundScreenshot(){

        driver.get("https://www.greyhound.com/");

        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File source = screenshot.getScreenshotAs(OutputType.FILE);
        File destination = new File(System.getProperty("user.dir")+
                "/Screenshots/GreyHound.png");

        try {
            FileHandler.copy(source, destination);
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("Screenshot Located At "+ destination);
    }





}
