package TryItOut;

public class Tch10_2 {
    public static void main(String[] args) {
        var card1 = new PlayingCard(CardType.SPADES, 13);
        var card2 = new PlayingCard(CardType.CLUBS.HEARTS, 1);
        var card3 = new PlayingCard(CardType.DIAMONDS, 3);

        System.out.println(card1.getString());
        System.out.println(card2.getString());
        System.out.println(card3.getString());
    }
}
