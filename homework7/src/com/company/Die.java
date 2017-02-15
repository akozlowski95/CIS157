package com.company;

/**
 * Created by alexa_000 on 11/22/2016.
 */
public class Die {
    //declares private int
    private int numberOfSides;

    //constructor for numberofsides
    public Die(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    //method that return the sum of 1 die rolled
    public int roll(){
        int roll = 1 + (int)(Math.random() * numberOfSides);
        return roll;
    }

}
