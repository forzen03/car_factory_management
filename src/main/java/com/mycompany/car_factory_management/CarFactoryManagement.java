package com.mycompany.car_factory_management;

import java.util.ArrayList;
import java.util.Scanner;

public class CarFactoryManagement {

    static Scanner in = new Scanner(System.in);

    public static void drawMenu() {
        System.out.println("Please select your role :");
        System.out.println("1- Customer");
        System.out.println("2- Employee");
        System.out.println("0- Exit");
    }

    public static void customerMenu1(ArrayList<Customer> customers, int countCustomers) {
        System.out.println("Choose what type of customer you are:");
        System.out.println("1- Corporate customer");
        System.out.println("2- Individual customer");
        System.out.println("0- Exit");
        int choice = in.nextInt();
        if (choice == 1) {
            customers.get(countCustomers).setCorporateCustomer(true);
        } else if (choice == 2) {
            customers.get(countCustomers).setCorporateCustomer(false);
        }
        else{
            System.out.println("you entered wrong we will assume you are not corporate customer");
            customers.get(countCustomers).setCorporateCustomer(false);
        }
        System.out.println("*****************************************************************");
    }
    public static void customerMenu2() {
        System.out.println("");
        System.out.println("Choose the type of car:");
        System.out.println("1- SUV \n2- Sedan");
    }
    public static void fillSUVList(ArrayList<SUV> suvs) {
        System.out.println("");
        System.out.println("enter the data below the data type");
        System.out.println("engine  fuelType  color  maxSpeed  maxWeight  yearOfManufacture  passengers");
        SUV suv1 = new SUV(in.next(), in.next(), in.next(), in.nextInt(), in.nextInt(), in.next(), in.nextInt());
        suvs.add(suv1);
        System.out.println("congratulations you added SUV");
        
    }
    public static void fillSedanList(ArrayList<Sedan> sedans) {
        
        System.out.println("enter the data below the data type");
        System.out.println("engine  fuelType  color  maxSpeed  maxWeight  yearOfManufacture");
        Sedan sedan1 = new Sedan(in.next(), in.next(), in.next(), in.nextInt(), in.nextInt(), in.next());
        sedans.add(sedan1);
        System.out.println("congratulations you added Sedan");
    }
    public static void customerInfo(ArrayList<Customer> customers) {
        System.out.println("");
        Customer c1 = new Customer();
        System.out.println("enter your name:");
        c1.setName(in.next());
        System.out.println("enter your ID (4 digits please)");
        c1.setID(in.next());
        customers.add(c1);
        System.out.println("Customer added");
        System.out.println("*****************************************************************");
    }
    public static void addSedanToCustomer(ArrayList<Customer> customers, ArrayList<Sedan> sedans,Vehicle v,int index) {
        System.out.println("");
        customers.get(v.getNumberOfSalesVehicle()).setSedan(sedans.get(index));
        System.out.println("*****************************************************************");
        v.setNumberOfSalesVehicle();
        System.out.println("Sedan added to customer");
        System.out.println("*****************************************************************");
    }
    public static void addSUVToCustomer(ArrayList<Customer> customers, ArrayList<SUV> suvs,Vehicle v,int index) {
        customers.get(v.getNumberOfSalesVehicle()).setSuv(suvs.get(index));
        System.out.println("*****************************************************************");
        v.setNumberOfSalesVehicle();
        System.out.println("SUV added to customer");
        System.out.println("*****************************************************************");
    }
    public static void invoiceSedan(ArrayList<Customer> customers, Vehicle v, ArrayList<Sedan> sedans,int index) {
        System.out.println("Invoice:");
        System.out.println(customers.get(v.getNumberOfSalesVehicle()-1).toString());
        sedans.get(index).displayInfo(customers.get(v.getNumberOfSalesVehicle()-1));     
        System.out.println("*****************************************************************");
        System.out.println("");
    }
    public static void invoiceSUV(ArrayList<Customer> customers, Vehicle v, ArrayList<SUV> suvs,int index) {
        System.out.println("Invoice:");
        System.out.println(customers.get(v.getNumberOfSalesVehicle()-1).toString());
        suvs.get(index).displayInfo(customers.get(v.getNumberOfSalesVehicle()-1));
        System.out.println("*****************************************************************");
        System.out.println("");
    }
    
