/**
 * BlackjackClass.
 * This class models the game logic for Blackjack.
 * Deliverable 3
 * Gregory Lee Wo, Sebastian Villafane Ramos, Vicente Manuel Angeles, Yi Fei Wang
 * Date: 20/04/2022
 */
package grp5_cardgame_TESTING;

import java.io.*;
import java.util.Scanner;

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
    public boolean play() {
        try {
            int playerScore = 0, dealerScore = 0;
            Scanner input = new Scanner(System.in);
            System.out.println("Blackjack Game:");
            System.out.print("Bet: ");
            betAmount = input.nextDouble();
            deck = new GroupOfCards(52);
            deck.create();
            playerHand = new PlayerHand(0);
            playerHand.add(giveRandomCard());
            playerHand.add(giveRandomCard());
            displayHand(true);
            while (playerHand.getHandValue() < 21) {
                System.out.println("Hit? Enter Y to hit, anything else would be considered stand.");
                if (!input.next().toLowerCase().equals("y")) {
                    playerScore = playerHand.getHandValue();
                    break;
                }
                playerHand.add(giveRandomCard());
                displayHand(true);
                if (playerHand.getHandValue() > 21) {
                    System.out.println("Bust!");
                    playerScore = 0;
                }
            }
            dealerHand = new DealerHand(0);
            dealerHand.add(giveRandomCard());
            dealerHand.add(giveRandomCard());
            displayHand(false);
            dealerScore = dealerHand.getHandValue();
            System.out.println(dealerHand.getHandValue() < 17 ? "Dealer hits" : "Dealer stands");
            while (dealerHand.getHandValue() < 17) {
                dealerHand.add(giveRandomCard());
                displayHand(false);
                if (dealerHand.getHandValue() > 21) {
                    System.out.println("Bust!");
                    dealerScore = 0;
                } else if (dealerHand.getHandValue() < 17) {
                    System.out.println("Dealer hits");
                } else {
                    System.out.println("Dealer stands");
                    dealerScore = dealerHand.getHandValue();
                }
            }
            loadPlayer();
            won = playerScore > dealerScore;
            declareWinner();
            savePlayer();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public PlayingCard giveRandomCard() {
        deck.shuffle();
        return deck.subtract();
    }

    @Override
    public boolean declareWinner() {
        try {
            if (won) {
                System.out.println("Congratulations " + player.getName() + "! You have beat the computer and won $" + betAmount);
                player.won();
            } else {
                System.out.println("GG " + player.getName() + "! ff go next. You lost $" + betAmount);
            }
            distributeWinnings();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean displayHand(Boolean playerTurn) {
        try {
            if (playerTurn) {
                System.out.println("\nYour Hand");
                playerHand.getCards().forEach((c) -> System.out.println(c));
                System.out.println("Value: " + playerHand.getHandValue());
            } else {
                System.out.println("\nDealer Hand");
                dealerHand.getCards().forEach((c) -> System.out.println(c));
                System.out.println("Value: " + dealerHand.getHandValue());
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean bet(double betAmount) {
        try {
            this.betAmount = betAmount;
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean savePlayer() {
        File file = new File("player.txt");
        try (PrintWriter pw = new PrintWriter(file);) {
            pw.print(player);
            return true;
        } catch (Exception e) {
            System.out.println("ERROR saving player:" + e);
            return false;
        }
    }

    public boolean loadPlayer() {
        try (Scanner in = new Scanner("player.txt");) {
            player = new BlackjackAccount(in.next(), in.nextInt(), in.nextDouble());
            return true;
        } catch (java.util.NoSuchElementException ex) {
            player = new BlackjackAccount("Player1", 0, 0);
            return false;
        } catch (Exception e) {
            System.out.println("Error getting account: " + e);
            return false;
        }
    }

    public boolean distributeWinnings() {
        try {
            if (won) {
                player.deposit(betAmount);
            } else {
                player.deduct(betAmount);
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}