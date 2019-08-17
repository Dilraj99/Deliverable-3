package deliverable_3;
import java.util.ArrayList;
import java.util.Scanner;


public class Hand
{

   // string instance variables representing player and dealer
   private String playerName;
   private String dealerName;


   public Hand (String playerName, String dealerName)
   {

      //the player and dealer's names

      this.playerName = playerName;
      this.dealerName = dealerName;

   }



   public String getPlayerName ()
   {

      return playerName;
   }


   public void setPlayerName (String playerName)
   {

      this.playerName = playerName;
   }


   public String getDealerName ()
   {

      return dealerName;
   }

   public void setDealerName (String dealerName)
   {

      this.dealerName = dealerName;
   }


   //method that take  hit or stay command
   public String hitOrStay ()
   {


      Scanner input = new Scanner(System.in);

      //player's command
      String answer;


      System.out.print(playerName + ", please choose to \''Hit\'' or \''Stay\'': ");
      answer = input.next();


      if (answer.startsWith("H") || answer.startsWith("h")) {

         return "hit";
      }


      else if (answer.startsWith("S") || answer.startsWith("s")) {

         return "stay";
      }

      else {
         return "null";
      }

   }


   //method for total Score
   public int totalScore (ArrayList< Card> hand)
   {


      Card currentCard;


      int currentCardValue = 0;


      int total = 0;



      for (Card eachCard : hand) {


         int cardValue = eachCard.getValue();

         //Check for an Ace
         //If the card's value is 1...
         if (cardValue == 1) {

            //Increment the total by 11
            total = total + 11;
         }
         else {


            total = total + cardValue;
         }
      }

      //If the player's total is greater than 21 he/she will burst
      if (total > 21) {

         //look at each card element in the entire hand 
         for (int i = 0; i < hand.size(); i++) {


            currentCard = hand.get(i);


            currentCardValue = currentCard.getValue();

            //if the value is 1 card is as ace
            if (currentCardValue == 1) {

               //change ace card's value
               total = total - 10;


               return total;

            }
         }
      }
      return total;

   }

   //method to display game status
   public String gameStatus (int score, int totalCards, String name)
   {


      for (int i = 1; i <= 5; i++) {



         //If the player's score is greater than or equal to 21
         if (score >= 21) {

            //If the player's score is greater than 21, then return bust
            if (score > 21) {

               return "Bust";
            }


            // the score is exactly 21, return string 'Win'
            else {

               return "Win";
            }

         }

         //If the player's name is not dealer, then it's the human player
         if (!(name.equals("Dealer"))) {


            if (totalCards == 5) {
               return "Charlie";
            }
         }

      }

      //If none of the status' above, return string 'Continue'
      return "Continue";

   }


   //method to determine the win or loss
   public String isWin (String playerStatus, String dealerStatus, int dealerScore, int playerScore)
   {

      //If neither the player or dealer have busted...
      if (!(playerStatus.equals("Bust")) && !(dealerStatus.equals("Bust"))) {


         if (playerScore > dealerScore) {

            return "The winner is " + getPlayerName();
         }


         else if (playerScore < dealerScore) {

            return "The winner is " + getDealerName();
         }


         else {

            return "It's a draw!";
         }

      }

      // if player has busted, return string informing player his/her loss
      else if (playerStatus.equals("Bust")) {
         return getPlayerName() + " Busts! " + getDealerName() + " won!";
      }


      else {
         return getDealerName() + " Busts! " + getPlayerName() + " won!";
      }

   }


}
