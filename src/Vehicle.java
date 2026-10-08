public class Vehicle {
    private int vehicleId;
    private String vehicleName;
    private String vehicleType;
    private double pricePerDay;
    private boolean available;

    // Constructor
    public Vehicle(int vehicleId, String vehicleName, String vehicleType, double pricePerDay) {
        this.vehicleId = vehicleId;
        this.vehicleName = vehicleName;
        this.vehicleType = vehicleType;
        this.pricePerDay = pricePerDay;
        this.available = true;
    }

    // Getters and Setters
    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
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
