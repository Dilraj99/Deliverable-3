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
public class StartTest
{

   public StartTest ()
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
    * Test of main method, of class Start.
    */
//   @Test
//   public void testMain ()
//   {
//      System.out.println("main");
//      String[] args = null;
//      Start.main(args);
//      // TODO review the generated test code and remove the default call to fail.
//      fail("The test case is a prototype.");
//   }

   /**
    * Test of playAgain method, of class Start.
    */
   @Test
   public void testPlayAgainGood ()
   {
      System.out.println("playAgain");
      boolean expResult = true;
      boolean result = Start.playAgain();
      assertEquals(expResult, result);
      // TODO review the generated test code and remove the default call to fail.
      //     fail("The test case is a prototype.");
   }

}
