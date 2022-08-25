package ATechnical;
/*
Java Polymorphism - mean "many forms", and it occurs when we have many classes that are related to each other by inheritance.
 */
class Animals{
    public void animalSound(){
        System.out.println("The animal makes a sound");
    }
}

class Pigs extends Animals{
    public void animalSound(){
        System.out.println("The pig says: wee wee.");
    }
}

class Dog extends Animals{
    public void animalSound(){
        System.out.println("The dog says: bow wow");
    }
}

public class JavaPolymorphism {
    public static void main(String[] args) {
        Animals myAnimal = new Animals(); // Create a Animal object
        Animals myPig = new Pigs(); // create a Pig object
        Animals myDog = new Dog(); // create a Dog object

        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();

    }
}
