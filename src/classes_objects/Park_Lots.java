package classes_objects;

// Import necessary library.
import java.util.ArrayList;

// Class that resembles parking lots.
public class Park_Lots {

    // Declare variables: location, array list of parked cars and limit of parking lot.
    private String parkLocation;
    private ArrayList<Car> parkedCars;
    private final int limit;

    // Multi-Argument Constructor that sets location and limit.
    public Park_Lots(String parkLocation, int limit) {
        this.parkLocation = parkLocation;
        this.limit = limit;

        // Initialize a new ArrayList for the created object of the class.
        this.parkedCars = new ArrayList<>();
    }

    // Get limit of the parking lot.
    public String getLimit() {
        return "Limit of parking lot: " + limit;
    }

    // Get the list of parked cars.
    public ArrayList<Car> getParkedCars() {
        return parkedCars;
    }

    // Get size of the parking lot.
    public String getParkLotSize() {
        return "Number of cars parked in " + getParkLocation() + ":  " + this.parkedCars.size();
    }

    // Get the location of the parking lot.
    public String getParkLocation() {
        return parkLocation;
    }

    // toString method to print out the data.
    @Override
    public String toString() {
        return "Cars parked in " + getParkLocation() + ": " + getParkedCars();
    }

    // Method to park the car in the parking lot.
    public void addCars(Car car) {

        // Boolean expression whether the car is parked or not, initialize it true as default.
        boolean isParkedOrNot = true;

        // For each parked-car in the parking lot.
        for (Car parkedCar : parkedCars) {

            // If the parked-car equals car (which means if the car is already parked).
            if (parkedCar.equals(car)) {

                // Print out a message stating that the car is already parked.
                System.out.println("ERROR: (" + car.getBrand() + ") is already parked!");

                // It is false that the car is not already parked.
                isParkedOrNot = false;

                // Break the For loop.
                break;
            }
        }

        // If it is true (as default) that the car is not parked.
        if (isParkedOrNot) {

            // If the size of parking lot is less than limit.
            if (parkedCars.size() < limit) {

                // Park the car into the parking lot.
                parkedCars.add(car);

                // Print out a message stating that the car has been parked.
                System.out.println("SUCCESS: (" + car.getBrand() + ") has been parked.");
            } else /* Anything else (one condition: if the size of parking lot has reach the limit */ {

                // Print out a message stating that the parking lot is full.
                System.out.println("ERROR: unable to park (" + car.getBrand() + ") from " + getParkLocation() + " because it is full!");
            }
        }

    }

    // Method to exist the car from the parking lot.
    public void removeCars(Car car) {

        // Boolean expression whether the car is parked or not, initialize it true as default.
        boolean isParkedOrNot = true;

        // If the parking lot is empty.
        if (parkedCars.isEmpty()) {

            // Print out a message stating that the parking lot is empty whenever you attempt to exit a non-existing car.
            System.out.println("ERROR: unable to exit (" + car.getBrand() + ") from " + getParkLocation() + " because parking lot is already empty!");
        }

        // For each parked-car in the ArrayList of parking lot.
        for (Car parkedCar : parkedCars) {

            // If the parked-car equals car (which means if the car is already parked).
            if (parkedCar.equals(car)) {

                // Exit the car from the parking lot.
                parkedCars.remove(car);

                // Print out a message stating that the car has been exited from the parking lot.
                System.out.println("SUCCESS: (" + car.getBrand() + ") has exited the parking lot.");

                // It is false that the car has not exited the parking lot.
                isParkedOrNot = false;

                // Break the For loop.
                break;
            }

        }

        // If it is true that the car is not parked.
        if (isParkedOrNot) {

            // Print out a message stating that the car is already not parked.
            System.out.println("ERROR: (" + car.getBrand() + ") is already not parked!");
        }
    }

}
