//Robert Winthrop Storer
//CSE002 Homework 6
//Professor Chen
//3/3/15
//MakeSymbols Assignment

//The goal of this assignment is to generate a random integer between 0 and 100. If the integer is even, it will print that number of * characters. If it is odd, it will print that number of & symbols.

import java.util.Random; //import the Random class
 
//Define a class and add a main method
public class MakeSymbols {
  public static void main(String [] args) {
     
    Random r = new Random(); //initialize random number generator 
    
    int count = 0; //intialize a variable called count
    
    do{
      int randomInt = r.nextInt(101); //This defines the variable randomInt that is a random integer from 0-100 found with the random generator
      
      System.out.println("Random number generated: " + randomInt); //This prints the random integer generated.
     
        if(randomInt % 2 == 0){ //This if statement has the computer print the number generated in astricks if it was even.
            for(int i = 0; i < randomInt; i++){
                System.out.print("*");
            }
        
        System.out.println(); //Filler line
        
      }
      
      else{ //This if statement has the computer print the number generated in &s if it was odd.
        for(int i = 0; i < randomInt; i++){
         System.out.print("&");
        }
        
        System.out.println(); //Filelr line
        
      }
     
     count++;

    }
    
    while(count < 2); //This repeats the do-statements twice. If it were count<1, it would only generate one random number and represent it in *s or &s. 
    //I wasn't sure if you wanted us to go twice through the loop. The sample output went through twice, so I went through twice.
   
   
//close class and main method
  }
}
