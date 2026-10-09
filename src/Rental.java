// Rental class - Part 3
public class Rental {
    Customer customer;
    Vehicle vehicle;
    int numberOfDays;
    double totalAmount;

    public Rental(Customer customer, Vehicle vehicle,
           int numberOfDays) {

        this.customer = customer;
        this.vehicle = vehicle;
        this.numberOfDays = numberOfDays;

        this.totalAmount =
                vehicle.pricePerDay * numberOfDays;
    }

    // Display rental details
    public void displayRental() {

        System.out.println("----------------------------------------");
        System.out.println("Customer ID   : " + customer.customerId);
        System.out.println("Customer Name : " + customer.customerName);
        System.out.println("Phone Number  : " + customer.phoneNumber);
        System.out.println("Vehicle ID    : " + vehicle.vehicleId);
        System.out.println("Vehicle Name  : " + vehicle.vehicleName);
        System.out.println("Vehicle Type  : " + vehicle.vehicleType);
        System.out.println("Price/Day     : Rs." + vehicle.pricePerDay);
        System.out.println("Rental Days   : " + numberOfDays);
        System.out.println("Total Amount  : Rs." + totalAmount);
        System.out.println("----------------------------------------");
    }
}
