import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;
import java.time.Duration;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GoogleSearchTest {

    WebDriver driver;


    @BeforeSuite
    public void suiteSetup(){
        String os = System.getProperty("os.name");

        if (os.contains("Win")){
            System.setProperty("webdriver.chrome.driver", "C:/Webdriver/bin/chromedriver.exe");
        }
    }

    @Test
    public void testOS() {

        //System.out.println(os);
    }

    @Parameters({"browser"})
    @Test
    public void testGoogleSearch(String browser) {

        if (browser.equalsIgnoreCase("chrome"))  driver = new ChromeDriver();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://google.com/");

        WebElement textInput = driver.findElement(By.name("q"));
        textInput.sendKeys("Portnov computer school");
        textInput.submit();
    }
}
