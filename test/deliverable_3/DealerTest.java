/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deliverable_3;

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
public class DealerTest
{

   public DealerTest ()
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
    * Test of getName method, of class Dealer.
    */
   @Test
   public void testGetName ()
   {
      System.out.println("getName");
      Dealer instance = new Dealer();
      String expResult = "Dealer";
      String result = instance.getName();
      assertEquals(expResult, result);
      // TODO review the generated test code and remove the default call to fail.
      //    fail("The test case is a prototype.");
   }

   @Test
   //this fails
   public void testGetNameBad ()
   {
      System.out.println("getName");
      Dealer instance = new Dealer();
      String expResult = "Dealerer";
      String result = instance.getName();
      assertEquals(expResult, result);
      // TODO review the generated test code and remove the default call to fail.
      //    fail("The test case is a prototype.");
   }

   /**
    * Test of setName method, of class Dealer.
    */
   @Test
   public void testSetName ()
   {
      System.out.println("setName");
      String dealerName = "Dealer";
      Dealer instance = new Dealer();
      instance.setName(dealerName);
      // TODO review the generated test code and remove the default call to fail.
      //   fail("The test case is a prototype.");
   }

   /**
    * Test of dealerTurn method, of class Dealer.
    */
   @Test
   public void testDealerTurn ()
   {
      System.out.println("dealerTurn");
      int dealerScore = 22;
      int playerScore = 21;
      Dealer instance = new Dealer();
      boolean expResult = false;
      boolean result = instance.dealerTurn(dealerScore, playerScore);
      assertEquals(expResult, result);
      // TODO review the generated test code and remove the default call to fail.
      //   fail("The test case is a prototype.");
   }

   /**
    * Test of dealerAI method, of class Dealer.
    */
   @Test
   public void testDealerAI ()
   {
      System.out.println("dealerAI");
      int dealerScore = 18;
      int playerScore = 20;
      String playerStays = "hit";
      Dealer instance = new Dealer();
      boolean expResult = true;
      boolean result = instance.dealerAI(dealerScore, playerScore, playerStays);
      assertEquals(expResult, result);
      // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
   }

   /**
    * Test of toString method, of class Dealer.
    */
   @Test
   public void testToString ()
   {
      System.out.println("toString");
      Dealer instance = new Dealer();

      String expResult = "";
      String result = instance.toString();
      assertEquals(expResult, result);
      // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
   }

}
