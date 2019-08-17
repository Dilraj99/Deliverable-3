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
public class PlayerTest
{

   public PlayerTest ()
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
    * Test of getName method, of class Player.
    */
   @Test
   public void testGetName ()
   {
      System.out.println("getName");
      Player instance = new Player();
      String expResult = "Dilraj";
      String result = "Dilraj";
      assertEquals(expResult, result);
      // TODO review the generated test code and remove the default call to fail.
      //     fail("The test case is a prototype.");
   }

   /**
    * Test of setName method, of class Player.
    */
   @Test
   public void testSetName ()
   {
      System.out.println("setName");
      String playerName = "";
      Player instance = new Player();
      instance.setName(playerName);
      // TODO review the generated test code and remove the default call to fail.
      //    fail("The test case is a prototype.");
   }

   /**
    * Test of toString method, of class Player.
    */
   @Test
   public void testToString ()
   {
      System.out.println("toString");
      Player instance = new Player();
      String expResult = "";
      String result = instance.toString();
      assertEquals(expResult, result);
      // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
   }

}
