package grp5_cardgame;

/**
 *
 * @author 727
 */
public class PlayingCard extends Card {

    private final Value value;
    private final Suit suit;
    
    public PlayingCard(Value value, Suit suit) {
        this.value = value;
        this.suit = suit;
    }
    

    
    public Value getValue() {
        return value;
    }
    
    public Suit getSuit() {
        return suit;
    }
    
    @Override
    public String toString() {
        return value + " of " + suit;
    }
}

enum Value {
    ACE(11), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), JACK(11), QUEEN(12), KING(13);

    private final int value;

    Value(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

enum Suit {
    SPADES, HEARTS, CLUBS, DIAMONDS;
}
