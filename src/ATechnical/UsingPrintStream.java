package ATechnical;
//PrintStream - adds functionality to another output stream
                // - the ability to print representations of various data values conveniently.
import java.io.PrintStream;
public class UsingPrintStream {
    public static void main(String[] args) {

        PrintStream pt = new PrintStream(System.out); // create print stream object

        pt.print("i like java");

        System.out.println();

        pt.println("I like  code");
        System.out.println("what you like");


    }

}
