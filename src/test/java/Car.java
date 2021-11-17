public class Car {
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    void drive(){
        System.out.println("Driving");
    }

    void turnLeft(){
        System.out.println("Turned left");
    }

    void turnRight(){
        System.out.println("Turned right");
    }
}
