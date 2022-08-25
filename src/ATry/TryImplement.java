package ATry;

public class TryImplement {
    public static void main(String[] args) {
        //ThaiPeople Ming = new Human();
    }
}

interface Human{

    public void eat(); // interface method (does not have a body)
    public void sleep(); // interface method ( does not have a body)
}

class ThaiPeople implements Human{
    public void eat(){
        System.out.println("Burger is eating.");
    }

    public void sleep(){
        System.out.println("Human is sleeping.");
    }
}
