/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deliverable_3;

import java.util.ArrayList;
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
public class HandTest
{

   public HandTest ()
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
    * Test of getPlayerName method, of class Hand.
    */
   @Test
   public void testGetPlayerName ()
   {
      System.out.println("getPlayerName");
      Hand instance = null;
      String expResult = "";
      String result = instance.getPlayerName();
      assertEquals(expResult, result);
      // TODO review the generated test code and remove the default call to fail.
//      fail("The test case is a prototype.");
   }

   /**
    * Test of setPlayerName method, of class Hand.
    */
   @Test
   public void testSetPlayerName ()
   {
      System.out.println("setPlayerName");
      String playerName = "";
      Hand instance = null;
      instance.setPlayerName(playerName);
      // TODO review the generated test code and remove the default call to fail.
      //   fail("The test case is a prototype.");
   }

   /**
    * Test of getDealerName method, of class Hand.
    */
   @Test
   public void testGetDealerName ()
   {
      System.out.println("getDealerName");
      Hand instance = null;
      String expResult = "";
      String result = instance.getDealerName();
      assertEquals(expResult, result);
      // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
   }

   /**
    * Test of setDealerName method, of class Hand.
    */
   @Test
   public void testSetDealerName ()
   {
      System.out.println("setDealerName");
      String dealerName = "";
      Hand instance = null;
      instance.setDealerName(dealerName);
      // TODO review the generated test code and remove the default call to fail.
      // fail("The test case is a prototype.");
   }

   /**
    * Test of hitOrStay method, of class Hand.
    */
   @Test
   public void testHitOrStay ()
   {
      System.out.println("hitOrStay");
      Hand instance = null;
      String expResult = "";
      String result = instance.hitOrStay();
      assertEquals(expResult, result);
      // TODO review the generated test code and remove the default call to fail.
      //fail("The test case is a prototype.");
   }

   /**
    * Test of totalScore method, of class Hand.
    */
   @Test
   public void testTotalScore ()
   {
      System.out.println("totalScore");
      ArrayList<Card> hand = null;
      Hand instance = null;
      int expResult = 0;
      int result = instance.totalScore(hand);
      assertEquals(expResult, result);
      // TODO review the generated test code and remove the default call to fail.
      // fail("The test case is a prototype.");
   }

   /**
    * Test of gameStatus method, of class Hand.
    */
   @Test
   public void testGameStatus ()
   {
      System.out.println("gameStatus");
      int score = 0;
      int totalCards = 0;
      String name = "";
      Hand instance = null;
      String expResult = "";
      String result = instance.gameStatus(score, totalCards, name);
      assertEquals(expResult, result);
      // TODO review the generated test code and remove the default call to fail.
      // fail("The test case is a prototype.");
   }

   /**
    * Test of isWin method, of class Hand.
    */
   @Test
   public void testIsWin ()
   {
      System.out.println("isWin");
      String playerStatus = "";
      String dealerStatus = "";
      int dealerScore = 0;
      int playerScore = 0;
      Hand instance = null;
      String expResult = "";
      String result = instance.isWin(playerStatus, dealerStatus, dealerScore, playerScore);
      assertEquals(expResult, result);
      // TODO review the generated test code and remove the default call to fail.
      // fail("The test case is a prototype.");
   }

}
