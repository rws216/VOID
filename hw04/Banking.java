//Robert W. Storer
//CSE2 - Homework 4
//Professor Chen
//Banking Assignment

//The goal of this assignment is to have the computer act as an ATM to a user.

//This assignment will give us practice using selection statements particularly the switch statement, comparison operators, and Boolean expressions.


import java.util.Scanner; //This imports the Scanner class.

//Next, define a class and add the main method.
public class Banking {
    public static void main(String[] args) {
        
        //Now, I'll initialize some importnat integers so they can be used throughout the program.
        int userDecision;
        double deposit;
        double withdrawal;
     
        
        double accountBalance = (double)(Math.random() * 5000) + 1000; //This generates a random account balance for the user between $1000 and $5000.
        
        Scanner myScanner = new Scanner (System.in); //Declare an instance of the scanner class.
        
        //The following four lines will explain to the user his/her options and will prompt them to enter either 1,2,or 3 depending on which option they desire.
        System.out.printf("Please choose what you would like to do with your account. \n");
        System.out.printf("To make a deposit, enter the number 1. \n");
        System.out.printf("To withdraw cash, enter the number 2. \n");
        System.out.printf("To view your balance, enter the number 3. \n");
        
        if (myScanner.hasNextInt()) { //This if statement makes sure the scanner has any integer.
            userDecision = myScanner.nextInt();
            if (userDecision == 1 || userDecision ==2 || userDecision == 3) { //This tells the computer what to do if the user enters either a 1, 2, or 3.
        
        switch (userDecision) { //The following switch statement defines what the computer needs to print depending on which of the three options the user chooses.
            case 1: System.out.printf("How much are you depositing? \n");
                    System.out.printf("Please be sure to enter a positive value. \n");
                    if (myScanner.hasNextDouble()) {
                        deposit = myScanner.nextDouble();
                            if (deposit>=0) {
                                System.out.printf("Your deposit of $" + deposit + " was accepted. \n");
                                accountBalance += deposit; //This reassigns the value of account balance to include the new deposit.
                                System.out.printf("Your account balance is now $" + "%.2f \n", accountBalance);
                    }
                            else {
                                System.out.printf("Please rerun the program and enter a positive value. \n"); //If the user selected make a deposit and entered a negative value.
                            }    
                            }
                    break;
                    
            
            
            case 2: System.out.printf("How much cash would you like to withdraw? \n");
                    System.out.printf("Please be sure to enter a positive value that is less than the current amount in your account. \n");
                    if (myScanner.hasNextDouble()) {
                        withdrawal = myScanner.nextDouble();
                            if (withdrawal>=0 && withdrawal<=accountBalance) { //This determines whether or not the user is withdrawing both a positive amount and an amount less than his/her current balance.
                                System.out.printf("Your withdrawal of $" + withdrawal + " was accepted. \n");
                                accountBalance -= withdrawal; //This reassigns the account balance taken into consideration the amount withdrawn by the user.
                                System.out.printf("Your account balance is now $" + "%.2f \n", accountBalance);
                    }
                            else if (withdrawal>=0 && withdrawal>= accountBalance) { //This is for if the user enter a positive number that exceeds his/her current balance.
                                System.out.printf("Please rerun the program and enter a value lower than amount currently in your account. \n");
                            }
                            else { //This is for when the user enters a negative value.
                                System.out.println("Please rerun the program and enter a positive value. \n"); 
                            }
                    }
                    break;
                    
            
            case 3: System.out.printf("Your current account balance is: $" + "%.2f \n", accountBalance); //This prints the user's balance as it was when the code from line 23 randomly generated a balance.
        }
            }
         else {
            System.out.printf("Please enter either 1,2, or 3. \n"); //This message appears if the user did not enter either a 1,2, or 3 when prompted to choose one of the three options.
        }
        } //I made sure that all open brackets were closed on the line corresponding to their opening bracket.
        
        
//Close the class and main method.
    }
}