//Robert Storer
//CSE002 - Lab 03
//February 6, 2015
//Big Mac Cost Assignment

//The goal of this lab is to learn how to get input from the user and use that
//data to perform basic artithmetic calculations.

//Since we are using the Scanner class, we first need to import it. Then we
//can define a class and add a main method.
import java.util.Scanner;
    
    //The next step is to define a class. This program will be in the class
    //BigMac.
    public class BigMac {
    
    //Next, I'll add a main method.
    public static void main (String[] args) {
        
        //Now, the computer is ready to start reading my program.
        //I will declare an instance of the Scanner object. This is the same
        //process we have used to decalre inputs prior to this lab.
        Scanner myScanner;
        
        //Now, I will tell the computer that I am creating an instance that will
        //take input from STDIN.
        myScanner = new Scanner( System.in );
        //Now, I am ready to accept inout from the Scanner class.
        
            //Now, I will prompt the user for the number of tickets by printing
            //the following text:
            System.out.print("Enter the number of Big Macs (an integer > 0: ");
            //I didn't use the println command because I don't want the result
            //to begin a new line after that text above.
            
                //It's now time to accept user input using the following command:
                int nBigMacs = myScanner.nextInt();
                //The above comand calls a method (nextInt()) that only Scanner
                //objects have, which is why it is important to tell java that
                //we are looking for a method that is a part of the myScanner
                //object.
                
                //Next, we have to prompt the user for the cost per Big Mac and the percent sales tax
                //and accept the input.
                System.out.print("Enter the cost per Big Mac as" + "a double (in the form xx.xx): " );
                double BigMac$ = myScanner.nextDouble();
                System.out.print("Enter the percent tax as a whole number (xx): " );
                double taxRate = myScanner.nextDouble();
                taxRate/=100;
                
                    //Now, I have everything I need from the user. I am ready to
                    //print the output.
                    double cost$;
                    int dollars, dimes, pennies; //These are for the whole number
                                                //amount and both decimal spots.
                    cost$ = nBigMacs*BigMac$*(1+taxRate); //formula for computing total cost
                    dollars=(int)cost$;
                    dimes = (int)(cost$*10)%10; //This makes sure dimes will be placed in the first decimal spot.
                    pennies=(int)(cost$*100)%10; //This makes sure pennies will be placed in the second decimal spot.
                    
                    System.out.println("The total cost of" + nBigMacs + "Big Macs, at $" + BigMac$ + "per Big Mac, with a " + "sales tax of " + (int)(taxRate*100) + "%, is $" +dollars+"."+dimes+pennies);
                    //This line was very messy, but should do the job.
                    
//Close class and main method.        
    }
}