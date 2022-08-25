package ATechnical;

//java.io allows programmer to work with files
// Import the IOException class to handle errors

import java.io.File; // import the file class
import java.io.IOException; // import the IOException class to handle errors

public class CreateFile {
    public static void main(String[] args) {
        //Try - allow programmers to define a block of code to be tested  for errors while it is being executed
        try {
            File file1 = new File("filename.txt"); // create the file
            // if else statement
            if(file1.createNewFile()){ // createNewFile method - return the boolean value true if the file was successfully created, and false if the file already exists.
                System.out.println("File created: " + file1.getName());
            } else {
                System.out.println("File aleady exist.");
            }

        } catch(IOException e){ // catch - allow PG to define a block of code to be executed
            System.out.println("An error occured");
            e.printStackTrace(); // will pinpoint the exact line in which the method raised the exception
        }
    }
}
