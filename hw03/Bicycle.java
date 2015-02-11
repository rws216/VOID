//Robert Storer
//February 10, 2015
//CSE002 - HW03
//Professor Chen
//Bicycle Assignment

//The goal of this assignment is to practice writing code that allows a user to input data.

//since we are using the scanner class, i need to import it before I define a class
import java.util.Scanner;

//Now, I can define a class
public class Bicycle {
    
    //Now, I'll add a main method
    public static void main (String [] args) {
        
        Scanner myScanner = new Scanner (System.in); //This uses the keyboard as the input source.
       
        System.out.printf("Enter the number of cyclometer counts: "); //This prints texts that tells the user what value to type in.
        int cyclometerCounts = myScanner.nextInt(); //This declares cyclometer counts and assigns this value of the next integer in the scanner class.
        System.out.printf("Enter the number of seconds spent cycling: "); //This prompts the user to enter the time spent cycling on his or her trip.
        int seconds = myScanner.nextInt(); //This declares seconds and assigns this value of the next integer in the scanner class.
   
        double wheelDiameter = 27.0, //This defines and assigns the variable for the user's bicycle wheel diameter.
        //The next lines define and assign variables necessary to compute the final values we want the user to have (distance in miles, time in minutes, and miles per hour). 
        PI=3.14159,
        feetPerMile = 5280,
        inchesPerFoot = 12,
        secondsPerMinute = 60,
        minutesPerHour = 60;
        
        double distance = (wheelDiameter*PI*cyclometerCounts/feetPerMile/inchesPerFoot); //This variable gives us the trip distance in miles.
        double minutes = (seconds/secondsPerMinute); //This variable gives us the total trip time in minutes.
        double hours = (seconds/secondsPerMinute/minutesPerHour); //This variable gives us the total trip time in hours (we will use this to find mph).
        double milesPerHour = (distance/hours); //This variable gives us the average mph of the suer's trip.
        
        System.out.printf("The trip distance was %.2f", distance);
        System.out.printf(" miles.\n");
        System.out.printf("The trip took %.2f", minutes);
        System.out.printf(" minutes.\n");
        System.out.printf("Your average speed was %.2f", milesPerHour);
        System.out.printf(" MPH.\n");
        //The above statments have the computer print the final results of the user's trip.
        //The %.2f command only prints each value to two decimal places.
    }
}