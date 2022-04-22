/**
 * BlackjackClass.
 * This class models the game logic for Blackjack.
 * Deliverable 3
 * Gregory Lee Wo, Sebastian Villafane Ramos, Vicente Manuel Angeles, Yi Fei Wang
 * Date: 20/04/2022
 */
package grp5_cardgame;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.EOFException;

/**
 *
 * @author 727
 * @author Gregory Lee Wo 2022
 */
public class Blackjack extends Game {

    private DealerHand dealerHand;
    private PlayerHand playerHand;
    private GroupOfCards deck;
    private BlackjackAccount player;
    private double betAmount;
    private boolean won;

    public Blackjack(String name) {
        super(name);
    }

    @Override
    public void play() {
        System.out.println("Blackjack Game:");
        deck = new GroupOfCards(52);
        deck.create();
        playerHand = new PlayerHand(0);
        dealerHand = new DealerHand(0);
        loadPlayer();
        won = false;

    }

    @Override
    public void declareWinner() {
        if (won) {
            System.out.println("Congratulations " + player.getName() + "! You have beat the computer and won $" + betAmount);
        } else {
            System.out.println("GG " + player.getName() + "! ff go next. You lost $" + betAmount);
        }
        distributeWinnings();
    }

    public void hit() {

    }

    public void stand() {

    }

    public void bet(double betAmount) {
        this.betAmount = betAmount;
    }

    public void savePlayer() {
        try ( ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("player.dat"));) {
            output.writeObject(player);
        } catch (Exception e) {
            System.out.println("ERROR saving player:" + e);
        }
    }

    public void loadPlayer() {
        try ( ObjectInputStream input = new ObjectInputStream(new FileInputStream("player.dat"));) {
            player = (BlackjackAccount) input.readObject();
        } catch (EOFException f) {
            player = new BlackjackAccount("Player1", 0, 0);
        } catch (Exception e) {
            System.out.println("Error getting account: " + e);
        }
    }

    public void distributeWinnings() {
        if (won) {
            player.deposit(betAmount);
        } else {
            player.deduct(betAmount);
        }
    }
}
