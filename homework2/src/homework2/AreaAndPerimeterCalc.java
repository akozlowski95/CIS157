/*
Assignment Number: 2
Assignment Title: Area and Perimeter Calculator
Author: Alex Kozlowski
Due Date: September 29, 2016

This program will take length and width values and calculate the area and 
perimeter of the two. 
 */
package homework2;

public class AreaAndPerimeterCalc 
{
    public static void main(String[] args) 
    {
        //Delclares variables
        double length = 10.5;
        double width = 12.0;
        double area = length * width;
        double perimeter = (2 * length) + (2 * width);
        
        //Welcome message
        System.out.println("Welcome to the Area and Perimeter Calculator!\n");
        
        //Stores the message in a String variable
        String message =     "Length:\t" + length + "\n"
                           + "Width:\t" + width + "\n"
                           + "Area:\t" + area + "\n"
                           + "Perimeter:\t" + perimeter + "\n";
        
        //prints out the variable values
        System.out.print(message);
          
    }//End of Main
    
}//End of AreaAndPerimeterCalc class
