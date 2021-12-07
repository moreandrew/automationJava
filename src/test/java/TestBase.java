import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TestBase {

    WebDriver driver;

    @Parameters({"browser"})
    @BeforeSuite
    public void suiteSetup(@Optional("chrome") String browser){

        if (browser.equalsIgnoreCase("chrome"))  driver = new ChromeDriver();

        String os = System.getProperty("os.name");
        if (os.contains("Win")){
            System.setProperty("webdriver.chrome.driver", "C:/Webdriver/bin/chromedriver.exe");
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
