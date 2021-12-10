import org.testng.annotations.Test;
import uitests.TestBase;

public class XPathTest extends TestBase {
    @Test
    public void testName() {
        String fullXpath = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input";
        String relativeXpath = "//form/div[1]/div[1]/div[1]/div/div[2]/input";

        //  //<HTML tag>[@attribute_name='attribute_value']
        String xpath1 = "*[@name='q']";
        String xpath2 = "input[@name='q'][@title='search']";
    }
}
