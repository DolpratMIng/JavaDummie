package ATechnical;

/*
Encapsulation - to make sure that "sensitive" data is hidden from users.

    *declare class variables/attributes as private
    *provide public get and set methods to access and update the value of a private variable

Private variable - can only be accessed within the same class(an outside class has no access to it.)
                 - However, it is possible to access them if we provide public get and set methods.
             Get - method that returns the variable value
             Set - methods that set the value


 */

class Person {

    // field
    private String name; // private = restricted access

    // constructor
    public Person(){
        this.name = "";
    }
    public Person(String name){
        this.name = name;
    }

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String newName) {
        this.name = newName;
    }
}

public class JavaEncapsulation {
    public static void main(String[] args) {
        Person myObj = new Person();
        //myObj.name = "John"; // error
        //System.out.println(myObj.name);

        // use getName() and setName() methods to access and update the variable
        myObj.setName("John"); // access the name value through set
        Person myObj1 = new Person("guru"); // access the name value through constructor
        System.out.println(myObj1.getName()); // display the value through get
    }
}
