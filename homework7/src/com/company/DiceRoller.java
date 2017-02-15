package com.company;



/**
 * Created by alexa_000 on 11/22/2016.
 */
public class DiceRoller {
    //initializes objects and variables
    DicePair pair;
    DicePair[] rollSeries;
    private int numberOfSides;
    private int[] combinations;
    private int[] countArr;

    //constructor
    public DiceRoller(int numberOfSides){
        pair = new DicePair(numberOfSides);
        this.numberOfSides = numberOfSides;
    }

    //method that prints the final results of the series of rolled dice
    public void rollSeries(int numberOfRolls) {

        //array of objects from DicePair class
        rollSeries = new DicePair[numberOfRolls];
        //initializes the size of the combination
        combinations = new int[1 + (numberOfSides * 2)];
        int count = 0;

        //loop that stores the results of the sum of dice into the rollSeries array
        for (int i = 0; i < numberOfRolls; i++) {
            pair = new DicePair(numberOfSides);
            pair.rollSum();
            rollSeries[i] = pair;
        }

        //method that creates the combinations of the array depending on the number of sides
        setCombinations(combinations);

        //method that prints the title
        printTitle();
        //array initializing the size of array count
        countArr = new int[1 + numberOfSides*2];

        //for loop that counts the rolled results with the combination array
        for (int i = 0; i < combinations.length; i++) {

            for (int j = 0; j < rollSeries.length; j++) {

                //checks to see if the rolled sum will match a combination
                if (combinations[i] == rollSeries[j].getSum()) {
                    count++;
                }

            }
            //store the count in array
            countArr[i] = count;
            count = 0;

        }

        //method that prints the final result of the dice roll series
        printRollResult(combinations,countArr, numberOfRolls);

    }

    //sets the size of the combinations
    public static int[] setCombinations(int[] combinations){

        //loop sets the combination depending on the number of sides
        for (int i = 0; i < combinations.length;i++){
            combinations[i] = i;
        }

        return combinations;
    }

    // Prints title
    public static void printTitle(){
        System.out.printf("%s   %5s   %5s\n" +
                "%s  %s   %s","Sum","Count", "Percent", "----", "-----","------");
    }


    //Prints results
    public static void printRollResult(int[] combinations, int[] countArr,int numberOfRolls){

        int temp = 0;
        int temp2 = 0;
        double[] percentArr = new double[countArr.length];

        //for loop that sorts out the combinations and countArr in descending order
        for (int i = 0; i < countArr.length; i++){

            for (int j = 1; j < (countArr.length - i); j++){

                if (countArr[j - 1] > countArr[j]){

                    //bubble sort, twice so both arrays can match
                    temp = countArr[j - 1];
                    countArr[j -1] = countArr[j];
                    countArr[j] = temp;

                    temp2 = combinations[j - 1];
                    combinations[j -1] = combinations[j];
                    combinations[j] = temp2;

                }

            }
        }

        //methods that reverse the arrays so it is from highest count to lowest
        countArr = reverseArray(countArr);
        combinations = reverseArray(combinations);

        for (int i = 0; i < countArr.length;i++){
            //gets the percent of the count using the number of rolls and storing them in a array
            percentArr[i] = (((double) (countArr[i]) / (numberOfRolls)) * 100);

            //will only print when the count is greater then 0
            if (countArr[i] != 0) {
                System.out.printf("\n%d\t\t%d\t   %.2f%s", combinations[i], countArr[i], percentArr[i],"%");
            }
        }
        System.out.println("\n");

    }

    //method to reverse an array
    public static int[] reverseArray(int[] arr){

        for (int i = 0; i < arr.length/2;i++){

            int temp = arr[i];
            arr[i] = arr[arr.length - 1 -i];
            arr[arr.length - 1- i] = temp;

        }

        return arr;
    }

}
