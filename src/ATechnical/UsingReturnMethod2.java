package ATechnical;

public class UsingReturnMethod2 {
    public static int add(int x, int y){ // with argument
        int z = x+y;
        return z; // return value back the method
    }

    public static void main(String[] args) {
        UsingReturnMethod2 test = new UsingReturnMethod2(); // create object
        int add = test.add(10,20); // create variable + calling method
        System.out.println("The sum of x and y is: "+ add(10,20)); // display the result
    }
}
