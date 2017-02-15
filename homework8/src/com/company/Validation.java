package com.company;

import java.util.Scanner;

/**
 * Created by alexa_000 on 12/1/2016.
 */
public class Validation {


    public static int getInt(String prompt, Scanner sc){
        int i = 0;
        boolean isValid = false;
        while (isValid == false)
        {
            System.out.print(prompt);
            if (sc.hasNextInt())
            {
                i = sc.nextInt();
                isValid = true;
            }
            else
            {
                System.out.println("Error! Invalid integer value. Try again.");
            }
            sc.nextLine();
        }
        return i;
    }

    public static String getString(Scanner sc, String prompt)
    {
        String s = null;
        do
        {
            System.out.print(prompt);
            s = sc.nextLine();  // read user entry
            if (s.equals(""))
            {
                System.out.println("String cannot be left blank!");
            }
        } while (s.equals(""));

        return s;
    }

}
