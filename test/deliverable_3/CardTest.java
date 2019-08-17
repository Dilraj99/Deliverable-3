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
public class CardTest
{

   public CardTest ()
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
    * Test of getValue method, of class Card.
    */
   @Test
   public void testGetValue ()
   {
      System.out.println("getValue");
      Card instance = new Card(7);
      int expResult = 7;
      int result = instance.getValue();
      assertEquals(expResult, result);
      // TODO review the generated test code and remove the default call to fail.
      //    fail("The test case is a prototype.");
   }

   /**
    * Test of setValue method, of class Card.
    */
   @Test
   public void testSetValue ()
   {
      System.out.println("setValue");
      int value = 5;
      Card instance = new Card(2);
      instance.setValue(value);
      // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
   }

   /**
    * Test of toString method, of class Card.
    */
   @Test
   public void testToString ()
   {
      System.out.println("toString");
      Card instance = new Card(2);
      String expResult = "2";
      String result = instance.toString();
      assertEquals(expResult, result);
      // TODO review the generated test code and remove the default call to fail.
      //     fail("The test case is a prototype.");
   }

}
