import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class GoogleSearchTest extends TestBase {

    @Test
    public void testGoogleSearch() {
        navigateToSearchPage();
        submitQuery();
        int actualResults = parseNumberOfResults();

        Assert.assertTrue(actualResults > 1000);
    }

    private int parseNumberOfResults() {
        WebElement statResult = driver.findElement(By.id("result-stats"));
        int parsedResult = CommonTools.parseResults(statResult);

        return parsedResult;
    }

    private void submitQuery() {
        WebElement textInput = driver.findElement(By.name("q"));
        textInput.sendKeys("Portnov computer school");
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        textInput.submit();
    }

    private void navigateToSearchPage() {
        driver.get("https://google.com/");
    }

    /*@Test
    public void startTest(){
        GoogleSearchTest obj = new GoogleSearchTest();
        obj.suiteSetup("chrome");
        obj.testGoogleSearch();
    }*/
}
