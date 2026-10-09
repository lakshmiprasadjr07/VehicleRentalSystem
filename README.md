# Vehicle Rental Management System

A Java console-based Vehicle Rental Management System that allows managing vehicles, booking rentals, returning vehicles, and calculating bills.

## 🚀 Features

- **Add Vehicle**: Add new vehicles (Cars, Bikes) with ID, Name, Type, and Price per Day.
- **View All Vehicles**: Display full list of vehicles with current availability status.
- **View Available Vehicles**: Filter and list only vehicles ready for rental.
- **Rent Vehicle**: Assign vehicles to customers with automatic total cost calculation based on duration.
- **Return Vehicle**: Mark rented vehicles as available again.
- **View Rental Records**: Review customer rental history and invoices.

---

## 📁 Project Structure

```text
VehicleRentalSystem/
├── .vscode/
│   ├── launch.json              # VS Code launch configuration for terminal input
│   └── settings.json            # VS Code Java project paths
├── bin/                         # Compiled .class files (git ignored)
├── src/
│   ├── Vehicle.java             # Part 1: Vehicle parent class (attributes, pricing, availability)
│   ├── Customer.java            # Part 2: Customer entity (ID, name, phone)
│   ├── Rental.java              # Part 3: Rental calculation and booking invoice
│   └── VehicleRentalSystem.java # Part 4: Main application menu and rental management
├── .gitignore                   # Git ignore rules (*.class, bin/)
└── README.md                    # Project documentation
```

---

## 🛠️ How to Compile and Run

### Option 1: Using VS Code
1. Open this folder in VS Code (`File` > `Open Folder...`).
2. Open `src/VehicleRentalSystem.java`.
3. Click the **Run** button (or press `F5`) to start with interactive terminal input.

### Option 2: Using Command Prompt / PowerShell
1. Compile all Java source files:
   ```powershell
   javac -d bin src/*.java
   ```
2. Run the main application:
   ```powershell
   java -cp bin VehicleRentalSystem
   ```

---

## 📦 GitHub Repository

- **Repository**: [https://github.com/lakshmiprasadjr07/VehicleRentalSystem](https://github.com/lakshmiprasadjr07/VehicleRentalSystem)
- **Branch**: `main`
