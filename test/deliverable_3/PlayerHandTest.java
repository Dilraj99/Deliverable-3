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
public class PlayerHandTest
{

   public PlayerHandTest ()
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
    * Test of setHand method, of class PlayerHand.
    */
   @Test
   public void testSetHand ()
   {
      System.out.println("setHand");
      ArrayList<Card> hand = null;
      PlayerHand instance = new PlayerHand();
      instance.setHand(hand);
      // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
   }

   /**
    * Test of getHand method, of class PlayerHand.
    */
   @Test
   public void testGetHand ()
   {
      System.out.println("getHand");
      PlayerHand instance = new PlayerHand();
      ArrayList<Card> expResult = null;
      ArrayList<Card> result = instance.getHand();
      assertEquals(expResult, result);
      // TODO review the generated test code and remove the default call to fail.
      // fail("The test case is a prototype.");
   }

   /**
    * Test of addCard method, of class PlayerHand.
    */
   @Test
   public void testAddCard ()
   {
      System.out.println("addCard");
      Card card = null;
      PlayerHand instance = new PlayerHand();
      instance.addCard(card);
      // TODO review the generated test code and remove the default call to fail.
      // fail("The test case is a prototype.");
   }

   /**
    * Test of getNumOfCards method, of class PlayerHand.
    */
   @Test
   public void testGetNumOfCards ()
   {
      System.out.println("getNumOfCards");
      PlayerHand instance = new PlayerHand();
      int expResult = 12;
      int result = instance.getNumOfCards();
      assertEquals(expResult, result);
      // TODO review the generated test code and remove the default call to fail.
      // fail("The test case is a prototype.");
   }

   /**
    * Test of toString method, of class PlayerHand.
    */
   @Test
   public void testToString ()
   {
      System.out.println("toString");
      PlayerHand instance = new PlayerHand();
      String expResult = "";
      String result = instance.toString();
      assertEquals(expResult, result);
      // TODO review the generated test code and remove the default call to fail.
      // fail("The test case is a prototype.");
   }

}
