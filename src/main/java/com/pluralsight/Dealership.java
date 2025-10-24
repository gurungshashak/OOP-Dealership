package com.pluralsight;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Dealership {
    private String name,address, phone;
    private ArrayList<Vehicle> vehicles;

    public  Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.vehicles = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String getPhone() {
        return phone;
    }

    //adding and removing vehicle
    public void addVehicle(Vehicle v){
        this.vehicles.add(v);
    }
    public void removeVehicle(Vehicle v){
        this.vehicles.remove(v);
    }

    //getting all vehicle
    public ArrayList<Vehicle> getVehicles(){
        return this.vehicles;
    }

    //get vehicle by min or max price
    public ArrayList<Vehicle> getVehiclesByPrice(double min, double max){
        return (ArrayList<Vehicle>) vehicles.stream()
                .filter(vehicle -> vehicle.getPrice() >= min && vehicle.getPrice() <= max)
                .collect(Collectors.toList());
    }

    // get vehicle by Model
    public ArrayList<Vehicle> getVehiclesByMakeModel(String make, String model){
        return (ArrayList<Vehicle>) vehicles.stream()
                .filter(vehicle -> vehicle.getMake().equalsIgnoreCase(make) && vehicle.getModel().equalsIgnoreCase(model))
                .collect(Collectors.toList());
    }

    //get vehicle by year
    public ArrayList<Vehicle> getVehiclesByYear(int min, int max){
        return (ArrayList<Vehicle>) vehicles.stream()
                .filter(vehicle -> vehicle.getYear() >= min && vehicle.getYear() <= max)
                .collect(Collectors.toList());
    }

    //get vehicle by color
    public ArrayList<Vehicle> getVehiclesByColor(String color ){
        return (ArrayList<Vehicle>) vehicles.stream()
                .filter(vehicle ->vehicle.getColor().equalsIgnoreCase(color))
                .collect(Collectors.toList());
    }

    //get vehicle by Mileage
    public ArrayList<Vehicle> getVehiclesByMileage(int min, int max){
        return (ArrayList<Vehicle>) vehicles.stream()
                .filter(vehicle -> vehicle.getOdometer() >= min && vehicle.getOdometer() <= max)
                .collect(Collectors.toList());
    }

    //get vehicle by Type
    public  ArrayList<Vehicle> getVehiclesByType(String type){
        return (ArrayList<Vehicle>) vehicles.stream()
                .filter(vehicle -> vehicle.getType().equalsIgnoreCase(type))
                .collect(Collectors.toList());
    }
}
