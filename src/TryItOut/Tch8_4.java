package TryItOut;

public class Tch8_4 {
    public static void main(String[] args) {
        // create objects and set value for variables
       var place1 = new House();
       place1.setAddress("111 Main street");
       place1.setArea(600);
       place1.setNumberBedrooms(2);
       place1.setMortgage(1000.00);
       place1.setPropertyTax(600);
       double cost1 = place1.getTotalMonthPayment();

       var place2 = new Apartment();
       place2.setAddress("222 Java Road");
       place2.setArea(1000);
       place2.setNumberBedrooms(1);
       place2.setRent(1500);
       double cost2 = place2.getRent();

       // display
       System.out.println(place1.getAddress());
       System.out.println(" Cost per unit area: " + cost1 / place1.getArea());
       System.out.println(" Cost per bedroom: " + cost1 / place1.getNumberBedrooms());

       System.out.println(place2.getAddress());
       System.out.println(" Cost per unit area: " + cost2 / place2.getArea());
       System.out.println(" Cost per bedroom: " + cost2 / place2.getNumberBedrooms());
    }

}
