package uitests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import uitests.TestBase;
import uitests.pages.MainPage;
import uitests.pages.ResultsPage;

import static java.lang.Thread.sleep;

public class GoogleSearchTest extends TestBase {


    Object[] arr = new Object[] {"Portnov com", "test"};


    @DataProvider (name="stringForQuery")
    public Object[][] dataProvider() {
        return new Object[][] {
                {"Portnov computer school"},
                {"portnov"}
        };
    }

    @Test
    public void testName() {
        System.out.println(arr[0]);
    }

    @Test(dataProvider = "stringForQuery")
    public void testGoogleSearch(String queryText) {

        MainPage mainPage = new MainPage(driver);

        mainPage.navigateToMainPage();
        mainPage.typeAndSubmitQuery(queryText);

        ResultsPage resultsPage = new ResultsPage(driver);
        int actualResults = resultsPage.parseNumberOfResults();

        Assert.assertTrue(actualResults > 1000);
    }
}
