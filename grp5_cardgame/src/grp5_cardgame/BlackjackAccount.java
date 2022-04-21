/**
 * BlackjackAccount Class.
 * This class models the hand user account for the Blackjack player.
 * Deliverable 3
 * Gregory Lee Wo, Sebastian Villafane Ramos, Vicente Manuel Angeles, Yi Fei Wang
 * Date: 20/04/2022
 */
package grp5_cardgame;

import java.io.Serializable;

/**
 *
 * @author 727
 * @author Gregory Lee Wo 2022
 */
public class BlackjackAccount extends Player implements Serializable {

    private double balance;

    public BlackjackAccount(String name) {
        super(name);
    }

    @Override
    public void play() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
