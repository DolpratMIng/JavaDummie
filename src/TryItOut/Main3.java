package TryItOut;

public class Main3 {
    static String name = "George";

    public static void main(String[] args) {
        String name = "Barry";
        new OtherClass();
    }
}

    class OtherClass {

    OtherClass() {
        String name = "Leonard";
        System.out.println(name);
        System.out.println(Main3.name);
    }
    }
