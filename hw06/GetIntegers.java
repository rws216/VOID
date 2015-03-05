//Robert Winthrop Storer
//CSE002 Homework 6
//Professor Chen
//3/3/2015
//GetIntegers Assignment

//The goal of this assignment is to have the computer take 5 non negative integers from the user and print the sum of those integers.


import java.util.Scanner; //import the Scanner class
 
//define class and add main method
public class GetIntegers {
  public static void main(String [] args) {
      
      
      
    Scanner in = new Scanner(System.in); //Declare an instance of the Scanner class
    
    System.out.println("Enter 5 nonnegative integers: "); //Prompts user to etner 5 nonnegative integers
    
        int sum = 0; //initialize variables we will use later in the program.
        int count = 0;
  
   
         while(count<5){ //This while loop will run until five nonnegative integers are entered by the user.
            if(in.hasNextInt()){
               
                int input = in.nextInt();
               
                if (input >= 0){ //This adds the user's integer to the sum if it is a nonnegative integer
                      sum = sum + input;
                      count++;
                }
            else{ //negative integer case
                System.out.println("Invalid input, rerun program and begin again.");
                 return;
            }
            }
      
      else{ // noninteger case
        System.out.println("Invalid input, rerun program and begin again.");
        return;
      } //the above else statement tells the user their number was not valid and to enter again
        
             
         } //close the while loop
         
    System.out.println("Sum: " + sum); //This has the computer print the sum of the five integers.

// close the class and main method
  }
}
