//Robert Winthrop Storer
//CSE002 Homework 6
//Professor Chen
//3/3/2015
//RunFactorial Assignment

//The goal of this assignment is to use a while-loop to solve factorial problems.

import java.util.Scanner; //import the Scanner class

//Define class and add main method
public class RunFactorial {
	public static void main(String [] args) {
	    
	    
	    
		Scanner in = new Scanner(System.in); //declare an instance of the Scanner class
		
		System.out.println("Enter a number between 9 and 16 inclusive: "); //This prompts the user to enter an integer between 9 and 16, including 9 and 16 as valid options.
		
		int num = in.nextInt(); //declare num as the variable assigned to the integer entered by the user
		
		int i = 1;
		int factorial = 1; //this initializes variables we will use later in the program.
		
		if(num >= 9 && num <= 16){ //This runs the while loop as long as the user entered an integer between 9 and 16, inclusive.
			
			while(!(i > num)) {
				factorial =  factorial * i;
				i++;
			} //the above while loop calculates the factorial of the integer entered by the user.
		} 
		
		else {
				System.out.println("Invalid number. Enter again: ");
				in.next();
			} //If the user did not enter a valid integer, the computer will have them reenter a valid integer.
			
		System.out.println(num + "!: " + factorial); //This has the computer print the factorial of the entered integer.

		
	    
	    
	    } //close the class and main method.
	}
