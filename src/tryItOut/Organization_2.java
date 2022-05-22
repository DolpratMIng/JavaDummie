package tryItOut;

public class Organization_2 {
    private String name;
    private double revenue;

    // set and get
    public void setName(String name){
        if(!name.equals("")){
            this.name = name;
        }
    }

    public String getName(){
        return name;
    }

    public void setRevenue(double revenue){
        if(revenue >= 0){
            this.revenue = revenue;
        }
    }

    public double getRevenue(){
        return revenue;
    }

}
