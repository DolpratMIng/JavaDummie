package TryItOut;

public class House  extends PlaceToLive{
    // field
    private double mortgage;
    private double propertyTax;

    // set and get
    public void setMortgage(double m){
        mortgage = m;
    }

    public double getMortgage(){
        return mortgage;
    }

    public void setPropertyTax(double tc){
        propertyTax = tc;
    }

    public double getTPropertyTax(){
        return propertyTax;
    }

    //get total month payment
    public double getTotalMonthPayment(){
        return mortgage + propertyTax / 12;
    }
}
