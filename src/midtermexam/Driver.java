package midtermexam;

import java.util.ArrayList;

public class Driver {
    ArrayList<Vehicle> vehicles = new ArrayList<>();

    public void addVehicle (Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void printVehicles() {
        for (Vehicle vehicle: vehicles) {
            System.out.println(vehicle);
        }
    }

    public void accelerateOfVehicles() {
        for (Vehicle vehicle: vehicles) {
            vehicle.accelerate();
        }
    }


    public void move(Vehicle vehicle) {
        System.out.println("This vehicle moves:");
        vehicle.accelerate();
        vehicle.steerLeft();
        vehicle.steerRight();
    }



    public static void main(String[] args) {
        Driver driver = new Driver();
        Car car1 = new Car(2000);
        Car car2 = new Car(2000);
        Car car3 = new Car(-11);
        Boat boat1 = new Boat(15_000);
        Boat boat2 = new Boat(25_000);
        Boat boat3 = new Boat(35_000);
        driver.addVehicle(car1);
        driver.addVehicle(car2);
        driver.addVehicle(car3);
        driver.addVehicle(boat1);
        driver.addVehicle(boat2);
        driver.addVehicle(boat3);

        driver.printVehicles();

        driver.accelerateOfVehicles();

        driver.move(driver.vehicles.get(1));
    }

}
