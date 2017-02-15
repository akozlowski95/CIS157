/*
Assignment Number: 7
Assignment Title: Dice Roller Stats
Author: Alex Kozlowski
Due Date: December 1, 2016

This program will take in the number of sides of a die and print the result
of a pair of dice rolled it will also roll a certain number of times and print the sum, count and percent of the count.
*/

package com.company;
import java.util.Scanner;

public class DiceRollerApp {

    public static void main(String[] args) {

        //Initialize scanner object
	    Scanner sc = new Scanner(System.in);
        final int DEFAULT_DIE = 6;
        //initialize variables
        int menuChoice, numberOfSides = DEFAULT_DIE, numberOfRolls = 0;
        //initialize objects
        DicePair pair = new DicePair(numberOfSides);
        DiceRoller roller = new DiceRoller(numberOfSides);
        String userChoice = "y";

        //Welcome messages
        System.out.println("Welcome to the Dice Roller App!\n");

        System.out.println("The most common type of die are the:"
                + "\n4 sided , 6 sided"
                + "\n8 sided , 10 sided"
                + "\n12 sided , 20 sided\n");

        //loop for the menu, checks to see what the user choice is
        while(userChoice.equalsIgnoreCase("y")) {
            //menu options
            System.out.println("1. Enter the number of sides" +
                    "\n2. Roll the dice (Note: the default Die is 6 sided.)" +
                    "\n3. Dice roll series" +
                    "\n4. Exit the program");
            menuChoice = Validation.menuVal(sc);

            //switch statement
            switch (menuChoice) {
                //case 1 lets the user change the number of sides
                case 1:
                    //validates the number of sides of die
                    numberOfSides = Validation.sideAndRollValidation(sc, "Please enter the number of sides(Note: Cannot be less than 1): ");
                    //creates objects using the sides of die
                    pair = new DicePair(numberOfSides);
                    roller = new DiceRoller(numberOfSides);
                    break;
                //case 3 lets the user roll the dice one at a time
                case 2:
                    String rollAgain = "y";
                    //loop to check if the user want to continue
                    while (rollAgain.equalsIgnoreCase("y")) {
                        //prints the sum of two die
                        pair.printRollSum();
                        System.out.println("\nWould you like to roll again? (y/n):");
                        rollAgain = sc.next();
                    }
                    break;
                //case 3 rolls a series of dice print the results
                case 3:
                    //validates the number of rolls the user wants
                    numberOfRolls = Validation.sideAndRollValidation(sc, "How many times do you want to roll: ");
                    //prints the result using the DiceRoller class
                    roller.rollSeries(numberOfRolls);
                    break;
                //case 4 exits the program
                case 4:
                    userChoice = "n";
                    System.out.println("Thank you for using the Dice Roll App!");
                    break;
            }
        }

    }
}
