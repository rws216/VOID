//Robert W. Storer
//CSE 2 Lab 6
//March 20, 2015
//Professor Chen
//Smile Generator Assignment

public class SmileGenerator {
    public static void main (String [] args){
        
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////        
        //I did the while loop first
        System.out.println("Step One: While Loop");
        
        int numberFaces=1; //initializes the variable that is used to keep track of the number of faces that have been printed
        
        while (numberFaces<=5){ //starts a while loop that runs as long as numberFaces is less than or equal to 5. This means the loop will run five times, since numberFaces is initialized as 1
            
            System.out.print(":)"); //This is the face that will be printed each time the loop is executed
            numberFaces++; //This increments numberFaces so that it increases by one each time the loop is executed.
        }
        
        System.out.println(); //Starts a new line once the loop finishes running
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////        
        System.out.println("Step One: Do-While Loop"); //Next, I'll do the do-while loop
        
        numberFaces = 1; //initializes numberFaces variable
        
        do {
            System.out.print(":)"); //Prints out the smiley face before reading the condition.
            numberFaces++; //increments numberFaces so that the variable increases by one after each iteration
        }
        
        while (numberFaces<=5); //reads the condition. tells computer to print smiley faces five times.
        
        System.out.println(); //Starts new line once loop has finished running.
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("Step One: For Loop"); //Next, I'll do the for loop
        
        for (numberFaces=1; numberFaces<=5; numberFaces ++) { //combines the initial action, condition, and action after each iteration on one line
            System.out.print(":)"); //Prints a smiley face for each iteration
        }
        
        System.out.println(); //Starts new line
        
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
       
        //Begin Step Two
        System.out.println("Step Two"); 
        
        int numberSmileyFaces = (int)(Math.random()*101); //generates random number between 1 and 100
        int count = 1; //variable used to count the number of faces that have been printed
        
       System.out.println("number generated: " + numberSmileyFaces); //I had the computer print the random number generated so I could check if my loop worked correctly.
        
        
        //I am most comfortable with while loops, so I used one for this step.
        while (count <= numberSmileyFaces) { //Condition means that loop will run until the number of faces matches the random number generated
            System.out.print(":)"); //Prints a smiley face for each iteration
            count++; //increments the number of faces after each iteration
        }
       //all the faces will be printed on one line
       System.out.println(); //prints new line

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //Begin Step Three
    System.out.println("Step Three");
    
        int numberSmileyFaces2 = (int)(Math.random()*101); //generates random number between 1 and 100
        
        int count2 = 0; //variable used to count the number of faces that have been printed
        
        System.out.println("number generated: " + numberSmileyFaces2); //I printed the number generated to make sure my loop was running correctly.
        

        while (count2 < numberSmileyFaces2) { //Condition means that loop will run until the number of faces matches the random number generated
            
            System.out.print(":)"); //Prints a smiley face for each iteration
            
            count2++; //increments the number of faces after each iteration
        
                if (count2%30 == 0) {
                    System.out.println();
                } //this if statements prints a new line whenever the count reaches a number evenly divisible by 30 (eg 30, 60, 90)
        }
        
        System.out.println(); //prints a new line after the loop executes completely.
        
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  
  //Begin Step Four
  System.out.println("Step Four");
  
  //This part of the assignment was ambiguous. I created a program that generates a random number, and then prints
  //smiley faces on each line. On each line, the number of smileys printed increases by one. The last line has a number
  //of a smileys that matches the randomly generated number.
  
        int numberSmileyFaces3 = (int)(Math.random()*51); //generates random number between 1 and 50.
        String smileyFace = ":)"; //creates the string variable to print a smiley face
        int count3 = 0; //variable used to count the number of faces that have been printed
        
        System.out.println("number generated: " + numberSmileyFaces3); //I printed the number generated to make sure my program was running correctly
        
            while (count3<numberSmileyFaces3) { //runs until the count variable reaches the randomly generated number
                System.out.println(smileyFace); //prints the string variable :) and starts a new line after each iteration
                smileyFace += ":)"; //this line adds a smiley face to the smileyFace variable after each iteration
                count3++; //increments the count variable after each iteration so it doesn't fall into an infinite loop
            } 
        
        System.out.println();
        

    }
}