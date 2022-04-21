/**
 * BlackjackClass.
 * This class models the game logic for Blackjack.
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
public class Blackjack extends Game {

    private DealerHand dealerHand;
    private PlayerHand playerHand;
    private Player player;
    private double betAmount;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //vicente angeles
    }

    public Blackjack(String name) {
        super(name);
    }

    @Override
    public void play() {

    }

    @Override
    public void declareWinner() {

    }

    public void hit() {

    }

    public void stand() {

    }

    public void bet(double betAmount) {
        this.betAmount = betAmount;
    }

    public double distributeWinnings() {
        return 0;
    }
}
