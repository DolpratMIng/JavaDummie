package TryItOut;

public class Organization {
    // field - variables that belong to instances of classes
    String name;
    double revenue;
    boolean profit_making;

    // display method
    public void display() {
        System.out.println("Organization name: " + name);
        System.out.println("Revenue: $" + revenue);
        System.out.println("Profit-making: " + profit_making);
        System.out.println("Tax: " + getTax());
        System.out.println();
    }

    //the method's return value
    public double getTax() {
        if (profit_making) {
            return revenue * 0.10;
        } else {
            return revenue * 0.02;
        }
    }

    // set and get
    public void setName(String n){
        if (!n.equals("")){ // if n is not equal to empty
            name = n;
        }
    }

    public String getName() {
        return name;
    }

    public void setRevenue(double r){
        if(r>=0){
            revenue = r;
        }
    }


    public double getRevenue() {
        return revenue;
    }

    public void setProfit_making(boolean pm){
        profit_making = pm;
    }

    public boolean getProfit_making(){
        return profit_making;
    }

}
