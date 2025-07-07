package com.mycompany.car_factory_management;

import java.util.ArrayList;

public class FinancialManagement {

    private static double worthness=1000000;
    private ArrayList <Employee> employees;
    public int numberOfEmployee=0;
    public double profit ;
    public Vehicle v;

    public FinancialManagement(Vehicle v) {
        this.v = v;
    }
    
    public FinancialManagement(ArrayList <Employee> employees, int numberOfEmployee,Vehicle v) {
        this.employees = employees;
        this.numberOfEmployee = numberOfEmployee;
        this.v=v;
    }
    
    public FinancialManagement(int numberOfEmployee) {
        this.numberOfEmployee = numberOfEmployee;
    }
    
    public FinancialManagement(ArrayList <Employee> employees) {
        this.employees = employees;
    }
    
    public double getWorthness() {
        return worthness;
    }

    public void setWorthness(double worthness) {
        this.worthness = worthness;
    }

    public double getSalaryOfEmployees() {
        double sum=0;
        for (int i = 0; i < employees.size(); i++) {
            sum+=employees.get(i).hoursWorked*employees.get(i).salary;
        }
        return sum;
    }

    public double getLoss() {
        return getSalaryOfEmployees() * numberOfEmployee;
    }

    public double getProfit(Vehicle v) {
        this.profit = v.getNumberOfSalesVehicle() * 1500;
        return profit;
    }

    public double worthnessNow() {
        return this.worthness - getSalaryOfEmployees() + getProfit(v);
    }

    public void totalFinancial() {
        System.out.println("worthness before : " + getWorthness() + "worthness after operations :" + worthnessNow());
    }
}
