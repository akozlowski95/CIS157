
package homework6;

public class Die {
 //intializing varibles
 private int sidesOfDie;
 private int defaultDie = 6;
 private int dieRoll;
 
 //constructor
 public Die(){
     sidesOfDie = defaultDie;
 }
 //over loaded constructor, intializing the number of sides
 public Die(int sidesOfDie){
     this.sidesOfDie = sidesOfDie;
 }
 
 //roll method rolls the die to get a random number
 public int roll(){
     
     dieRoll = 1 + (int)(Math.random() * sidesOfDie);
     return dieRoll;
     
 }
 
}
