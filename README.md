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
│   ├── launch.json          # VS Code launch configuration
│   └── settings.json        # VS Code Java project paths
├── bin/                     # Compiled .class files (git ignored)
├── src/
│   └── VehicleRentalSystem.java # Core application source code
├── .gitignore               # Git ignore rules
└── README.md                # Project documentation
```

---

## 🛠️ How to Compile and Run

### Option 1: Using VS Code
1. Open this folder in VS Code (`File` > `Open Folder...`).
2. Open `src/VehicleRentalSystem.java`.
3. Click the **Run** button (or press `F5`) to start with interactive terminal input.

### Option 2: Using Command Prompt / PowerShell
1. Compile the Java file:
   ```powershell
   javac -d bin src/VehicleRentalSystem.java
   ```
2. Run the application:
   ```powershell
   java -cp bin VehicleRentalSystem
   ```

---

## 📦 Pushing to GitHub

### Method A: From VS Code (Easiest)
1. Open VS Code with this project folder.
2. Click the **Source Control** icon on the left sidebar (or press `Ctrl + Shift + G`).
3. Click **"Publish to GitHub"** (or **"Publish Branch"**).
4. Select **Publish to GitHub public repository** (or private repository).
5. VS Code will prompt you to authorize your GitHub account and push the code automatically.

### Method B: Using Git Terminal
1. Create a new repository on [GitHub](https://github.com/new).
2. Run the following commands in the project directory:
   ```powershell
   git remote add origin https://github.com/<YOUR_USERNAME>/<REPO_NAME>.git
   git branch -M main
   git push -u origin main
   ```
