package TryItOut;

public class Tch10_4 {

    public static void main(String[] args) {
        System.out.println("bigValue: " + MutableInteger.bigValue);
        // out.println("bigValue: " + IntegerHolder.value); ILLEGAL

        MutableInteger holder1 = new MutableInteger(42);
        MutableInteger holder2 = new MutableInteger(7);

        System.out.println("holder1: " + holder1.value);
        System.out.println("holder2: " + holder2.value);

        System.out.println();
        holder1.value++;
        holder2.value++;
        MutableInteger.bigValue++;

        System.out.println("bigValue: " + MutableInteger.bigValue);
        System.out.println("holder1: " + holder1.value);
        System.out.println(("holder2: " + holder2.value));

        System.out.println();
        holder1.bigValue++;
        System.out.println("bigValue according to holder1: " + holder1.bigValue);
        System.out.println("bigValue according to holder2: " + holder2.bigValue);
    }


}

class MutableInteger {
    int value;
    static int bigValue = 1000000;

    public MutableInteger(int value){
        this.value = value;
    }
}
