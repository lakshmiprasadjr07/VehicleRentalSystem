// Parent class - Part 1
public class Vehicle {
    int vehicleId;
    String vehicleName;
    String vehicleType;
    double pricePerDay;
    boolean available;

    // Constructor
    public Vehicle(int vehicleId, String vehicleName,
            String vehicleType, double pricePerDay) {

        this.vehicleId = vehicleId;
        this.vehicleName = vehicleName;
        this.vehicleType = vehicleType;
        this.pricePerDay = pricePerDay;
        this.available = true;
    }

    // Display vehicle details
    public void displayVehicle() {
        System.out.printf("%-10d %-15s %-10s %-12.2f %-12s%n",
                vehicleId,
                vehicleName,
                vehicleType,
                pricePerDay,
                available ? "Available" : "Rented");
    }
}
