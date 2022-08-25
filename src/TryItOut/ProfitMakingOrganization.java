package TryItOut;

public class ProfitMakingOrganization extends Organization_2{
    public double  getTax(){
        return getRevenue() * 0.10;
    }
}
