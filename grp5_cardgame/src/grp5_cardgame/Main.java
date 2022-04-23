package grp5_cardgame;

import java.util.Scanner;

/**
 *
 * @author 727
 */
public class Main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("New User? (Y/N) ");
//        if(input.next().toLowerCase().equals("y")) {
//            System.out.print("Enter Account Username: ");
        
        
        Blackjack game = new Blackjack("Blackjack");
        game.play();
    }
    
}
