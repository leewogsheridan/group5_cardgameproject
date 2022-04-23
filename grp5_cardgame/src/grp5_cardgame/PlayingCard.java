/**
 * PlayingCard Class.
 * This class extends Card and models a playing card suitable for Blackjack.
 * Deliverable 3
 * Gregory Lee Wo, Sebastian Villafane Ramos, Vicente Manuel Angeles, Yi Fei Wang
 * Date: 20/04/2022
 */
package grp5_cardgame;

/**
 *
 * @author 727
 * @author Gregory Lee Wo 2022
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
    ACE(11), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), JACK(10), QUEEN(10), KING(10);

    private final int value;

    private Value(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

enum Suit {
    SPADES, HEARTS, CLUBS, DIAMONDS;
}
