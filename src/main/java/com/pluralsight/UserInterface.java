package com.pluralsight;

import java.util.Scanner;

public class UserInterface {
    //*1 - Find vehicles within a price range
    //2 - Find vehicles by make / model
    //3 - Find vehicles by year range
    //4 - Find vehicles by color
    //5 - Find vehicles by mileage range
    //6 - Find vehicles by type (car, truck, SUV, van)
    //7 - List ALL vehicles
    //8 - Add a vehicle
    //9 - Remove a vehicle
    //99 - Quit

    static Scanner scanner = new Scanner(System.in);
    private Dealership dealership;
    private String file;

    public UserInterface(String file) {
        this.file = file;
        this.dealership = DealershipFileManager.getDealership(file);
    }


    public void displayMenu(){
        System.out.println("\n||||| Welcome To My Dealership ||||||");
        System.out.println("=====================================");
        System.out.println("1 - Find vehicles within a price range");
        System.out.println("2 - Find vehicles by make / model");
        System.out.println("3 - Find vehicles by year range");
        System.out.println("4 - Find vehicles by color");
        System.out.println("5 - Find vehicles by mileage range");
        System.out.println("6 - Find vehicles by type (car, truck, SUV, van)");
        System.out.println("7 - List ALL vehicles");
        System.out.println("8 - Add a vehicle");
        System.out.println("9 - Remove a vehicle");
        System.out.println("99 - Quit");
    }

    public void choiceMenu(){
        boolean run = true;
        while(run){
            displayMenu();
            System.out.print("Choose an option(Please enter a number): ");
            int choice = scanner.nextInt();

            switch (choice){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    listAllVehicles();
                    break;
                case 8:
                    addVehicleToFile();
                    break;
                case 9:
                    break;
                case 99:
                    System.out.println("||||||| BYE BYE COME AGAIN!!! |||||||");
                    System.out.println("=====================================");
                    run = false;
                default:
                    System.out.println("\n=====Invalid Choice Pick Again=====\n\n");
            }
        }
    }
    private void listAllVehicles(){
        for(Vehicle vehicle : dealership.getVehicles()){
            System.out.println(vehicle.toFile());
        }
    }

    private void addVehicleToFile(){
        System.out.print("VIN: ");
        int vin = Integer.parseInt(scanner.nextLine());
        System.out.print("Year: ");
        int year = Integer.parseInt(scanner.nextLine());
        System.out.print("Make: ");
        String make = scanner.nextLine();
        System.out.print("Model: ");
        String model = scanner.nextLine();
        System.out.print("Type: ");
        String type = scanner.nextLine();
        System.out.print("Color: ");
        String color = scanner.nextLine();
        System.out.print("Mileage: ");
        int mileage = Integer.parseInt(scanner.nextLine());
        System.out.print("Price: ");
        double price = Double.parseDouble(scanner.nextLine());

        Vehicle vehicle = new Vehicle(vin, year, make, model, type, color, mileage, price);
        dealership.addVehicle(vehicle);
        System.out.println("Vehicle added successfully");
    }

}
