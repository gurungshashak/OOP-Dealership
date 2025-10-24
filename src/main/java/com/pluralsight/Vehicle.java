package com.pluralsight;

public class Vehicle {
    private int vin, year;
    private String make, model, type, color;
    private int odometer;
    private double price;

    public Vehicle(int vin, int year, String make, String model, String type, String color, int odometer, double price) {
        this.vin = vin;
        this.year = year;
        this.make = make;
        this.model = model;
        this.type = type;
        this.color = color;
        this.odometer = odometer;
        this.price = price;
    }

    public int getVin() {
        return vin;
    }
    public int getYear() {
        return year;
    }
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public String getType() {
        return type;
    }
    public String getColor() {
        return color;
    }
    public int getOdometer() {
        return odometer;
    }
    public double getPrice() {
        return price;
    }

    public String toFile(){
        return String.format("%d|%d|%s|%s|%s|%S|%d|%.2f", vin, year, make, model, type, color, odometer, price);
    }
}
