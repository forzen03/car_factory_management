package com.mycompany.car_factory_management;

public class Employee {

    protected float salary=10;
    protected int hoursWorked;
    private EmployeesInformation EmployeesInfo;//composition

    public Employee() {
    }

    public Employee(float salary, int hoursWorked, String name, String jobTitle, String accountNumber, String nationality, int ID) {
        this.salary = salary;
        this.hoursWorked = hoursWorked;
        this.EmployeesInfo = new EmployeesInformation(name, jobTitle, accountNumber, nationality, ID);
    }
    
    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public EmployeesInformation getEmployeesInfo() {
        return EmployeesInfo;
    }

    public void setEmployeesInfo(EmployeesInformation EmployeesInfo) {
        this.EmployeesInfo = EmployeesInfo;
    }
    public static void printEmployeeHeader(){
        System.out.printf("%-4s%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n","#","Name","ID","Nationality","Account","JobTitle","Salary","HoursWorked");
    }
    public void printFormatEmployee(){
        System.out.printf("%-4s"," ");
        System.out.printf("%-15s",this.EmployeesInfo.getName());
        System.out.printf("%-15s",this.EmployeesInfo.getID());
        System.out.printf("%-15s",this.EmployeesInfo.getNationality());
        System.out.printf("%-15s",this.EmployeesInfo.getAccountNumber());
        System.out.printf("%-15s",this.EmployeesInfo.getJobTitle());
        System.out.printf("%-15s",this.getSalary());
        System.out.printf("%-15s",this.getHoursWorked());}
    public void displayInfo() {
        System.out.println("Employee{ salary per hour= "+ salary + ", EmployeesInfo=" + EmployeesInfo + ", hours Worked=" + hoursWorked + '}');
    }

}
