//Robert W. Storer
//CSE 002 HW07
//March 17, 2015
//Professor Chen
//Waves Assignment

//The goal of this assignment is to practice using for, while, and do-while loops.
//The user will be prompted to enter an integer between 1 and 30 inclusive, and the computer will print results from
//your for, while, and do-while loops in the pattern specified in the assignment



import java.util.Scanner; //import scanner class

public class waves { //define class
public static void main (String [] args) { //add main method
        
 Scanner myScanner = new Scanner (System.in);
  
  System.out.print("Enter an integer between 1 and 30, inclusive: "); //Prompt user to enter an integer between 1 and 30, inclusive
  
  int input = 0; //initialize the integer the user inputs as a variable called input
  
 
 
  if (myScanner.hasNextInt()){ //makes sure user entered an integer.
      
    input = myScanner.nextInt();
    
    while (input > 30 || input < 1) { //makes sure the user enters an integer between 1 and 30, inclusive
         
        System.out.print("Invalid integer. Enter an integer between 1 and 30, inclusive: "); //If integer is not between 1 and 30, inclusive, the computer prompts user to enter a valid integer.
          
          //Computer will keep asking user for valid input until he or she enters an integer between 1 and 30, inclusive.
          
         input = myScanner.nextInt();
    }
    
    
    //First, I'll do the For Loop
    System.out.println("For Loop");
      
    for (int i = 1; i<=input; i++) { //this loop runs from the integer 1 to the integer entered by the user.
          
        if (i%2 == 0) { //this if is for the even integers between i and input
             
            for (int j = 1; j<=i; j++) {
                
                    
                for (int k =1; k<=j; k++){
                    System.out.print(i);
                    }
                System.out.println();
              }
        }
          
        else { //this else is for the odd integers between i and input
              
            for (int j = i; j>=1; j--) { 
                
                for (int k =1; k<=j; k++){
                    System.out.print(i);
                    }
                System.out.println();
              }
        }
         
    }
      
      //Now, do the While Loop
        System.out.println("While Loop");
        
        int i=1;
        
        while (i <= input) { //program will run as long as i is less than or equal to input
          
            if (i%2 == 0) { //this if is for the even integers between i and input
              
                int j =1;
                
                while (j <= i) {
                    
                    int k = 1;
                    
                    while (k<=j) {
                        System.out.print(i);
                        
                        k++;
                    }
                    System.out.println();
                
                    j++;    
                }
        
            }
            
            else { //this else is for the odd integers between i and input
                    int j =i;
                
                while (j >= 1) {
                    
                    int k = 1;
                    
                    while (k<=j) {
                        System.out.print(i);
                        
                        k++;
                    }
                    System.out.println();
                
                    j--;    
                }
                
            }
        
        i++;
        
        }
        
        System.out.println("Do-While Loop");
        

        
        
    
       
        

  } //close the if(myScanner.hasNextInt) loop







 //Lastly, close class and main method 
}
}