package com.company;

import java.util.Scanner;

/**
 * Created by alexa_000 on 11/22/2016.
 */
public class Validation {

    //validates the menu value
   public static  int menuVal(Scanner sc){

       int i = 0;
        //users choice cannot be a string, less than 0 or greater than 4
       do {
           System.out.println("Your choice: ");
           while (!sc.hasNextInt()){
               System.out.println("Invalid, reenter: ");
               sc.next();
           }
           i = sc.nextInt();
       }while (i < 0 || i > 4);

       return i;
   }
    //validates the sides and roll numbers
   public static int sideAndRollValidation(Scanner sc, String message){
       int i = 0;
        //number cannot be a string or less then 1
       do {
           System.out.println(message);
           while (!sc.hasNextInt()){
               System.out.println("Invalid, reenter: ");
               sc.next();
           }
           i = sc.nextInt();
       }while (i < 1);

       return i;
   }


}
