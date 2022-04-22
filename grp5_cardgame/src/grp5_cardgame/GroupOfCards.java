/**
 * SYST 17796 Project Base code.
 * A Group of cards.
 * Deliverable 3
 * Gregory Lee Wo, Sebastian Villafane Ramos, Vicente Manuel Angeles, Yi Fei Wang
 * Date: 20/04/2022
 */
package grp5_cardgame;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A concrete class that represents any grouping of cards for a Game. HINT, you
 * might want to subclass this more than once. The group of cards has a maximum
 * size attribute which is flexible for reuse.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
public class GroupOfCards {

    //The group of cards, stored in an ArrayList
    private ArrayList<PlayingCard> cards;
    private int size;//the size of the grouping

    public GroupOfCards(int size) {
        this.size = size;
        cards = new ArrayList<>(size);
    }

    /**
     * A method that will get the group of cards as an ArrayList
     *
     * @return the group of cards.
     */
    public ArrayList<PlayingCard> getCards() {
        return cards;
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    /**
     * @return the size of the group of cards
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the max size for the group of cards
     */
    public void setSize(int size) {
        this.size = size;
    }

    public void create() {
        Suit[] suits = Suit.values();
        Value[] values = Value.values();
        cards = new ArrayList<>(size);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                cards.add(new PlayingCard(values[j], suits[i]));
            }
        }
    }

    public void add(PlayingCard card) {
        cards.add(card);
    }
    
    public PlayingCard subtract() {
        PlayingCard c = cards.get(0);
        cards.remove(0);
        return c;
    }

    public void clear() {
        cards.clear();
    }

}//end class
