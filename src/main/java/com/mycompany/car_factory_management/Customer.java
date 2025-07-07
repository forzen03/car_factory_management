package com.mycompany.car_factory_management;

public class Customer {

    private String name;
    private String ID;
    private boolean corporateCustomer;
    public SUV suv;
    public Sedan sedan;
    
    public Customer() {
        this.name = "Unknown";
        this.ID = "0000";
        this.corporateCustomer = false;
    }
    
    public Customer(String name, String ID) {
        this.name = name;
        this.ID = ID;
    }
 
    public Customer(String name, String ID, boolean corporateCustomer,SUV suv,Sedan sedan) {
        this.name = name;
        this.ID = ID;
        this.corporateCustomer = corporateCustomer;
        this.sedan=sedan;
        this.suv=suv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        if (ID.matches("\\d+")) {
            this.ID = ID;
        }
    }

    public boolean isCorporateCustomer() {
        return corporateCustomer;
    }

    public void setCorporateCustomer(boolean corporateCustomer) {
        this.corporateCustomer = corporateCustomer;
    }

    public SUV getSuv() {
        return suv;
    }

    public void setSuv(SUV suv) {
        this.suv = suv;
    }

    public Sedan getSedan() {
        return sedan;
    }

    public void setSedan(Sedan sedan) {
        this.sedan = sedan;
    }
    
    @Override
    public String toString() {
        return "Customer{" + "name=" + name + ", ID=" + ID + ", corporateCustomer=" + corporateCustomer +'}';
    }


    
}
