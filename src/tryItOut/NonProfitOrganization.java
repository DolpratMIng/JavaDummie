package tryItOut;

public class NonProfitOrganization extends Organization_2{
    public double getTax(){
        return getRevenue() * 0.02;
    }
}
