package TryItOut;

//Scanner
import java.util.Scanner;

public class Tch5_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name of the month: ");
        String month = sc.next();



        // variable for month
        switch (month.toLowerCase()) {

            case "january":
                System.out.println("31 days.");
                break;
            case "february":
                System.out.println("Is it a leap year?(Yes or No).");
                String leap = sc.next();
                if(leap.equals("Yes")){
                    System.out.println("29 days.");
                } else{
                    System.out.println("28 days.");
                }
                break;
            case "march":
                System.out.println("31 days.");
                break;
            case "april":
                System.out.println("30 days.");
                break;
            case "may":
                System.out.println("31 days.");
                break;
            case "june":
                System.out.println("30 days.");
                break;
            case "july":
                System.out.println("31 days.");
                break;
            case "august":
                System.out.println("31 days.");
                break;
            case "september":
                System.out.println("30 days.");
                break;
            case "october":
                System.out.println("31 days.");
                break;
            case "november":
                System.out.println("30 days.");
                break;
            case "december":
                System.out.println("31 days.");
                break;
            default:
                System.out.println("Incorrect month. Please try again.");
                break;
        }

        sc.close();
    }
}
