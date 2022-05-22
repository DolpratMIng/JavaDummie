package com.company;

import com.company.Employee;

import java.util.Scanner; // import for scanner
import java.io.File; // import for file
import java.io.IOException; // import the API for checking the existance of file

public class List8_2_1 {
    //main method - calls the payOneEmployee three times
    public static void main(String[] args) throws IOException { // precautions about the file
        Scanner diskScanner = new Scanner(new File("C:\\Users\\Dolprat\\Downloads\\Try\\EmployeeInfo.txt")); // create scanner & new file object

        // diskScanner stand for EmployeeInfo.txt

        // create new file
        File employeeInfo = new File("EmployeeInfo.txt");
        System.out.println("Looking for " + employeeInfo.getCanonicalPath()); // telling where the file existing

        for (int empNum = 1; empNum <= 3; empNum++) { // for loop 3 times
            payOneEmployee(diskScanner); // create new anEmployee
        }
        diskScanner.close(); // to disconnect from the disk file
    }

    //gets stuff from the EmployeeInfo.txt
    static void payOneEmployee(Scanner aScanner) { // parameter scanner for scanning the file
        Employee anEmployee = new Employee();

        anEmployee.setName(aScanner.nextLine());
        anEmployee.setJobTitle(aScanner.nextLine());
        anEmployee.cutCheck(aScanner.nextDouble());
        aScanner.nextLine(); // break the line
    }
}
