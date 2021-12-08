package uitests;

import org.testng.Assert;
import org.testng.annotations.Test;
import uitests.TestBase;
import uitests.pages.MainPage;
import uitests.pages.ResultsPage;

import static java.lang.Thread.sleep;

public class GoogleSearchTest extends TestBase {

    @Test
    public void testGoogleSearch() {

        MainPage mainPage = new MainPage(driver);

        mainPage.navigateToMainPage();
        mainPage.typeAndSubmitQuery();

        ResultsPage resultsPage = new ResultsPage(driver);
        int actualResults = resultsPage.parseNumberOfResults();

        Assert.assertTrue(actualResults > 1000);
    }
}
