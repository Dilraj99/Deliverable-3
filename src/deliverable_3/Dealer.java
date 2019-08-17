package deliverable_3;
/**
 * @author Rich Smith at ZenOfProgramming.com
 */
public class Dealer extends PlayerHand
{

   // the dealer's name
   private String dealerName;


   public Dealer ()
   {


      super();


      dealerName = "Dealer";

   }



   public String getName ()
   {

      return dealerName;

   }



   public void setName (String dealerName)
   {

      this.dealerName = dealerName;
   }

   //method representing dealer's turn 
   public boolean dealerTurn (int dealerScore, int playerScore)
   {


      if (dealerScore < playerScore) {

         return true;

      }

      else {
         return false;

      }

   }


   //Complete programming of dealer playing with player in the back-end
   public boolean dealerAI (int dealerScore, int playerScore, String playerStays)
   {


      if (dealerScore == 21) {

         return false;
      }


      else if (playerScore > 21) {

         return false;
      }


      else if (playerScore < dealerScore) {


         if (dealerScore >= 17) {

            return false;
         }

      }


      else if (playerStays.equals("stay")) {


         if (dealerScore > playerScore) {

            return false;
         }
      }


      return true;

   }



   @Override
   // return a string representation of the Dealer's hand
   public String toString ()
   {

      return getName() + "'s card hand is: " + super.toString();
   }





}
