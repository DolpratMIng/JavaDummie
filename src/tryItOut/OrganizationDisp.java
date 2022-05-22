package tryItOut;

public class OrganizationDisp {
    public static void main(String[] args) {
        //create objects
        Organization organ1 = new Organization();
        Organization organ2 = new Organization();

        // set value for variables
        organ1.name = "XYZ Ccompany";
        organ1.revenue = 100000.00;
        organ1.profit_making = true;

        organ2.name = "ChildFoundation";
        organ2.revenue = 50000.00;
        organ2.profit_making = false;

        //display the value
        organ1.display();
        organ2.display();
    }
}
