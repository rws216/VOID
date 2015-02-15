//Robert W. Storer
//CSE002 Lab 4
//February 13, 2015
//Professor Chen
//Cookies Assignment

//The goal of this lab is to utilize the scanner class to allow a user to know whether or not he has purchased enough cookies for a social event for every guest to get a certain amount.

//First, import the scanner class.
import java.util.Scanner;
    
    //Define a class
    public class Cookies {
        
        //Add main method
        public static void main (String [] args) {
            
            Scanner myScanner = new Scanner (System.in); //This declares an instance of the scanner class and calls the scanner constructor.
            
            //The following four lines initialize import variables so that they can be used throghout the entire program within the Cookies class
            int numberPeople = 0;
            int numberCookies = 0;
            int cookiesPerPerson = 0;
            double calcCookiesPerPerson = 0; //This is the calculated number of cookies per guest. It is a double because this value will not neccessarily be an integer depending upon the user's inputs.
            
            
            //Now, I'm ready to accept input.
            System.out.printf("Enter the number of people attending the event: "); //This prompts the user to enter the expected attendance at the event.
            
                //Next, I will write an if statement that will check if the scanner has a positive integer. If the user did not enter a positive integer, the computer will prompt him/her to rerun the program and enter a new value.
                if (myScanner.hasNextInt()) {
                    
                    numberPeople = myScanner.nextInt(); //This tells computer to display the inputed value.
                    
                    if (numberPeople <= 0) {
                        System.out.printf("Rerun the program and enter a positive value. \n");
                        return; //The above nested if statement tells the computer to prompt the user to rerun the program and enter a positive value if he did not and then terminates the program.
                    }
                 }
                 
                else { 
                    
                    System.out.printf("Please rerun the program and enter a positive integer value. \n"); //This prompts the user to enter a integer if the value they previously entered was not an integer.
                    
                    return;    }
                    
                    
            
            
            
            
            
                 System.out.printf("Enter the number of cookies you purchased: "); //This prompts the user to enter the number of cookies he or she bought.
            
                //Next, I will write an if statement that will check if the scanner has a positive integer. If the user did not enter a positive integer, the computer will prompt him/her to rerun the program and enter a new value.
                if (myScanner.hasNextInt()) {
                    
                    numberCookies = myScanner.nextInt() ; //This tells computer to display the inputed value if it is an integer.
                    
                    if (numberCookies <= 0) {
                        System.out.printf("Rerun the program and enter a positive value: \n");
                        return; //The above three lines prompt the user to rerun the program and enter a positive value if he had not entered a positive value.
                    }
                 }
                 
                else { 
                    
                    System.out.printf("Please rerun the program and enter a positive integer value. \n"); //This prompts the user to enter a positive integer if the value they previously entered was not an integer.
                    
                    return;    }     
                    
                    
                    
                    
                    
                    
                    
                System.out.printf("Enter the number of cookies you would like each person to have: "); //This prompts the user to enter the number of cookies he would like each guest to have.
                
                
                //The following if-else statement will check if the user has enough cookies to give everyone the desired number of cookies per person and whether or not the number of cookies will divided evenly into the number of people.
               if ( myScanner.hasNextInt() ) { //checks if the scanner has an integer.
                   cookiesPerPerson = myScanner.nextInt();
                   
                        calcCookiesPerPerson = numberCookies/numberPeople; //This assigns a value to calcCookiesPerPerson.
                  
                        if ( (double) cookiesPerPerson <= calcCookiesPerPerson ) { //This nested if casts cookiesPerPerson to a double so that it can be compared to the calcCookiesPerPerson
                            if ( numberCookies % numberPeople == 0 ) {
                                System.out.printf("You have enough cookies and they are evenly divided amongst your guests. \n");
                                //The above three lines make up a nested if that checks if the user has enough cookies AND if they are evenly divided.
                            }
                            else {
                                 System.out.printf("You have enough cookies but they are not evenly divided amongst your guests. \n");
                            } //This else means that the user does have enough cookies but that they are not even divided.
                        }
                        
                   else {
                       System.out.printf("You do not have enough cookies. \n"); //This else statement means the user did not purchase enough cookies.
                   
                   }
                   
                   return; //This terminates the program.
               }
        
    
//Close the class and main method.                                    
        }
    }