package TryItOut;

public class PlayingCardPlus extends PlayingCard {
    // field with static
    public static int count = 0;

    // constructor
    public PlayingCardPlus(CardType suit, int number){
        super(suit, number);
        count++;
    }
}
