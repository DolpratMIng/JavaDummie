package ATechnical;
import java.io.IOException;
import java.util.Scanner;
//Throw - used to create a custom error
public class UseThrows {
    public static void main(String[] args) throws IOException{
        int guests[] = new int[10];
        Scanner in = new Scanner(System.in);

        for(int roomNum = 0; roomNum < 10; roomNum++){
            System.out.print("Enter the number: ");
            guests[roomNum] = in.nextInt();
        }

        System.out.println();
        System.out.println("room\tGuests");

        for(int roomNum = 0; roomNum<10; roomNum++){
            System.out.print(roomNum);
            System.out.print("\t\t");
            System.out.println(guests[roomNum]);
        }

    }
}
