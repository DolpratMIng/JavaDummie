package com.company;

// class employee
public class Employee {
    // field - variable
    private String name;
    private String jobTitle;

    // sets and gets - accessor method
    public void setName(String nameIn){
        name = nameIn;
    }

    public String getName(){
        return name;
    }

    public void setJobTitle(String jobTitleIn){
        jobTitle = jobTitleIn;
    }

    public String getJobTitle(){
        return jobTitle;
    }

    // method check payroll
    public void cutCheck(double amountPaid){
        System.out.printf("Pay to the order of %s ", name); // printf determine the value and place
        System.out.printf("(%s) ***$", jobTitle); // printf determine the value and place
        System.out.printf("%,.2f\n", amountPaid); // printf determine the value and place
    }
}

