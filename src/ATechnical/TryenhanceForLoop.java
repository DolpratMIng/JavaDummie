package ATechnical;

//Enhanced for loop - used exclusively to loop through elements in an array.
// for(type variableName : arrayName)
public class TryenhanceForLoop {
    public static void main(String[] args) {
        // create an initializer array
        int guests[] = {0,0,0,0,0,0,0,0,0,0};


        // enhance for loop to display the first row
        for(int numGuests: guests){
            numGuests += 1;
            System.out.print(numGuests + " ");
        }

        System.out.println();

        // enhance for loop to display the second row.
        for(int numGuests: guests){
            System.out.print(numGuests + " ");
        }
    }
}
