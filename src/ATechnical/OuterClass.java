package ATechnical;
/*
nested class - the class java allows to be define within another class.
Nested are divided into two categories: non-static and static.
Non-static classes - have access to other members of the enclosing class
                   - As a member of the OuterClass, a nested class can be declared private,public,protected, or package private.

Why use nested Class?
1 - it is a way of logically grouping classes that are only used in one place
2 - It increases encapsulation
3 - It can lead to more readable and maintainable code


Inner class or non-static
-associated with an instance of its enclosing class and has direct access to that object's methods and fields
-it cannot define any static member itself
-There are two special kinds of inner classes: local classes and anonymous classes

Static Nested Class
-static nested is associated with its outer class.
-has the same property as static class methods, it cannot refer directly to instance variables or methods defined in its enclosing
 class - it can use them only through an object reference
*/

import com.sun.java.accessibility.util.TopLevelWindowListener;

public class OuterClass {
    // field variable
    String outerField = "outer field";
    static String staticOuterField = "static outer field";

    class InnerClass{ // inner class
        // void method
        void accessMembers(){
            System.out.println(outerField);
            System.out.println(staticOuterField);
        }


    }

    static class StaticNestedClass{ // static class
        // void method
        void accessMembers(OuterClass outer){
            // Compiler error: cannot make a static reference to the non-static
            // field outerField
            // System.out.println(outerField);
            System.out.println(outer.outerField);
            System.out.println(staticOuterField);
        }
    }

    public static void main(String[] args) {
        System.out.println("Inner class:");
        System.out.println("------------");

        // create object
        OuterClass outerObject = new OuterClass();
        OuterClass.InnerClass innerObject = outerObject.new InnerClass();
        innerObject.accessMembers();


        System.out.println("\nStatic nested class:");
        System.out.println("----------------------");
        StaticNestedClass staticNestedClass = new StaticNestedClass();
        staticNestedClass.accessMembers(outerObject);

        System.out.println("\nTop-level class:");
        System.out.println("------------------");
        TopLevelClass topLevelObject = new TopLevelClass();
        topLevelObject.accessMembers(outerObject);
    }

}
