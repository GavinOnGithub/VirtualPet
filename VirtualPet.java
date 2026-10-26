import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public static final Scanner scan = new Scanner(System.in);


public class VirtualPet {
   public static void main(String[] ags) {         
      boolean hasWon = false;
      boolean isAlive = true;
      String petsName = "Yousif";
      String itemName = "";
      VirtualPet userImput = new VirtualPet();
   
      int petsHunger = 5;
      int petsHappiness = 5;
      int petsEnergy = 5;
      
      while (isAlive == true && hasWon == false) {
         if (petsHunger >= 10) {
            isAlive = false;
            System.out.println("Your pet ran away to look or food");
         }
         
         if (petsHappiness >= 15) {
            System.out.println("You Win!");
            hasWon = true;
         }
         
         if (petsEnergy <= 0) {
            isAlive = false;
            System.out.println("Let's just say that your parents took your pet to a farm. The less you know the better");
         }
         newTurn();
                
      }
   
   
   }
   public static void newTurn() {
      System.out.println("What would you like to do?");
      System.out.println("1. Feed");
      System.out.println("2. Play");
      System.out.println("3. Sleep");
      System.out.println("4. Bath");
      System.out.println("5. Quit");
      VirtualPet userImput = new VirtualPet();
      userImput.itemName = scan.nextLine();
      
   
   }
}