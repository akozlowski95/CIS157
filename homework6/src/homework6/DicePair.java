
package homework6;

public class DicePair {
   // declaring Die objects;
   private Die die1;
   private Die die2;
   
   //constructor intializing the objects
   public DicePair(int sidesOfDie){
       
       die1 = new Die(sidesOfDie);
       die2 = new Die(sidesOfDie);
       
   }
   
   //method that prints out the result of thesum of the 2 dies rolled
   public void rollResult(){
        int die1Roll, die2Roll, result;
        
        //using methods from the Die class
        die1Roll = die1.roll();
        die2Roll = die2.roll();
        result = die1Roll + die2Roll;
        
        System.out.print(die1Roll + " + " + die2Roll + " = " + result);
        
        //checks to see if  the result is a special case
        if(result == 2){
            System.out.print(" Snake eyes!");
        }
        else if(result == 7){
            System.out.print(" Craps!");
        }
        else if(result == 12){
            System.out.print(" Box cars!");
        }
   
   }
   
}
