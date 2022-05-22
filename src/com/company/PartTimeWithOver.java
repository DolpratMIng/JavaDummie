package com.company;

public class PartTimeWithOver extends PartTimeEmployee {

    // override - subclass of subclass for the employee that get double paid for over time.
    @Override
    public double findPaymentAmount(int hours) {

        if (hours <= 40) {
            return getHourlyRate() * hours;
        } else {
            return getHourlyRate() * 40 + getHourlyRate() * 2 * (hours - 40);
        }
    }
}
