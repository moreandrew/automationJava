public class Sedan extends Car {

    String groundClearance;
    int mpg;

    public Sedan(String make, String model, int year) {
        super(make, model, year);
    }

    public void comfortMode(){
        System.out.println("Comfort ride");
    }
}
