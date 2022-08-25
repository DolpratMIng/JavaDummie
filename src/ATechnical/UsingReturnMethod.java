package ATechnical;

// Return statement - causes the program control to transfer back to the caller of a method.
public class UsingReturnMethod {
    public int add(){ // return method with without argument
        int x = 30;
        int y = 70;
        int z = x+y;
        return z;

    }

    public static void main(String[] args) { // main method
        UsingReturnMethod test = new UsingReturnMethod(); // create object
        int add = test.add(); // create literal using method
        System.out.println("The sum of x and y is: "+ add); // printing
    }

}
