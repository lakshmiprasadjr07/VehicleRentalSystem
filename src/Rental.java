public class Rental {
    private Customer customer;
    private Vehicle vehicle;
    private int numberOfDays;
    private double totalAmount;

    public Rental(Customer customer, Vehicle vehicle, int numberOfDays) {
        this.customer = customer;
        this.vehicle = vehicle;
        this.numberOfDays = numberOfDays;
        this.totalAmount = vehicle.getPricePerDay() * numberOfDays;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    // Display rental details
    public void displayRental() {
        System.out.println("----------------------------------------");
        System.out.println("Customer ID   : " + customer.getCustomerId());
        System.out.println("Customer Name : " + customer.getCustomerName());
        System.out.println("Phone Number  : " + customer.getPhoneNumber());
        System.out.println("Vehicle ID    : " + vehicle.getVehicleId());
        System.out.println("Vehicle Name  : " + vehicle.getVehicleName());
        System.out.println("Vehicle Type  : " + vehicle.getVehicleType());
        System.out.println("Price/Day     : Rs." + vehicle.getPricePerDay());
        System.out.println("Rental Days   : " + numberOfDays);
        System.out.println("Total Amount  : Rs." + totalAmount);
        System.out.println("----------------------------------------");
    }
}
