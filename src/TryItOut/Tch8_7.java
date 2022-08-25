package TryItOut;

public class Tch8_7 {
    public static void main(String[] args) {
        MyThing myThing, myThing2;

        myThing = new MySubThing();
        myThing2 = new MyOtherThing();

        myThing.value = 7;
        myThing2.value = 44;

        myThing.display();
        myThing2.display();
    }
}
