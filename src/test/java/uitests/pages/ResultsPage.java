package uitests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import uitests.CommonTools;

public class ResultsPage {
    WebDriver driver;
    By results = By.id("result-stats");

    public ResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    public int parseNumberOfResults() {
        WebElement statResult = driver.findElement(results);
        int parsedResult = CommonTools.parseResults(statResult);

        return parsedResult;
    }
}
