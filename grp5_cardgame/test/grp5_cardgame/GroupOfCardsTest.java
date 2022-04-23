/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package grp5_cardgame;

import grp5_cardgame_TESTING.GroupOfCards;
import grp5_cardgame_TESTING.PlayingCard;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sebas
 */
public class GroupOfCardsTest {
    

    /**
     * Test of shuffle method, of class GroupOfCards.
     */
    @Test
    public void testShuffle() {
        System.out.println("shuffle");
        GroupOfCards instance = new GroupOfCards(1);
        boolean expResult = true;
        boolean result = instance.shuffle();
        assertEquals(expResult, result);
    }

    /**
     * Test of create method, of class GroupOfCards.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        GroupOfCards instance = new GroupOfCards(1);
        boolean expResult = true;
        boolean result = instance.create();
        assertEquals(expResult, result);
    }

    /**
     * Test of add method, of class GroupOfCards.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        PlayingCard card = null;
        GroupOfCards instance = new GroupOfCards(1);
        boolean expResult = true;
        boolean result = instance.add(card);
        assertEquals(expResult, result);
    }
    
}
