package TryItOut;

public class PlayingCard {
    // field
    private CardType suit;
    private int number;

    //Constructor
    public PlayingCard(CardType suit, int number) {
        this.suit = suit;
        this.number = number;
    }

    // getString method
    public String getString() {
        String numberString = switch (number) {
            // Switch case
            case 11 -> "Jack";
            case 12 -> "Queen";
            case 13 -> "King";
            case 1 -> "Ace";
            default -> Integer.toString(number);
        };

        return numberString + " of " + suit;
    }

    // set and get
    public CardType getSuit() {
        return suit;
    }

    public void setSuit(CardType suit) {
        this.suit = suit;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
