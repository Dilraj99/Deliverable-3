package deliverable_3;
/**
 * @author Kirtan Parekh
 * Acts as a dealer
 */
import java.util.ArrayList;




public class PlayerHand
{

   //varibale representing player hand
   private ArrayList< Card> hand;


   //Constructor
   public PlayerHand ()
   {

      // the player's hand of cards as an empty ArrayList
      hand = new ArrayList< Card>();

   }//end Player constructor



   public void setHand (ArrayList< Card> hand)
   {

      this.hand = hand;
   }



   public ArrayList< Card> getHand ()
   {
      return hand;
   }//end method getHand


   public void addCard (Card card)
   {

      hand.add(card);
   }





   public int getNumOfCards ()
   {


      int totalCards = 0;


      for (Card eachCard : hand) {


         totalCards = totalCards + 1;

      }
      return totalCards;

   }




   @Override

   //return value of player hand in the form of String
   public String toString ()
   {

      return getHand() + "";

   }




}
