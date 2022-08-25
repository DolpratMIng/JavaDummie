package ATechnical;
// the use of this
// this = the current object in a method or constructor.

public class This {
    int x;

    // Constructor with a parameter
    public This(int x){
        this.x = x;
        //this.x = x; // if the keyword this is omitted, the output would be 0
    }

    //main method to call the constructor
    public static void main(String[] args) {
        This myObj = new This(5);
        System.out.println("Value of x = " + myObj.x);
    }
}
