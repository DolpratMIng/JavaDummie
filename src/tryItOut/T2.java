package tryItOut;

public class T2 {
    public static void main(String[] args) {
        int i = 10;
        System.out.println(i++); // print 10 / actual - 11
        System.out.println(--i); // print 10 / actual - 10
        --i; // 9
        i--; // 8

        System.out.println(i); // print 8
        System.out.println(++i); // print 9
        System.out.println(i--); // print 9 / actual value 8
        System.out.println(i); // print 8
        i++; // value = 9
        i = i++ + ++i; // i = 10 + 10 = 20
        System.out.println(i); // print 20
        i = i++ + i++; // 20+21 = 41
        System.out.println(i); // print 41
    }
}
