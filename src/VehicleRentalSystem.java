import java.util.ArrayList;
import java.util.Scanner;

public class VehicleRentalSystem {

    static Scanner sc = new Scanner(System.in);

    static ArrayList<Vehicle> vehicles = new ArrayList<>();
    static ArrayList<Rental> rentals = new ArrayList<>();

    static int customerCounter = 1001;

    // Add vehicle
    static void addVehicle() {
        System.out.println("\n========== ADD VEHICLE ==========");

        System.out.print("Enter Vehicle ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Vehicle Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Vehicle Type (Car/Bike): ");
        String type = sc.nextLine();

        System.out.print("Enter Price Per Day: ");
        double price = sc.nextDouble();

        Vehicle vehicle = new Vehicle(id, name, type, price);
        vehicles.add(vehicle);

        System.out.println("Vehicle added successfully!");
    }

    // Display all vehicles
    static void displayVehicles() {
        if (vehicles.isEmpty()) {
            System.out.println("\nNo vehicles available.");
            return;
        }

        System.out.println("\n================ VEHICLE LIST ================");
        System.out.printf("%-10s %-15s %-10s %-12s %-12s%n",
                "ID", "Name", "Type", "Price/Day", "Status");
        System.out.println("------------------------------------------------------------");

        for (Vehicle v : vehicles) {
            v.displayVehicle();
        }
    }

    // Display available vehicles
    static void displayAvailableVehicles() {
        boolean found = false;

        System.out.println("\n=========== AVAILABLE VEHICLES ===========");
        System.out.printf("%-10s %-15s %-10s %-12s%n", "ID", "Name", "Type", "Price/Day");
        System.out.println("------------------------------------------------");

        for (Vehicle v : vehicles) {
            if (v.isAvailable()) {
                System.out.printf("%-10d %-15s %-10s %-12.2f%n",
                        v.getVehicleId(),
                        v.getVehicleName(),
                        v.getVehicleType(),
                        v.getPricePerDay());
                found = true;
            }
        }

        if (!found) {
            System.out.println("No vehicles are available.");
        }
    }

    // Find vehicle using ID
    static Vehicle findVehicle(int id) {
        for (Vehicle v : vehicles) {
            if (v.getVehicleId() == id) {
                return v;
            }
        }
        return null;
    }

    // Rent vehicle
    static void rentVehicle() {
        if (vehicles.isEmpty()) {
            System.out.println("No vehicles available.");
            return;
        }

        displayAvailableVehicles();

        System.out.print("\nEnter Vehicle ID to rent: ");
        int vehicleId = sc.nextInt();

        Vehicle vehicle = findVehicle(vehicleId);

        if (vehicle == null) {
            System.out.println("Vehicle not found.");
            return;
        }

        if (!vehicle.isAvailable()) {
            System.out.println("Vehicle is already rented.");
            return;
        }

        sc.nextLine();

        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Phone Number: ");
        String phone = sc.nextLine();

        System.out.print("Enter Number of Days: ");
        int days = sc.nextInt();

        if (days <= 0) {
            System.out.println("Number of days must be greater than zero.");
            return;
        }

        Customer customer = new Customer(customerCounter++, name, phone);
        Rental rental = new Rental(customer, vehicle, days);

        rentals.add(rental);

        // Change vehicle status
        vehicle.setAvailable(false);

        System.out.println("\nVehicle rented successfully!");
        System.out.println("Customer ID: " + customer.getCustomerId());
        System.out.println("Total Amount: Rs." + rental.getTotalAmount());
    }

    // Return vehicle
    static void returnVehicle() {
        System.out.println("\n========== RETURN VEHICLE ==========");

        System.out.print("Enter Vehicle ID: ");
        int vehicleId = sc.nextInt();

        Vehicle vehicle = findVehicle(vehicleId);

        if (vehicle == null) {
            System.out.println("Vehicle not found.");
            return;
        }

        if (vehicle.isAvailable()) {
            System.out.println("This vehicle is not currently rented.");
            return;
        }

        vehicle.setAvailable(true);

        System.out.println("Vehicle returned successfully!");
        System.out.println("Vehicle " + vehicle.getVehicleName() + " is now available.");
    }

    // Display rental records
    static void displayRentalRecords() {
        if (rentals.isEmpty()) {
            System.out.println("\nNo rental records available.");
            return;
        }

        System.out.println("\n========== RENTAL RECORDS ==========");

        for (Rental r : rentals) {
            r.displayRental();
        }
    }

    // Main method
    public static void main(String[] args) {
        int choice;

        // Adding sample vehicles
        vehicles.add(new Vehicle(101, "Swift", "Car", 1500));
        vehicles.add(new Vehicle(102, "Creta", "Car", 2000));
        vehicles.add(new Vehicle(103, "Royal Enfield", "Bike", 800));
        vehicles.add(new Vehicle(104, "Activa", "Bike", 500));

        do {
            System.out.println("\n");
            System.out.println("==============================================");
            System.out.println("       VEHICLE RENTAL MANAGEMENT SYSTEM");
            System.out.println("==============================================");
            System.out.println("1. Add Vehicle");
            System.out.println("2. View All Vehicles");
            System.out.println("3. View Available Vehicles");
            System.out.println("4. Rent Vehicle");
            System.out.println("5. Return Vehicle");
            System.out.println("6. View Rental Records");
            System.out.println("7. Exit");
            System.out.println("==============================================");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addVehicle();
                    break;
                case 2:
                    displayVehicles();
                    break;
                case 3:
                    displayAvailableVehicles();
                    break;
                case 4:
                    rentVehicle();
                    break;
                case 5:
                    returnVehicle();
                    break;
                case 6:
                    displayRentalRecords();
                    break;
                case 7:
                    System.out.println("Thank you for using Vehicle Rental System!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 7);

        sc.close();
    }
}
