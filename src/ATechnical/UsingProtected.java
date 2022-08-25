package ATechnical;
/*
Java protected - an access modifier used for attributes, methods and constructors, making them accessible in the
same package and subclass
 */
public class UsingProtected {
    protected String  fName = "John";
    protected String lName = "Doe";
    protected String email = "john@doe.com";
    protected int age = 24;


}

class Student extends UsingProtected {
    private int graduationYear = 2018;

    public static void main(String[] args) {
        Student myObj = new Student();
        System.out.println("Name: " + myObj.fName + " " + myObj.lName);
        System.out.println("Email: " + myObj.email);
        System.out.println("Age: " + myObj.age);
        System.out.println("Graduation Year: " + myObj.graduationYear);
    }
}