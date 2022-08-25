package ATry;

public class TryEnhanceForLoop {
    public static void main(String[] args) {
        // create an initializer array
        int array1[] = {1,4,2,0,5,3,0,8,2,9};
        int roomNum = 1;

        System.out.println("Room\tGuests");

        // Enhance for loop
        //
        for(int numGuests : array1){
            System.out.print(roomNum++);
            System.out.print("\t\t");
            System.out.println(numGuests);
        }
    }

}
