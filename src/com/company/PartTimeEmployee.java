package com.company;


public class PartTimeEmployee extends Employee {
        private double hourlyRate;

        public void setHourlyRate(double rateIn) {
            hourlyRate = rateIn;
        }

        public double getHourlyRate() {
            return hourlyRate;
        }


        public double findPaymentAmount(int hours) { // total hourly wage per day
            return hourlyRate * hours;
        }
    }

