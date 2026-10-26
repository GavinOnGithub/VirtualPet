import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class VirtualPet {
   public static void main(String[] ags) {         
      boolean hasWon = false;
      boolean isAlive = true;
      String petsName = "Yousif";
      int choice = 0;
      Scanner input = new Scanner(System.in);
   
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
         
         if (petsHappiness <= 0) {
            isAlive = false;
            System.out.println("Your pet hates you and left");
         }
         
         if (petsEnergy <= 0) {
            isAlive = false;
            System.out.println("Let's just say that your parents took your pet to a farm. The less you know the better"); 
         }
         System.out.println("What would you like to do?");
         System.out.println("1. Feed");
         System.out.println("2. Play");
         System.out.println("3. Sleep");
         System.out.println("4. Bath");
         System.out.println("5. Quit");
         choice = input.nextInt();
         
         if (choice == 1) {
            petsHunger += 2;
            petsHappiness += 1;
            System.out.println("Your pet ate the food");  
         }
         if (choice == 2) {
            petsHappiness += 3;
            petsEnergy -= 2;
            System.out.println("Your pet is tired but happy");  
            
         }
         if (choice == 3) {
            petsEnergy += 3;
            petsHappiness += 1;
            System.out.println("Your pet is now energized anad happy");  
         }
         if (choice == 4) {
            petsHappiness -= 3;
            System.out.println("Your pet isn't happy at all");  
         }
         if (choice == 5) {
            input.close();
         }
         
         System.out.println("Because of this your pets new stats are:");
         System.out.println("Happiness: " + petsHappiness + " Energy: " + petsEnergy + " Hunger: " + petsHunger);
         
         if (petsHunger >= 10) {
            isAlive = false;
            System.out.println("Your pet ran away to look or food");
         }
         
         if (petsHappiness >= 15) {
            System.out.println("You Win!");
            hasWon = true;
         }
         
         if (petsHappiness <= 0) {
            isAlive = false;
            System.out.println("Your pet hates you and left");
         }
         
         if (petsEnergy <= 0) {
            isAlive = false;
            System.out.println("Let's just say that your parents took your pet to a farm. The less you know the better"); 
         }      
      }
   }
}