    public static void employeeMenu(){
        System.out.println("Choose a service:");
        System.out.println("1- Add/remove employee");
        System.out.println("2- Information of employees");
        System.out.println("3- financial management");
    }
    public static void employeeMenu1(){
        System.out.println("1- Add employee");
        System.out.println("2- Remove employee");
        
    }
    public static void employeeMenu11(ArrayList<Employee> employees,FinancialManagement f){
        System.out.println("*************************************************");
        System.out.println("");
        System.out.println("how many employee you want to add ? ");
        int num= in.nextInt();
        for (int i = 1; i <= num; i++) {
            EmployeesInformation eI=new EmployeesInformation();
            System.out.println("enter information of employee #"+i);
            System.out.println("name:");
            eI.setName(in.next());
            System.out.println("job title :");
            eI.setJobTitle(in.next());
            System.out.println("account number:");
            eI.setAccountNumber(in.next());
            System.out.println("nationality:");
            eI.setNationality(in.next());
            System.out.println("ID:");
            eI.setID(in.nextInt());
            System.out.println("salary per hour:");
            float s=in.nextFloat();
            System.out.println("hours work per day:");
            int w=in.nextInt();
            Employee e=new Employee(s,w,eI.getName(),eI.getJobTitle(), eI.getAccountNumber(), eI.getNationality(), eI.getID());
            employees.add(e);
            f.numberOfEmployee++;
            System.out.println("Employee #"+i+" successfully added");
            System.out.println("------------------------------------");
        }
    }
    public static void employeeMenu12(ArrayList<Employee> employees){
        employeesAllInfo(employees);
        System.out.println("enter the number of employee you want to remove:");
        employees.remove(in.nextInt()-1);
        System.out.println("the employee successfully removed.");
    }
    
    public static void employeesAllInfo(ArrayList<Employee> employees){
        Employee.printEmployeeHeader();
        for (int i = 0; i < employees.size(); i++) {
            System.out.print(i+1);
            employees.get(i).printFormatEmployee();
            System.out.println("");
        }
        System.out.println("----------------------------------------------------------------------------------------------------------");
    }
    
    public static void financialManagmentMenu(){
        System.out.println("choose one of the following:");
        System.out.println("1- worthness of the factory now");
        System.out.println("2- salary of employee per day");
        System.out.println("3- profit");
    }
    public static void financialManagmentMenu1(int numberOfEmployee,ArrayList<Employee> employees,Vehicle v){
        FinancialManagement f = new FinancialManagement(employees,numberOfEmployee,v);
        System.out.println("worthness now = "+f.worthnessNow());
        System.out.println("*****************************************************************");

    }
    public static void financialManagmentMenu2(ArrayList<Employee> employees){
        employeesAllInfo(employees);
        System.out.println("enter the number of employee to find the salary:");
        int x = in.nextInt()-1;
        double salaryPerDay=employees.get(x).getSalary()*employees.get(x).getHoursWorked();
        System.out.println("the salary of this employee per day = "+salaryPerDay);
    }
    public static void financialManagmentMenu3(Vehicle v){
        System.out.println("*********************************************************");
    FinancialManagement f = new FinancialManagement(v);
        System.out.println("the profit = "+f.getProfit(v));
        System.out.println("*********************************************************");
    }
    
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList();
        ArrayList<Employee> employees = new ArrayList();
        ArrayList<SUV> suvs = new ArrayList();
        ArrayList<Sedan> sedans = new ArrayList();
        Vehicle v= new Vehicle();
        FinancialManagement f = new FinancialManagement(employees);
        int countCustomers = -1, countEmployee = -1,countSuvCustomers=0,countSedanCustomers=0;
        int choice = 100;
        do {
            drawMenu();
            choice = in.nextInt();
            System.out.println("*****************************************************************");
            switch (choice) {
                //Customers menu:
                case 1:
                    countCustomers++;
                    customerInfo(customers);
                    customerMenu1(customers, countCustomers);
                    customerMenu2();
                    choice = in.nextInt();
                    System.out.println("*****************************************************************");
                    switch (choice) {
                        case 1:
                            fillSUVList(suvs);
                            addSUVToCustomer(customers, suvs,v,countSuvCustomers);
                            invoiceSUV(customers, v, suvs,countSuvCustomers);
                            countSuvCustomers++;
                            break;
                        case 2:
                            fillSedanList(sedans);
                            addSedanToCustomer(customers, sedans,v,countSedanCustomers);
                            invoiceSedan(customers,v,sedans,countSedanCustomers);
                            countSedanCustomers++;
                            break;
                        default:
                            System.out.println("you entered wrong number");
                            break;
                    }
                    break;
//********************************************************************************************************************************************
                case 2:
                    //Employees menu:
                    employeeMenu();
                    choice = in.nextInt();
                    System.out.println("*****************************************************************");
                    switch(choice){
                        case 1 : 
                            employeeMenu1();
                            choice = in.nextInt();
                            switch(choice){
                                case 1:
                                    employeeMenu11(employees,f);
                                    countEmployee++;
                                    break;
                                case 2:
                                    employeeMenu12(employees);
                                    break;
                            default:
                                System.out.println("you entered wrong");
                                break;
                            }
                            break;
                        case 2:
                            employeesAllInfo(employees);
                            break;
                        case 3:
                            financialManagmentMenu();
                            choice=in.nextInt();
                            switch(choice){
                                case 1:
                                    financialManagmentMenu1(countEmployee, employees, v);
                                    break;
                                case 2:
                                    financialManagmentMenu2(employees);
                                    break;
                                case 3:
                                    financialManagmentMenu3(v);
                                    break;
                                default:
                                    System.out.println("you entered wrong number");
                                    break;
                            }
                            break;
                        default:
                            System.out.println("you entered wrong number");
                            break;
                    }
                    break;
                case 0:
                    System.out.println("you exited the program");
                    return;
                default:
                    System.out.println("you entered wrong number");
                    System.out.println("***************************************************");
                    break;
            }
        } while (choice != 0);
    }
}
