package TryItOut;

public class Tch9_3 {
    public static void main(String[] args) {
        var student1 = new StudentWithGetString(
                "Barry", 111111, 4.0, Major.COMPUTER_SCIENCE);
        var student2 = new StudentWithGetString(
                "Harriet", 222222, 3.5);
        var student3 = new StudentWithGetString(
                "Jennie", 333333, Major.LITERATURE);
        var student4 = new StudentWithGetString(
                "Sam", 444444, 3.7);

        System.out.println(student1.getString());
        System.out.println(student2.getString());
        System.out.println(student3.getString());
        System.out.println(student4.getString());
    }
}
