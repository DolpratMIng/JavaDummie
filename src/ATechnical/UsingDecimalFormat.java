package ATechnical;

//DecimalFormat - provides a way to control the appearance of numbers that are stored as String's
import java.text.DecimalFormat;
public class UsingDecimalFormat {
    public static void main(String[] args) {
        int oneNum = 27387982;
        int nextNum = 37298;

        DecimalFormat commaFormat;
        commaFormat = new DecimalFormat("#,###");
        //System.out.println("oneNum = "+ commaFormat.format(oneNum));
        //System.out.println("nextNum = "+ commaFormat.format(nextNum));

        //-------part 2 --------
        float num1 = 3.14159F;
        double num2 = 3827967.2983659826398;

        commaFormat = new DecimalFormat("#,###.##");
        String myPi = commaFormat.format(num1);
        //System.out.println("num1 = "+ myPi);
        //System.out.println("num2 = "+ commaFormat.format(num2));
        //-------part3--------
        float myBalance = 3426.07F;
        float myInterest;

        DecimalFormat dollarFormat = new DecimalFormat("$ #,##0.00");
        DecimalFormat pennyFormat = new DecimalFormat("#,###");

        myInterest = myBalance * 3.5F/100; // 3.5% interest rate

        //System.out.println("Interest earned = " + dollarFormat.format(myInterest));
        //System.out.println("Pennies earned = " + pennyFormat.format(myInterest * 100));
        //------------part4----------
        DecimalFormat decFormat = new DecimalFormat(); // create decimalFormat object
        decFormat.setMinimumFractionDigits(2); // set the fraction 2 digit to the minimum
        decFormat.setNegativePrefix("(");
        decFormat.setNegativeSuffix(")");
        System.out.println(decFormat.format(345));
        System.out.println(decFormat.format(-345));
    }

}
