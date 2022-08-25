package ATeaching;

import java.util.Locale;

public class Operatorss {
    public static void main(String[] args) {
        String words = "My name is" + " long.";

        String realName = "Dolprat", lastname = "Chuavallee", fullName = realName + " " + lastname;

        //System.out.println(fullName.toUpperCase());
        //System.out.println();
        //System.out.println(words);

        //System.out.println(11%4);
        //System.out.println(11/4);
        double num1 = 11, num2 = 4;
        //System.out.println(num1/num2);

        // increment(++) & decrement(--) / preincrement & postincrement
        int num = 27;
        int numb2 = 53;
        //num++;
        //System.out.println(num);
        //System.out.println(num);
        //System.out.println(num++);

        // Assignment Operators
        num += 1; // num = num + 1
        //System.out.println(num);

        num += 5; // num = num + 5
       // System.out.println(num);

        num += numb2; // num = num + numb2
        //System.out.println(num);

        num*=2;
        //System.out.println(num);

       // System.out.println(num -= 7);
        //System.out.println(num = 100);

        //-------------code
        int i = 4;

        i += 3;
        i -= 6;
        i *=2;
        i /= 2;
        System.out.println(i); //  1
        System.out.println(i +=2); // 3


    }
}
