/*
Assignment Number: 4
Assignment Title: Computing Prime Numbers
Author: Alex Kozlowski
Due Date: October 20, 2016

This program will take a begining integer and an ending integer and find the prime
numbers between the two
 */
package homework4;
import java.util.Scanner;

public class PrimeNumbersApp {

    public static void main(String[] args) {
        //Declaring variables and Scanner  class
        int firstRange, secondRange, j,start;
        Scanner sc = new Scanner(System.in);
        //Intializing a string to  y
        String userChoice = "y";
        
        //While loop checks to see if the user want to retry, if n then the program stops
        while(userChoice.equalsIgnoreCase("y")){
            
            int lineCount = 0;
            
            //Asks the user for a starting and ending point, stores them into variables
            System.out.print("Please enter the the begining number: ");
            firstRange = sc.nextInt();
            System.out.print("Please enter the ending number: ");
            secondRange = sc.nextInt();
            
            //Prints message
            System.out.printf("\nThe Prime numbers between %d and %d are: \n", firstRange, secondRange);
            
            //For loop that loops through the starting point until it reaches the end point
            for(start = firstRange ; start <= secondRange;start++){
                //intializes varible to keep track of prime numbers
                int primeCount = 0;
            
                //second for loop will check to see if numbers are prime
                for(j=2;j <= start/2; j++){
                    
                   // Checks to see if there is a remainder, if there is adds 1 to primeCount
                   if(start % j == 0){   
                      primeCount++;
                      break;
                   }
                }
                //Checks the primeCount, if it is equal to 0 then the number is prime
                if(primeCount == 0 && start != 1){
                    lineCount++;
                    //prints the line number and prime number
                    System.out.printf("%d. %d\n", lineCount, start);
                   }
            }
            //Asks the user if they want to try again
            System.out.print("\nWould you like to try again?: y/n: ");
            userChoice = sc.next();
        }
    }//End of Main
    
}//End of class
