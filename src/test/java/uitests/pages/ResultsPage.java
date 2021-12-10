package uitests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import uitests.CommonTools;

public class ResultsPage {
    WebDriver driver;
    By results = By.id("result-stats");

    public ResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    public int parseNumberOfResults() {
        waitForElement(results);

        WebElement statResult = driver.findElement(results);
        int parsedResult = CommonTools.parseResults(statResult);

        return parsedResult;
    }

    public void waitForElement(By elementToWait){
        WebDriverWait waitForResults = new WebDriverWait(driver,3);
        waitForResults.until(ExpectedConditions.elementToBeClickable(elementToWait));
    }
}
