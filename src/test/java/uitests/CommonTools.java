package uitests;

import org.openqa.selenium.WebElement;

public class CommonTools {
    public static int parseResults(WebElement element) {

        String entireStatsText = element.getText();
        String[] arr = entireStatsText.split(" ");
        String results = arr[1];

        String replacedComma = results.replace(",", "");
        int parsedResult = Integer.parseInt(replacedComma);

        return parsedResult;
    }
}
