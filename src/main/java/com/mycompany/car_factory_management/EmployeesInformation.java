package com.mycompany.car_factory_management;

public class EmployeesInformation {

    private String name;
    private String jobTitle;
    private String accountNumber;
    private String nationality;
    private int ID;

    public EmployeesInformation() {
        this.name = "Unknown";
        this.jobTitle = "Unknown";
        this.accountNumber = "Unknown";
        this.nationality = "Unknown";
        this.ID = 0;
    }

    public EmployeesInformation(String name, String jobTitle, String accountNumber, String nationality, int ID) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.accountNumber = accountNumber;
        this.nationality = nationality;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.matches("\\d+")) {
            this.name = name;
        }
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        if (accountNumber.matches("\\d+")) {
            this.accountNumber = accountNumber;
        }
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        if (!nationality.matches("\\d+")) {
            this.nationality = nationality;
        }
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void displayInfo() {
        System.out.println("Employee Information{" + "name=" + name + ", jobTitle=" + jobTitle + ", accountNumber=" + accountNumber + ", nationality=" + nationality + ", ID=" + ID + '}');

    }

}
