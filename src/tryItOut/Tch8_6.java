package tryItOut;

public class Tch8_6 {
    public static void main(String[] args) {
        //create house object
        var place1 = new House();
        place1.setAddress("111 Main Street");
        place1.setArea(600);
        place1.setNumberBedrooms(2);
        place1.setMortgage(1000.00);
        place1.setPropertyTax(600);
        double cost1 = place1.getTotalMonthPayment();

        // object2
        var place2 = new Apartment();
        place2.setAddress("222 Java Road");
        place2.setArea(1000);
        place2.setNumberBedrooms(1);
        place2.setRent(1500);
        double cost2 = place2.getRent();

        //object3
        var place3 = new ApartmentWithFees();
        place3.setAddress("333 Front Street");
        place3.setArea(1500);
        place3.setNumberBedrooms(2);
        place3.setRent(700);
        place3.setFees(300);
        double cost3 = place3.getTotalMonthlyPayment();

        System.out.println(place1.getAddress());
        System.out.println("  Monthly cost: " + cost1);

        System.out.println(place2.getAddress());
        System.out.println(" Monthly cost: " + cost2);

        System.out.println(place3.getAddress());
        System.out.println(" Monthly cost: " + cost3);
    }
}
