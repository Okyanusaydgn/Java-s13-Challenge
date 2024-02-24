import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.performOperations();
    }

    public void performOperations() {
        // Healthplan objects
        Healthplan healthplan1 = new Healthplan(1, "Basic Health Plan", Plan.BASIC);
        Healthplan healthplan2 = new Healthplan(2, "Premium Health Plan", Plan.PREMIUM);
        Healthplan healthplan3 = new Healthplan(3, "Luxe Health Plan", Plan.LUXE);

        // Print Healthplan objects
        System.out.println(healthplan1);
        System.out.println(healthplan2);
        System.out.println(healthplan3);

        // Employee object
        Employee employee = new Employee(1, "okyanus aydogan", "okyanusaydgn@example.com", "12312");

        // Add health plans to employee
        employee.addHealthplan(0,"Basic Health Plan");
        employee.addHealthplan(1, "Premium Health Plan");
        employee.addHealthplan(2, "Deluxe Health Plan");

        // Print Employee object
        System.out.println(employee);

        // Company object
        Company company = new Company(1, "ABC Company", 1000);

        // Add employees to company
        company.addEmployee(0, "okyanus aydogan");
        company.addEmployee(1, "fateme farhanian");


        // Print Company object
        System.out.println(company);
    }
}
