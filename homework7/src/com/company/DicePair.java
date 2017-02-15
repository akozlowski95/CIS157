package com.company;

/**
 * Created by alexa_000 on 11/22/2016.
 */
public class DicePair {

    Die die1;
    Die die2;
    private int sum;
    //constructor initializes the variables
    public DicePair(int numberOfSides){
        die1 = new Die(numberOfSides);
        die2 = new Die(numberOfSides);
    }
    //returns the result of two dies rolled
    public int rollSum(){

        sum = die1.roll() + die2.roll();

        return sum;

    }

    //method prints the result of the 2 die
    public void printRollSum(){

        int sum, die1Roll, die2Roll;
        die1Roll = die1.roll();
        die2Roll = die2.roll();

        //adds both rolls and stores them into sum variable
        sum = die1Roll + die2Roll;

        System.out.print(die1Roll + " + " + die2Roll + " = " + sum);
        //checks to see if there is a special result
        if(sum == 2)
            System.out.print(" Snake Eyes!");
        else if (sum == 7)
            System.out.print(" Craps!");
        else if (sum ==12)
            System.out.print(" Box Cars!");
    }

    //returns the sum of two rolled die
    public int getSum() {
        return sum;
    }
}
