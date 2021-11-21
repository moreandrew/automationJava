import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;
import java.time.Duration;
import org.testng.annotations.Test;

public class GoogleSearchTest {
    @Test
    public void testName() {
        System.setProperty("webdriver.chrome.driver", "C:/Webdriver/bin/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://google.com/");

        WebElement textInput = driver.findElement(By.name("q"));
        textInput.sendKeys("Portnov computer school");
    }
}
