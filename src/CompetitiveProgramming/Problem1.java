package CompetitiveProgramming;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] num = new int[3];

        //for loop to store number
        for(int i=0;i<3;i++){
            num[i] = in.nextInt();
        }

        //for loop to print the number
        for(int i=0;i<3;i++){
            System.out.println(num[i]);


        }

    }
}
