package com.pluralsight;

import java.util.Scanner;

public class UserInterface {
    static Scanner scanner = new Scanner(System.in);
    Dealership deal = new Dealership("","","");
    DealershipFileManager fileManager = new DealershipFileManager();

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

    public void displayMenu(){
        System.out.println("||||| Welcome To My Dealership ||||||");
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
        while(true){
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
                    listAll();
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 99:
                    System.out.println("||||||| BYE BYE COME AGAIN!!! |||||||");
                    System.out.println("=====================================");
                    break;
                default:
                    System.out.println("=====Invalid Choice Pick Again=====");
            }
        }
    }

    public void listAll (){
        for(Vehicle vehicle : deal.getVehicles()){
            System.out.println(vehicle);
        }
    }

    public void addVehicle(){
        System.out.print("VIN: ");
        int vin = Integer.parseInt(scanner.nextLine());
        System.out.println("Year: ");
        int year = Integer.parseInt(scanner.nextLine());
        System.out.println("Make: ");
        String make = scanner.nextLine();
        System.out.println("Model: ");
        String model = scanner.nextLine();
        System.out.println("Type: ");
        String type = scanner.nextLine();
        System.out.println("Color: ");
        String color = scanner.nextLine();
        System.out.println("Mileage: ");
        int mileage = Integer.parseInt(scanner.nextLine());
        System.out.println("Price: ");
        double price = Double.parseDouble(scanner.nextLine());

        Vehicle vehicle = new Vehicle(vin, year, make, model, type, color, mileage, price);
        deal.addVehicle(vehicle);

    }



}
