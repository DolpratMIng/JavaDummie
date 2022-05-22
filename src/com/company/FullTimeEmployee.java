package com.company;

//
public class FullTimeEmployee extends Employee { // extend
    // field
    private double weeklySalary;
    private double benefitDeduction; // benefit deduction to pay for the company's benefits package.

    // Set and get
    public void setWeeklySalary(double weeklySalaryIn) {
        weeklySalary = weeklySalaryIn;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setBenefitDeduction(double benefitDedIn) {
        benefitDeduction = benefitDedIn;
    }

    public double getBenefitDeduction() {
        return benefitDeduction;
    }

    public double findPaymentAmount() { // total salary of pull time employee after get rit of the benefitdeduction cost.
        return weeklySalary - benefitDeduction;
    }
}

