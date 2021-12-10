package uitests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import uitests.TestBase;

import java.util.Set;

public class WindowHandlesTest extends TestBase {


    @Test
    public void testNewTab() {
        WebDriverWait wait = new WebDriverWait(driver,3);

        driver.get("https://the-internet.herokuapp.com/windows");

        WebElement link = driver.findElement(By.linkText("Click Here"));
        link.click();

        Set<String> windowHandles  = driver.getWindowHandles();
        String[] arrayOfHandles = windowHandles.toArray(new String[0]);

        driver.switchTo().window(arrayOfHandles[1]);

        wait.until(ExpectedConditions.not(ExpectedConditions.titleIs("")));
        String title = driver.getTitle();

        Assert.assertEquals(title, "New Window");
    }
}
