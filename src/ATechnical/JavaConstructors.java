package ATechnical;

/*
A constructor - a special method that used to initialize objects
              - The constructor is called when an object of class is created

Constructor Parameters - constructor can also take parameters, which is used to initialize attributes.

 */
public class JavaConstructors {
    int modelYear; // Created a class attribute
    String modelName;

    //Create a class constructor for the Main class
    public JavaConstructors(){
        modelYear = 5; // set the initial value for the class attribute x
        modelName = "";
    }

    //Create a constructor parameters
    public JavaConstructors(int x,String name){
        modelYear = x;
        modelName = name;
    }

    public static void main(String[] args) {
        JavaConstructors myObj = new JavaConstructors(5, "Mustang"); // Create an object of class Main (This will call the Constructor
        System.out.println(myObj.modelYear + " " + myObj.modelName);

    }
}
