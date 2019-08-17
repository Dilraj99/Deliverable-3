package deliverable_3;

/**
 *
 * @author Rich Smith at ZenOfProgramming.com
 */
import java.util.ArrayList;
import java.util.Scanner;

//start of class
public class Start
{


   public static void main (String[] args)
   {

      //Play a full game at least once, and continue while the player chooses to play again
      do {




//player's object
         Player player = new Player();

         //ArrayList of Cards that will represent the player's hand
         ArrayList< Card> playerHand = player.getHand();


         int playerScore = 0;

         int playerTotalCards = 0;


         String playerStatus = "";



         Dealer dealer = new Dealer();


         ArrayList< Card> dealerHand = dealer.getHand();

         //dealer's score 
         int dealerScore = 0;

         int dealerTotalCards = 0;

         // representing the dealer's status
         String dealerStatus = "";


         //Hand object that will keep tabs on the score and status of the players
         Hand Hand = new Hand(player.getName(), dealer.getName());

         // represents the winner of the game
         String winnerOfGame = "";

         // represent a full deck of cards
         DeckOfCards DeckOfCards = new DeckOfCards();


         //Begin the game of BlackJack


         //Shuffle the deck of cards
         DeckOfCards.shuffleDeck();



         Card playerCard = DeckOfCards.dealCard();


         player.addCard(playerCard);


         Card dealerCard = DeckOfCards.dealCard();


         dealer.addCard(dealerCard);


         DeckOfCards.initialDraw(player.getName(), playerCard);
         DeckOfCards.initialDraw(dealer.getName(), dealerCard);



         String playerChoice;


         playerChoice = Hand.hitOrStay();



         while (playerChoice.equals("hit")) {


            player.addCard(DeckOfCards.dealCard());


            playerScore = Hand.totalScore(playerHand);


            playerTotalCards = player.getNumOfCards();


            playerStatus = Hand.gameStatus(playerScore, playerTotalCards, player.getName());

            //displaying stats
            System.out.println(player);
            System.out.println(player.getName() + "'s score is: " + playerScore);
            System.out.println(player.getName() + "'s status is: " + playerStatus + "\n");


            if (playerStatus.equals("Continue")) {


               playerChoice = Hand.hitOrStay();
            }


            else {

               System.out.println(player.getName() + ", cannot draw anymore because your "
                       + "status is: " + playerStatus + "\n");
               break;

            }

         }


         if (playerStatus.equals("Charlie")) {


            System.out.println("Charlie! Congrats, " + player.getName() + "! You won!");


         }
         else {


            dealerScore = Hand.totalScore(dealerHand);


            while (dealer.dealerTurn(dealerScore, playerScore)) {


               if (dealer.dealerAI(dealerScore, playerScore, playerChoice)) {


                  dealerScore = Hand.totalScore(dealerHand);


                  dealerTotalCards = dealer.getNumOfCards();


                  dealerStatus = Hand.gameStatus(dealerScore, dealerTotalCards, dealer.getName());


                  if (dealerStatus.equals("Continue")) {


                     dealer.addCard(DeckOfCards.dealCard());
                  }

                  else {

                     break;
                  }

               }

               else {
                  break;
               }
            }


            System.out.println(dealer.getName() + "'s turn is now over." + "\n");


            winnerOfGame = Hand.isWin(playerStatus, dealerStatus, dealerScore, playerScore);

            //Display the scores of both players
            System.out.println(player.getName() + "'s final score is: " + playerScore);
            System.out.println(player + "\n");

            System.out.println(dealer.getName() + "'s final score is: " + dealerScore);
            System.out.println(dealer);


            System.out.println("\n" + winnerOfGame + "\n");

         }


      }
      while (playAgain());


   }


   public static boolean playAgain ()
   {


      Scanner playAgainInput = new Scanner(System.in);


      String answer;


      System.out.print("Enter the word 'yes' to play again, or anything else to end the game: ");
      answer = playAgainInput.next();


      if (answer.equalsIgnoreCase("yes")) {
         return true;
      }//end if


      else {
         return false;
      }

   }

}
