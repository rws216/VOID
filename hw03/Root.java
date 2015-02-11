//Robert W. Storer
//February 10, 2015
//CSE002 HW3
//Professor Chen
//Root Assignment

//The goal of this assignment is to practice writing code that allows a user to input data.
//I am also learning about using arithmetic in java (specifically using the Math.pow() command).

//Since I am using the scanner class, I must import it before I define a class and add a main method.
import java.util.Scanner;

//Now, I can define a class and add a main method.
public class Root {
    public static void main (String [] args) {
        
        Scanner myScanner = new Scanner (System.in); //This declared an instance of the class and constructed the instance.
        
        System.out.println("Enter a value whose cube root you would like to know."); //This prompts the user to enter the number they would like to know the cube root of.
        double x = myScanner.nextInt(); //I am allowing the number the user guesses to be a double rather than just an integer.
        
        double guess1 = (x/3); //This is the initial guess for the number's cube root. It will most likely be very inaccurate.
        double guess2 = (2*guess1*guess1*guess1+x)/(3*guess1*guess1);
        double guess3 = (2*guess2*guess2*guess2+x)/(3*guess2*guess2);
        double guess4 = (2*guess3*guess3*guess3+x)/(3*guess3*guess3);
        double guess5 = (2*guess4*guess4*guess4+x)/(3*guess4*guess4);
        double guess6 = (2*guess5*guess5*guess5+x)/(3*guess5*guess5);
        //guess 2-6 each improve the accuracy of the previous guess. The result should be a pretty accurate value for the user inputed number's cube root.
        double guess6Cubed = Math.pow(guess6, 3);
        //This declares and assigns the variable that will take the result of guess6 and cube it to see how accurate our guess was.
        System.out.println("The computer's estimate for the cube root is " + guess6); //This tells the computer to print the written text and display the variable guess6 (our most accurate crude guess for square root).
        System.out.println("The computer's estimate cubed is " + guess6Cubed); //This tells the computer to print the written text and to display the value of guess6 cubed.
        
        
        //It is important to note that the guess is only accurate for relatively low numbers. The more you increase the number, the less accurate the result from the computer will be.
        
    }
}