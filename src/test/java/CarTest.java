import org.testng.annotations.Test;

public class CarTest {

    @Test
    public void testName() {
        Car myCar = new Car("Ford", "Fusion", 2011);

        myCar.drive();
        myCar.turnLeft();
        myCar.turnRight();

    }
}
