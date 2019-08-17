package deliverable_3;
/**
 * @author Rich Smith at ZenOfProgramming.com
 */

public class Card
{


   private int value;


   public Card (int value)
   {

      this.value = value;

   }


   public int getValue ()
   {

      return value;

   }


   public void setValue (int value)
   {

      this.value = value;

   }


   @Override
   //return Card's value as a string
   public String toString ()
   {

      return getValue() + "";

   }

}
