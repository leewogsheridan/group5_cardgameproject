/**
 * SYST 17796 Project Base code.
 * A Group of cards.
 * Deliverable 3
 * Gregory Lee Wo, Sebastian Villafane Ramos, Vicente Manuel Angeles, Yi Fei Wang
 * Date: 20/04/2022
 */
package grp5_cardgame_TESTING;

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

    public boolean shuffle() {
        try {
            Collections.shuffle(cards);
            return true;
        } catch (Exception e) {
            return false;
        }
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

    public boolean create() {
        try {
            Suit[] suits = Suit.values();
            Value[] values = Value.values();
            cards = new ArrayList<>(size);

            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 13; j++) {
                    cards.add(new PlayingCard(values[j], suits[i]));
                }
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean add(PlayingCard card) {
        try {
            cards.add(card);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public PlayingCard subtract() {
        PlayingCard c = cards.get(0);
        cards.remove(0);
        return c;
    }

    public void clear() {
        cards.clear();
    }

    public int getHandValue() {
        final int[] count = {0};
        final boolean[] ace = {false};
        getCards().forEach((c) -> {
            int v = c.getValue().getValue();
            count[0] += v;
            ace[0] = v == 11 || ace[0];
            if (count[0] > 21 && ace[0]) {
                count[0] -= 10;
                ace[0] = false;
            }
        });
        return count[0];
    }

}//end class

