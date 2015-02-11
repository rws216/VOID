//Robert W. Storer
//February 10, 2015
//CSE002 - HW3
//Professor Chen
//Four Digits Assignment

//Just like the Bicycle and Root assignments, the goal of this lab is to practice writing program that allows a user to input data.
//It is also giving me practice using arithmetic in java.

//First, I'll import the Scanner class.
import java.util.Scanner;

//Now, I can define a class and add a main method.
public class FourDigits {
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner (System.in); //This declares and constructs an instance of the scanner class/
        
        System.out.println("Enter a value of type double. I will print the first four digits to the right of the decimal point.");
        double x = myScanner.nextDouble(); //This will have the computer read the value from STDIN and will store it in "x".
        
        
        int a = (int) (x*10)%10; //This command explicitly casts x from a double to an int and the % (mod) command is used to have a represent the number in the "tenth" spot of the user inputed number.
        int b = (int) (x*100)%10; //This line and the the two below it do the same as the above line, but for the hundreth, thousandth, and ten thousandth spot of the user inputed number.
        int c = (int) (x*1000)%10;
        int d = (int) (x*10000)%10;
        
        System.out.println("The four digits to the right of the decimal are " + a + b + c + d); //this prints the written text and displays the values for a,b,c, and d.
        
    }
}