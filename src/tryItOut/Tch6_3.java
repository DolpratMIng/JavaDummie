package tryItOut;

public class Tch6_3 {
    public static void main(String[] args) {
        int total = 0;
        for(int i = 0; i < 10; i++){
            total += i;
        }
        System.out.println(total);
        /*
        total = total + i

        1. total = 0 + 0 = 0
        2. total = 0 + 1 = 1
        3.total = 1 + 2 = 3
        4. total = 3 + 3 = 6
        5. total = 6 + 4 = 10
        6. total = 10 + 5 = 15
        7. total = 15 + 6 = 21
        8. total = 21 + 7 = 28
        9. total = 28 + 8 = 36
        10. total = 36 + 9 = 45
         */
    }
}
