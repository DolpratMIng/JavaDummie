package com.company;

public class List8_6 {
    public static void main(String[] args) {
        // create subclass FullTimeEmployee object
        var ftEmployee = new FullTimeEmployee();

        // set field value
        ftEmployee.setName("Barry Burd");
        ftEmployee.setJobTitle("CEO");
        ftEmployee.setWeeklySalary(5000.00);
        ftEmployee.setBenefitDeduction(500.00);
        ftEmployee.cutCheck(ftEmployee.findPaymentAmount()); // cutcheck method from employee class
        System.out.println();

        // create subclass part time employee
        var ptEmployee = new PartTimeEmployee();

        ptEmployee.setName("Steve Surace");
        ptEmployee.setJobTitle("Driver");
        ptEmployee.setHourlyRate(7.53);
        ptEmployee.cutCheck(ptEmployee.findPaymentAmount(10)); // cutcheck method from employee class
    }
}
