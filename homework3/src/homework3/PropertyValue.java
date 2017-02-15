/*
Assignment Number: 3
Assignment Title: Property Assessment Program
Author: Alex Kozlowski
Due Date: October 6, 2016

This program will calculate the real estate property giving the square footage.
*/
package homework3;
import java.util.Scanner;

public class PropertyValue {

    public static void main(String[] args) {
        
        //declares variables
        String streetName, room1, room2, room3, room4, room5;
        
        int streetNumber, numberOfRooms, room1Sqft, room2Sqft, room3Sqft, room4Sqft, room5Sqft, lineCount = 1, 
            totalArea;
        
        double pricePersqft, totalPrice;
        
        Scanner sc = new Scanner(System.in);
        
        //Asks the user to input infromation on the house and stores it into seperate variables
        System.out.print("Please enter the Street name: ");
        streetName = sc.nextLine();
        
        System.out.print("Please enter the Street number: ");
        streetNumber = sc.nextInt();
        
        System.out.print("Please enter the number of rooms: ");
        numberOfRooms = sc.nextInt();
        
        System.out.print("Enter room name: ");
        room1 = sc.next();
        System.out.print("Enter the square footage of the room: ");
        room1Sqft = sc.nextInt();
        
        
        System.out.print("Enter room name: ");
        room2 = sc.next();
        System.out.print("Enter the square footage of the room: ");
        room2Sqft = sc.nextInt();
        
        System.out.print("Enter room name: ");
        room3 = sc.next();
        System.out.print("Enter the square footage of the room: ");
        room3Sqft = sc.nextInt();
        
        System.out.print("Enter room name: ");
        room4 = sc.next();
        System.out.print("Enter the square footage of the room: ");
        room4Sqft = sc.nextInt();
        
        System.out.print("Enter room name: ");
        room5 = sc.next();
        System.out.print("Enter the square footage of the room: ");
        room5Sqft = sc.nextInt();
        
        System.out.print("Enter price per square foot: ");
        pricePersqft = sc.nextDouble();
        
        //calculates the area and price using the sq ft for each room
        totalArea = room1Sqft + room2Sqft + room3Sqft + room4Sqft + room5Sqft;
        
        totalPrice = pricePersqft * totalArea;
        
        //prints out the infromation
        System.out.printf("\n%d. %24s: %s # %d\n", lineCount, "Street", streetName, streetNumber);
        lineCount++;
        System.out.printf("%d. %24s: %d, %s, %s, %s, %s, %s\n", lineCount, "Total Rooms",numberOfRooms, room1, room2, room3, room4, room5);
        lineCount++;
        System.out.printf("%d. %24s: %d sq. ft\n", lineCount, "Total Area", totalArea);
        lineCount++;
        System.out.printf("%d. %24s: $%.2f\n", lineCount, "Price per sq. ft", pricePersqft);
        lineCount++;
        System.out.printf("%d. Estimated property value: $%.2f\n\n", lineCount, totalPrice);
    }//End of main
    
}//End of PropertyValue Class
