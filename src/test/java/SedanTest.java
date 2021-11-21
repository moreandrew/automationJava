import org.testng.annotations.Test;

public class SedanTest {
    @Test
    public void testSedan() {
        Sedan myCar = new Sedan("Buick", "Park Ave", 2005);
        myCar.comfortMode();
        myCar.mpg=25;
        myCar.drive();
    }
}
