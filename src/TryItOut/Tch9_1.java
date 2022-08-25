package TryItOut;

public class Tch9_1 {
    public static void main(String[] args) {
        // create objects from the class student
        var student1 = new Student("Barry", 111111, 4.0, Major.COMPUTER_SCIENCE);
        var student2 = new Student("Harriet", 222222, 3.5); // no major
        var student3 = new Student("Jennie", 333333, Major.LITERATURE); // no
        var student4 = new Student("Sam", 444444, 3.7);

        student1.display();
        student2.display();
        student3.display();
        student4.display();
    }
}
