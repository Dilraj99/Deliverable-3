package deliverable_3;
/**
 * @author Rich Smith at ZenOfProgramming.com
 */
import java.util.Scanner;


public class Player extends PlayerHand
{

//varable for playerName
   private String playerName;


   public Player ()
   {


      super();

      //Scanner for player input 
      Scanner playerInput = new Scanner(System.in);


      System.out.print("Enter your name: ");
      playerName = playerInput.next();

   }



   public String getName ()
   {

      return playerName;
   }



   public void setName (String playerName)
   {

      this.playerName = playerName;
   }

//print Player class value as string
   @Override
   public String toString ()
   {

      return getName() + "'s card hand is: " + super.toString();

   }

}
