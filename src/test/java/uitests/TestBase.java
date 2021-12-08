package uitests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class TestBase {

    WebDriver driver;

    @Parameters({"browser"})
    @BeforeSuite
    public void suiteSetup(@Optional("chrome") String browser){

        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
            System.setProperty("webdriver.chrome.driver", "C:/Webdriver/bin/chromedriver.exe");
        }
        if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
            System.setProperty("webdriver.chrome.driver", "C:/Webdriver/bin/geckodriver.exe");
        }

    }

    @AfterSuite
    @Test
    public void afterSuite(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }


}