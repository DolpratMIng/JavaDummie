package TryItOut;

public class Tch10_3 {
    public static void main(String[] args) {
        // create objects
        var card1 = new PlayingCardPlus(CardType.SPADES, 13);
        var card2 = new PlayingCardPlus(CardType.HEARTS, 1);
        var card3 = new PlayingCardPlus(CardType.DIAMONDS, 3);

        //display the object
        System.out.println(card1.getString());
        System.out.println(card2.getString());
        System.out.println(card3.getString());

        // display the count variable from PlayingCardPlus class
        System.out.println("Number of cards: " + PlayingCardPlus.count);
    }
}
