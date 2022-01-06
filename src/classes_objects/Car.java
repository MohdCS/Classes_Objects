package classes_objects;

public class Car {

    private String brand, type, trim, fuel;
    private int year;
    private boolean isParked, isMoving, isEngineOn;

    public Car(String brand, String type, String trim, String fuel, int year, boolean isParked, boolean isMoving, boolean isEngineOn) {
        this.brand = brand;
        this.type = type;
        this.trim = trim;
        this.fuel = fuel;
        this.year = year;
        this.isParked = isParked;
        this.isMoving = isMoving;
        this.isEngineOn = isEngineOn;
    }

    public Car(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return brand;
    }

}
