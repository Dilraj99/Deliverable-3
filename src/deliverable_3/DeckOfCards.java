package deliverable_3;
/**
 * @author Rich Smith at ZenOfProgramming.com
 */
import java.util.ArrayList;
import java.util.Random;


public class DeckOfCards
{

   //Declare an ArrayList of Cards to represent the deck of cards
   private ArrayList< Card> DeckOfCards;


   public DeckOfCards ()
   {



      // integer array of all the possible card values in the deck 
      int[] CardValuesList = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10};


      DeckOfCards = new ArrayList< Card>();


      for (int cardNumber : CardValuesList) {

         //Create a new Card object with the CardValuesList element's value
         Card currentCard = new Card(cardNumber);

         //using a for loop to fill the deck with 4 cards of each value 
         for (int j = 1; j <= 4; j++) {


            DeckOfCards.add(currentCard);

         }

      }

   }


   //method to generate random cards
   public Random random ()
   {


      Random random = new Random();
      return random;
   }


   public int getDeckSize ()
   {

      return DeckOfCards.size();
   }



   public Card getRandomCard ()
   {


      int index = random().nextInt(getDeckSize());


      Card randomCard = DeckOfCards.get(index);

      return randomCard;
   }



   public void shuffleDeck ()
   {


      for (int i = 0; i < getDeckSize(); i++) {


         Card randomCard = getRandomCard();


         int randomCardIndex = DeckOfCards.indexOf(randomCard);


         DeckOfCards.remove(randomCardIndex);


         DeckOfCards.add(randomCard);

      }

   }


   //mehod for giving cards(dealing cards)
   public Card dealCard ()
   {



      Card randomCard = getRandomCard();


      int randomCardIndex = DeckOfCards.indexOf(randomCard);

      DeckOfCards.remove(randomCardIndex);

      return randomCard;
   }

   public ArrayList< Card> getDeck ()
   {

      return DeckOfCards;
   }


   public void setDeck (ArrayList< Card> DeckOfCards)
   {

      this.DeckOfCards = DeckOfCards;
   }


   public void initialDraw (String name, Card card)
   {

      System.out.println(name + " draws " + card + ".");
   }

   @Override
   public String toString ()
   {

      return "Current deck of cards: " + "\n" + getDeck();
   }

}
