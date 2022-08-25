package ATry;

public class AverageArray {
    public static void main(String[] args) {
        // create initializer array
        int array1[] = {0, 0, 0, 0, 23};

        // getting array length
        int length = array1.length;

        // convert int to double
        double length1 = length;

        //default sum value
        int sum = 0;


        //sum of all values in array using for loop
        for(int i: array1){
            sum += i;
        }

        // find the average
        double average = sum/length1;

        //display
        System.out.println("Average of array : " + average);
    }
}
