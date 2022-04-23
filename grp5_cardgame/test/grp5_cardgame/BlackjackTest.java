/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package grp5_cardgame;

import grp5_cardgame_TESTING.Blackjack;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sebas
 */
public class BlackjackTest {
    
    public BlackjackTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of play method, of class Blackjack.
     */
    @Test
    public void testPlay() {
        System.out.println("play");
        Blackjack instance = new Blackjack("");
        boolean expResult = false;
        boolean result = instance.play();
        assertEquals(expResult, result);
    }

    /**
     * Test of declareWinner method, of class Blackjack.
     */
    @Test
    public void testDeclareWinner() {
        System.out.println("declareWinner");
        Blackjack instance = new Blackjack("");
        boolean expResult = false;
        boolean result = instance.declareWinner();
        assertEquals(expResult, result);
    }

    /**
     * Test of displayHand method, of class Blackjack.
     */
    @Test
    public void testDisplayHand() {
        System.out.println("displayHand");
        Boolean playerTurn = null;
        Blackjack instance = new Blackjack("");
        boolean expResult = false;
        boolean result = instance.displayHand(playerTurn);
        assertEquals(expResult, result);
    }

    /**
     * Test of bet method, of class Blackjack.
     */
    @Test
    public void testBet() {
        System.out.println("bet");
        double betAmount = 0.0;
        Blackjack instance = new Blackjack("");
        boolean expResult = true;
        boolean result = instance.bet(betAmount);
        assertEquals(expResult, result);
    }

    /**
     * Test of savePlayer method, of class Blackjack.
     */
    @Test
    public void testSavePlayer() {
        System.out.println("savePlayer");
        Blackjack instance = new Blackjack("");
        boolean expResult = true;
        boolean result = instance.savePlayer();
        assertEquals(expResult, result);
    }

    /**
     * Test of loadPlayer method, of class Blackjack.
     */
    @Test
    public void testLoadPlayer() {
        System.out.println("loadPlayer");
        Blackjack instance = new Blackjack("");
        boolean expResult = false;
        boolean result = instance.loadPlayer();
        assertEquals(expResult, result);
    }

    /**
     * Test of distributeWinnings method, of class Blackjack.
     */
    @Test
    public void testDistributeWinnings() {
        System.out.println("distributeWinnings");
        Blackjack instance = new Blackjack("");
        boolean expResult = false;
        boolean result = instance.distributeWinnings();
        assertEquals(expResult, result);
    }
    
}
