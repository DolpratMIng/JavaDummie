package TryItOut;
import java.util.Scanner;

public class Tch6_7 {
   // program for use break to quit the program
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      while(true){
         System.out.print("Enter an int value: ");
         int i = in.nextInt();
         if(i == -1){ // if i = -1 then break
            break;
         }
         System.out.println(i);
      }
      System.out.println("Done!");
      in.close();
   }

}
