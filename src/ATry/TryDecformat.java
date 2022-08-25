package ATry;

import java.text.DecimalFormat;

public class TryDecformat {
    public static void main(String[] args) {
        DecimalFormat form = new DecimalFormat("#,###.00"); // create decimalFormat object
        double num = 32799.34234;
        String formatNum = form.format(num);

        System.out.println(formatNum);

    }
}
