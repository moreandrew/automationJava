package uitests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {

    private WebDriver driver;
    By searchInput = By.name("q");

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToMainPage() {
        driver.get("https://google.com/");
    }

    public void typeAndSubmitQuery(String queryText) {
        WebElement textInput = driver.findElement(searchInput);
        textInput.sendKeys(queryText);
        textInput.submit();
    }

}
