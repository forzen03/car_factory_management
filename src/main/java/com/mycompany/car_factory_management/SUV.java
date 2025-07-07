package com.mycompany.car_factory_management;

public class SUV extends Vehicle {
    private int passengers;
    

    public SUV() {
        super();
        passengers = 4;
    }

    public SUV(String engine, String fuelType, String color, int maxSpeed, int maxWeight, String yearOfManufacture,int passengers) {
        super(engine, fuelType, color, maxSpeed, maxWeight, yearOfManufacture);
        this.passengers = passengers;
    }

    public int getPassengers() {
        return passengers;
    }
    
    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }
    
    public double tax() {
        if (getPassengers() > 6) {
            return getPrice() * 0.1f;
        } else {
            return 100;
        }
    }
    public double getTotalPrice(Customer Customer) {
        if(Customer.isCorporateCustomer())
            return getPrice() + tax()-(getPrice()*0.2);
        else
            return getPrice() + tax();
    }

    @Override
    public String toString() {
        return "SUV{" + "passengers=" + passengers + '}';
    }
    
    public void displayInfo(Customer Customer){
        System.out.println("SUV{" + "engine=" + engine + ", fuelType=" + fuelType + ", color=" + color + ", maxSpeed=" + maxSpeed + ", maxWeight=" + maxWeight + ", yearOfManufacture=" + yearOfManufacture + ", passengers=" + passengers +", total price = "+getTotalPrice(Customer)+'}');
    }
    

}
