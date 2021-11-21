import org.testng.annotations.Test;

public class CarTest {

    @Test
    public void testName() {
        Car myCar = new Car("Ford", "Fusion", 2011);
        Car myCar2 = new Car("Toyota", "Camry", 2000);

        myCar.drive();
        myCar.turnLeft();
        myCar.turnRight();

    }
}
