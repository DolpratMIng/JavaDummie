package TryItOut;

public class ApartmentWithFees extends Apartment {
    private double fees;

    public double getFees(){
        return fees;
    }

    public void setFees(double fees){
        this.fees = fees;
    }

    public double getTotalMonthlyPayment(){
        return getRent() + fees / 3;
    }
}
