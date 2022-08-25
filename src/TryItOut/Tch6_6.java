package TryItOut;

public class Tch6_6 {
    public static void main(String[] args) {
        int times = 1;
       while(times<=3){
           for (int row = 0; row < 5; row++) {
               for (int column = 0; column <= row; column++) {
                   System.out.print("*");
               }
               System.out.println();
           }
           times++;
       }
    }
}
