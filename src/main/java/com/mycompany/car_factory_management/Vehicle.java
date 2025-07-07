package com.mycompany.car_factory_management;

public class Vehicle {

    protected String engine;
    protected String fuelType;
    protected String color;
    protected int maxSpeed;
    protected int maxWeight;
    protected String yearOfManufacture;
    protected static int price=10000;
    public int numberOfSalesVehicle =0;
    protected double totalPrice=0;
    
    public Vehicle() {
        this.engine = "Unknown";
        this.fuelType = "Unknown";
        this.color = "Unknown";
        this.maxSpeed = 0;
        this.maxWeight = 0;
        this.yearOfManufacture = "Unknown";
    }

    public Vehicle(String engine, String fuelType, String color, int maxSpeed, int maxWeight, String yearOfManufacture) {
        this.engine = engine;
        this.fuelType = fuelType;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.maxWeight = maxWeight;
        this.yearOfManufacture = yearOfManufacture;
        this.numberOfSalesVehicle++;
    }

    public void setNumberOfSalesVehicle() {
        numberOfSalesVehicle++;
    }
    public int getNumberOfSalesVehicle() {
        return numberOfSalesVehicle;
    }
    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    

    public String getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(String yearOfManufacture) {
        if (yearOfManufacture.matches("\\d+") && yearOfManufacture.length() == 4) {
            this.yearOfManufacture = yearOfManufacture;
        }
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Vehicle{" + "engine=" + engine + ", fuelType=" + fuelType + ", color=" + color + ", maxSpeed=" + maxSpeed + ", maxWeight=" + maxWeight + ", yearOfManufacture=" + yearOfManufacture + ", price=" + price + '}');
    }

}
