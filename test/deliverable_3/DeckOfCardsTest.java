/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deliverable_3;

import java.util.ArrayList;
import java.util.Random;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author DILRAJ UPPAL
 */
public class DeckOfCardsTest
{
   
   public DeckOfCardsTest ()
   {
   }
   
   @BeforeClass
   public static void setUpClass ()
   {
   }
   
   @AfterClass
   public static void tearDownClass ()
   {
   }
   
   @Before
   public void setUp ()
   {
   }
   
   @After
   public void tearDown ()
   {
   }

   /**
    * Test of random method, of class DeckOfCards.
    */
   @Test
   public void testRandom ()
   {
      System.out.println("random");
      DeckOfCards instance = new DeckOfCards();
      Random expResult = null;
      Random result = instance.random();
      assertEquals(expResult, result);
      // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
   }

   /**
    * Test of getDeckSize method, of class DeckOfCards.
    */
   @Test
   public void testGetDeckSize ()
   {
      System.out.println("getDeckSize");
      DeckOfCards instance = new DeckOfCards();
      int expResult = 0;
      int result = instance.getDeckSize();
      assertEquals(expResult, result);
      // TODO review the generated test code and remove the default call to fail.
      // fail("The test case is a prototype.");
   }

   /**
    * Test of getRandomCard method, of class DeckOfCards.
    */
   @Test
   public void testGetRandomCard ()
   {
      System.out.println("getRandomCard");
      DeckOfCards instance = new DeckOfCards();
      Card expResult = null;
      Card result = instance.getRandomCard();
      assertEquals(expResult, result);
      // TODO review the generated test code and remove the default call to fail.
      // fail("The test case is a prototype.");
   }

   /**
    * Test of shuffleDeck method, of class DeckOfCards.
    */
   @Test
   public void testShuffleDeck ()
   {
      System.out.println("shuffleDeck");
      DeckOfCards instance = new DeckOfCards();
      instance.shuffleDeck();
      // TODO review the generated test code and remove the default call to fail.
      // fail("The test case is a prototype.");
   }

   /**
    * Test of dealCard method, of class DeckOfCards.
    */
   @Test
   public void testDealCard ()
   {
      System.out.println("dealCard");
      DeckOfCards instance = new DeckOfCards();
      Card expResult = null;
      expResult.setValue(10);
      Card result = instance.dealCard();
      assertEquals(expResult, result);
      // TODO review the generated test code and remove the default call to fail.
      // fail("The test case is a prototype.");
   }

   /**
    * Test of getDeck method, of class DeckOfCards.
    */
   @Test
   public void testGetDeck ()
   {
      System.out.println("getDeck");
      DeckOfCards instance = new DeckOfCards();
      ArrayList<Card> expResult = null;
      ArrayList<Card> result = instance.getDeck();
      assertEquals(expResult, result);
      // TODO review the generated test code and remove the default call to fail.
      // fail("The test case is a prototype.");
   }

   /**
    * Test of setDeck method, of class DeckOfCards.
    */
   @Test
   public void testSetDeck ()
   {
      System.out.println("setDeck");
      ArrayList<Card> DeckOfCards = null;
      DeckOfCards instance = new DeckOfCards();
      instance.setDeck(DeckOfCards);
      // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
   }

   /**
    * Test of initialDraw method, of class DeckOfCards.
    */
   @Test
   public void testInitialDraw ()
   {
      System.out.println("initialDraw");
      String name = "";
      Card card = null;
      DeckOfCards instance = new DeckOfCards();
      instance.initialDraw(name, card);
      // TODO review the generated test code and remove the default call to fail.
      // fail("The test case is a prototype.");
   }

   /**
    * Test of toString method, of class DeckOfCards.
    */
   @Test
   public void testToString ()
   {
      System.out.println("toString");
      DeckOfCards instance = new DeckOfCards();
      String expResult = "";
      String result = instance.toString();
      assertEquals(expResult, result);
      // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
   }
   
}
