package com.mycompany.car_factory_management;

public class Sedan extends Vehicle {
    
    
    public Sedan() {
        super();
    }
    
    public Sedan(String engine, String fuelType, String color, int maxSpeed, int maxWeight, String yearOfManufacture) {
        super(engine, fuelType, color, maxSpeed, maxWeight, yearOfManufacture);
    }

    public double tax() {
        if (getColor().toLowerCase().equals("black")) {
            return getPrice() * 0.2;
        } else {
            return 50;
        }
    }

    public double getTotalPrice(Customer customer) {
        if (customer.isCorporateCustomer()) {
            return getPrice() + tax() - (getPrice() * 0.2) ;
        } else {
            return getPrice() + tax();
        }
    }

    public void displayInfo(Customer customer) {
        System.out.println("Sedan{" + "engine=" + engine + ", fuelType=" + fuelType + ", color=" + color + ", maxSpeed=" + maxSpeed + ", maxWeight=" + maxWeight + ", yearOfManufacture=" + yearOfManufacture +", total price ="+getTotalPrice(customer)+'}');
    }
}
