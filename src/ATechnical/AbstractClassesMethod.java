package ATechnical;
/*
Data abstraction - the process of hiding certain details and showing only essential information to the user.
                 - can be achieved with either abstract classes or interfaces

abstract keyword - a non-access modifier, used for classes and methods:
    1.abstract class - a restricted class that cannot be used to create objects
    (to access it, it must be inherited from another class).

    2.Abstract method - can only be used in an abstract class, and it does not have a body.
    The body is provided by the subclass(inherited from)

    An abstract class can have both abstract and regular methods:

 */
//Abstract class
abstract class Animal {
   // Abstract method (does not have a body)
   public abstract void animalSound();
   // regular method
   public void sleep(){
      System.out.println("Zzz");
   }
}

class Pig extends Animal {
   public void animalSound(){
      //The body of animalSound() is provided here
      System.out.println("The pig says: wee wee");
   }
}

public class AbstractClassesMethod{ // abstract class
   public static void main(String[] args) {
      Pig myPig = new Pig(); // Create a Pig object
      myPig.animalSound();
      myPig.sleep();
   }


}



