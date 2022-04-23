/**
 * BlackjackAccount Class.
 * This class models the hand user account for the Blackjack player.
 * Deliverable 3
 * Gregory Lee Wo, Sebastian Villafane Ramos, Vicente Manuel Angeles, Yi Fei Wang
 * Date: 20/04/2022
 */
package grp5_cardgame_TESTING;

import java.io.Serializable;

/**
 *
 * @author 727
 * @author Gregory Lee Wo 2022
 */
public class BlackjackAccount extends Player implements Serializable {

    private double balance;
    private int wins;

    public BlackjackAccount(String name, int wins, double balance) {
        super(name);
        this.wins = wins;
        this.balance = balance;
    }

    /**
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * @return the wins
     */
    public int getWins() {
        return wins;
    }

    /**
     * @param wins the wins to set
     */
    public void setWins(int wins) {
        this.wins = wins;
    }

    public void won() {
        wins++;
    }

    @Override
    public void play() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public double widthdraw(double amount) {
        if (balance < amount) {
            System.out.println("Insufficient funds.");
            return 0;
        } else {
            return balance -= amount;//********** will this work?
        }
    }
    
    public void deduct(double funds) {
        balance -= funds;
    }
    public void deposit(double funds) {
        balance += funds;
    }
    
    @Override
    public String toString() {
        return super.getName() + " " + wins + " " + balance;
    }

}
