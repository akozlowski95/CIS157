/*
Assignment Number: 6
Assignment Title: Dice Roller Program
Author: Alex Kozlowski
Due Date: November 10, 2016

This program will take in the number of sides of a die and print the result
of a pair of dice rolled.
*/
package homework6;
import java.util.Scanner;

public class DiceRollerApp {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Intializing variables and object
        int menuChoice,sidesOfDice = 6;
        String userChoice = "y";
        DicePair pair = new DicePair(sidesOfDice);
        
        //Tells user the most common type of die to give them an idea
        System.out.println("The most common type of die are the:"
                            + "\n4 sided , 6 sided"
                            + "\n8 sided , 10 sided"
                            + "\n12 sided , 20 sided");
        
        //while loop that check to see if the user wants to continue
        while(userChoice.equalsIgnoreCase("y")){
            //Menu the user can pick from
            System.out.println( "\n1. Enter the amount of sides you want."
                + "\n2. Roll the Dice.(Note: the default Die is 6 sided.)"
                + "\n3. Exit the Program."
                + "\nYour choice: ");
        
            //gets the choice from the user
            menuChoice = sc.nextInt();

            //Switch statement to check the menuChoice
            switch(menuChoice){

                case 1:
                    //Asks for the amount of sides
                    do{
                        System.out.print("Enter the amount of sides (sides cannot be less than 1): ");
                        
                        //Validates the data, if its invalid the user has to reenter
                        while(!sc.hasNextInt()){
                            System.out.println("Invaild please reenter: ");
                            sc.next();
                        }
                        
                        //Stores the user input
                        sidesOfDice = sc.nextInt();
                        
                        //creates and object of the DicePair class using the data from above
                        pair = new DicePair(sidesOfDice);
                        }
                    // if the sidesOfDice is less than 0 it will continue to ask the user for a new number
                    while (sidesOfDice <= 0);
                    break;
                case 2:
                    String rollAgain = "y";
                    
                    //rolls the dice pair and checks to see if the user want to continue to roll
                    while(rollAgain.equalsIgnoreCase("y")){
                        System.out.println("Roll result: ");
                        
                        //prints out the result using a method from the DicePair class
                        pair.rollResult();
                        System.out.println("\nRoll again? (y/n)");
                        rollAgain = sc.next();
                    }
                    break;
                case 3:
                    //Exits out of the program
                    System.out.println("Thank you for using the Dice roller app!");
                    userChoice = "n";
                    break;
            }
        }
    }
    
}
