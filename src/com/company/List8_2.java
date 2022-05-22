package com.company;


import com.company.Employee;

import java.util.Scanner; // import for scanner
import java.io.File; // import for file
import java.io.IOException; // import the API for checking the existance of file

public class List8_2 {
    //main method - calls the payOneEmployee three times
    public static void main(String[] args) throws IOException { // precautions about the file
        Scanner diskScanner = new Scanner(new File("EmployeeInfo.txt")); // create scanner & new file object

                                                                                  // diskScanner stand for EmployeeInfo.txt

        // create new file object and look which directory should it belong
        File employeeInfo = new File("EmployeeInfo.txt");
        System.out.println("Looking for " + employeeInfo.getCanonicalPath()); // telling where the file existing

        // Read the text from the file
        for (int empNum = 1; empNum <= 3; empNum++) { // for loop 3 times
            payOneEmployee(diskScanner); // scan the text from the file for each line
        }
        diskScanner.close(); // to disconnect from the disk file
    }

    //gets stuff from the EmployeeInfo.txt
    static void payOneEmployee(Scanner aScanner) { // parameter scanner for scanning the file
        Employee anEmployee = new Employee();

        anEmployee.setName(aScanner.nextLine()); // nextLine() - after it reading from the one line, it goes to the next line.
        anEmployee.setJobTitle(aScanner.nextLine());
        anEmployee.cutCheck(aScanner.nextDouble());
        aScanner.nextLine(); // break the line for the variable nextDouble
    }
}
