package com.pluralsight;
import java.util.Scanner;

public class VehicleInventoryApp {

        static Vehicle[] vehicles = new Vehicle[20];
        static int vehicleCount = 6;

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Preload 6 vehicles
            vehicles[0] = new Vehicle(101121, "Ford Explorer", "Red", 45000, 13500f);
            vehicles[1] = new Vehicle(101122, "Toyota Camry", "Blue", 60000, 11000f);
            vehicles[2] = new Vehicle(101123, "Chevrolet Malibu", "Black", 50000, 9700f);
            vehicles[3] = new Vehicle(101124, "Honda Civic", "White", 70000, 7500f);
            vehicles[4] = new Vehicle(101125, "Subaru Outback", "Green", 55000, 14500f);
            vehicles[5] = new Vehicle(101126, "Jeep Wrangler", "Yellow", 30000, 16000f);

            while (true) {
                System.out.println("\nWhat do you want to do?");
                System.out.println("1 - List all vehicles");
                System.out.println("2 - Search by make/model");
                System.out.println("3 - Search by price range");
                System.out.println("4 - Search by color");
                System.out.println("5 - Add a vehicle");
                System.out.println("6 - Quit");
                System.out.print("Enter your command: ");
                int command = scanner.nextInt();
                scanner.nextLine(); // consume newline

                switch (command) {
                    case 1:
                        listAllVehicles();
                        break;
                    case 2:
                        searchByMakeModel(scanner);
                        break;
                    case 5:
                        addVehicle(scanner);
                        break;
                    case 6:
                        System.out.println("Goodbye!");
                        return;
                    default:
                        System.out.println("Invalid option. Try again.");
                }
            }
        }

        public static void listAllVehicles() {
            System.out.println("\n--- Vehicle List ---");
            for (int i = 0; i < vehicleCount; i++) {
                System.out.println(vehicles[i]);
            }
        }

        public static void searchByMakeModel(Scanner scanner) {
            System.out.print("Enter make/model to search: ");
            String searchTerm = scanner.nextLine().toLowerCase();
            boolean found = false;

            for (int i = 0; i < vehicleCount; i++) {
                if (vehicles[i].getMakeModel().toLowerCase().contains(searchTerm)) {
                    System.out.println(vehicles[i]);
                    found = true;
                }
            }

            if (!found) {
                System.out.println("No vehicles found matching that make/model.");
            }
        }

        public static void addVehicle(Scanner scanner) {
            if (vehicleCount >= vehicles.length) {
                System.out.println("Inventory full. Can't add more vehicles.");
                return;
            }

            System.out.print("Enter Vehicle ID: ");
            long id = scanner.nextLong();
            scanner.nextLine(); // consume newline

            System.out.print("Enter Make/Model: ");
            String makeModel = scanner.nextLine();

            System.out.print("Enter Color: ");
            String color = scanner.nextLine();

            System.out.print("Enter Odometer Reading: ");
            int miles = scanner.nextInt();

            System.out.print("Enter Price: ");
            float price = scanner.nextFloat();
            scanner.nextLine(); // consume newline

            vehicles[vehicleCount] = new Vehicle(id, makeModel, color, miles, price);
            vehicleCount++;

            System.out.println("Vehicle added successfully!");
        }


}
