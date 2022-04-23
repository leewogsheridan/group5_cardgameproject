package grp5_cardgame;

/**
 *
 * @author 727
 */
public class Main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Blackjack game = new Blackjack("Blackjack");
        Value[] c = Value.values();
        for(Value i : c)
            System.out.println(i.getValue());
        game.play();
    }
    
}
