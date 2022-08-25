package TryItOut;

public class Tch7_1 {
    public static void main(String[] args) {
        System.out.printf("%s%s%s", ">>", 7, "<<\n"); // >>7<<
        System.out.printf("%s%10d%s", ">>", 7, "<<\n"); // >>         7<<
        System.out.printf("%s%-10d%s", ">>", 7, "<<\n"); // >>7        <<
        System.out.printf("%s%010d%s", ">>", 7, "<<\n"); // >>000000007<<
        System.out.printf("%s%+d%s", ">>", 7, "<<\n"); // >>+7<<
        System.out.printf("%s%+d%s", ">>", -7, "<<\n"); // >>-7<<
        System.out.printf("%s%(d%s", ">>", -7, "<<\n"); // >>(7)<<
        System.out.printf("%s%10.5f%s", ">>", 7.0, "<<\n");// >>   7.0000<<
        System.out.printf("%s%S%s", ">>", "Hello", "<<\n"); // >>HELLO<<
        System.out.printf("%s%c%s", ">>", 'x', "<<\n"); // >>x<<
        System.out.printf("%s%C%s", ">>", 'x', "<<\n"); // >>X<<

    }
}
