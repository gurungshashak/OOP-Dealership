package com.pluralsight;

import java.io.*;

public class DealershipFileManager {
    public static Dealership getDealership(String file){
        try (BufferedReader bufReader = new BufferedReader(new FileReader("src/main/resources/CarDealerShip.CSV"))) {
            String line = bufReader.readLine();
            if(line == null) throw new IOException("Error reading file");

            String[] data = line.split("\\|");
            Dealership dealership = new Dealership(data[0],data[1],data[2]);

            while ((line = bufReader.readLine()) != null) {
                String[] lines = line.split("\\|");
                Vehicle vehicle = new Vehicle(Integer.parseInt(lines[0]), Integer.parseInt(lines[1]), lines[2], lines[3], lines[4], lines[5], Integer.parseInt(lines[6]), Double.parseDouble(lines[7]));
                dealership.addVehicle(vehicle);
            }
            return dealership;
        }catch (IOException e){
            System.out.println("Error reading file");
            e.printStackTrace();
        }
        return null;
    }

    public static void SaveDealership(Dealership dealership){
        try (BufferedWriter bufWriter = new BufferedWriter(new FileWriter("src/main/resources/CarDealerShip.CSV", true))) {
            bufWriter.write(dealership.getName() + "|" + dealership.getAddress() + "|" + dealership.getPhone());

            for(Vehicle vehicle : dealership.getVehicles()){
                bufWriter.write(vehicle.toFile());
            }

        }catch (IOException e) {
            System.out.println("Error saving to file");
            e.printStackTrace();
        }
    }

}

