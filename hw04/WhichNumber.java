//Robert W. Storer
//CSE2 - Homework 4
//Professor Chen
//WhichNumber Assignment

//The goal of this assignment is to have the computer prompt the user to think of an integer between 1 and 10.
//The computer will ask the user a series of yes or no questions until it has deduced which integer the
//user is thinking of.

//This assignment will give us practice using selection statements, comparison operators, and Boolean expressions.

//First, import the Scanner class.
import java.util.Scanner;

//Next, define a class and add a main method.
public class WhichNumber {
    public static void main(String [] args) {
        
        
        //Now, I will have the computer prompt the user to think of an integer between 1 and 10.
        System.out.println("Please think of an integer between 1 and 10 (including 1 and 10). REMEMBER THIS NUMBER.");
        
        //Next, I'm going to initialize import inputs so that they can be used throughout the program.
        String yes = "Y";
        String no = "N";
        String valid;
       
            //Now, I will declare an instance of the scanner class so I can begin asking the user questions about his/her integer.
            Scanner myScanner;
            myScanner = new Scanner (System.in);
            
                //Next, I'll use if and else-if statements to ask the user specific questions, prompt them to respond yes or no, and move to each succeeding statement accordingly.
                //The first big block of statements is for when the user is thinking of an even number.
                System.out.println("Is your integer even?");
                    valid = myScanner.next();
                    if (valid.equals(yes)) { //Note: Comparison operator == to check if the values are the same. If single =, it would always be true.
                       
                        System.out.println("Is it divisble by 3?");
                        valid = myScanner.next();
                        if (valid.equals(yes)) {
                            System.out.println("Your integer is 6!");
                         return;
                        }
                        
                        else if (valid.equals(no)) { 
                            System.out.println("Is it divisible by 4?");
                        }
                            valid = myScanner.next();
                            if (valid.equals(yes)) {
                                System.out.println("Is the number divided by 4 greater than 1?");
                                valid = myScanner.next();
                                if (valid.equals(yes)) {
                                    System.out.println("Your number is 8!");
                                return;
                                }
                                
                                else if (valid.equals(no)) {
                                    System.out.println("Your number is 4!");
                                return;
                                }
                            }    
                            
                        else if (valid.equals(no)) {
                            System.out.println("Is it divisible by 5?");
                            valid = myScanner.next();
                            if (valid.equals(yes)) {
                                System.out.println("Your number is 10!");
                                return;
                                }
                            else if (valid.equals(no)) {
                                System.out.println("Your number is 2!");
                                return;
                                }
                            }  
                    
                    }
                    
                    
                    //This next big block of statements is for when the user is thinking of an odd number.
                    
                    if (valid.equals(no))  //Note: Comparison operator == to check if the values are the same. If single =, it would always be true.
                        System.out.println("Is it divisble by 3?");
                        valid = myScanner.next();
                        if (valid.equals(yes)) {
                            System.out.println("When divided by 3, is the result greater than 1?");
                        
                            valid = myScanner.next();
                            if (valid.equals(yes)) {
                                System.out.println("Your number is 9!");
                                return;
                            }
                            
                            else if (valid.equals(no)) {
                                System.out.println("Your number is 3!");
                                return;
                            }
                        
                        
                        valid = myScanner.next();
                        }
                        else if (valid.equals(no)) {
                            System.out.println("Is it greater than 6?");
                            valid = myScanner.next();
                            if (valid.equals(yes)) {
                                System.out.println("Your number is 7!");
                                return;
                            }
                           
                         
                        
                        else if (valid.equals(no)) {
                            System.out.println("Is it less than 3?");
                        }
                        }
                        
                        
                        
                            valid = myScanner.next();
                            if (valid.equals(yes)) {
                                System.out.println("Your number is 1!");
                                return;
                            }
                            if (valid.equals(no)) {
                                System.out.println("Your number is 5!");
                                return;
                           }
                        
// Close the class and main method.
    }
}