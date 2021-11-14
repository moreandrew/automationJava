import org.testng.Assert;
import org.testng.annotations.Test;


public class StudentTest {

    @Test
    public void testName() {
        Student studentOne = new Student("Andrew", "Smith");

        //studentOne.printName();
        //boolean isNameCorrect = studentOne.firstName.contentEquals("Andrew");
        Assert.assertEquals(studentOne.firstName, "Andrew");
    }
}
