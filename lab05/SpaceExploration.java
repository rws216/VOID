//Robert W.Storer
//CSE2 - Lab 5
//Professor Chen
//Space Exploration Timeline Assignment
//February 20, 2015



public class SpaceExploration { //create a class
    public static void main(String[] args) { //define a main method
        
        int year = (int) (Math.random() * 11) + 2000; //Generates a random integer from 2000-2010 (inclusive)
        
        switch (year) { //Starts switch statement - the random integer genereted by the computer is used in the switch statement to choose which case to begin at.
            
           
            // The following lines (Line 18 - Line 28) define what I want the terminal to print for each case.
            //The random integers/cases generated represent years and the print statements that correspond to each
            //year display a historical event in space exploration.
            //There is no break until the end, which means that the computer will begin reading the switch statement
            //at the random year that was generated and print each year following the selected case.
            case 2010: System.out.println("In 2010, SpaceX sucessfully sends spacecraft to orbit and back.");
            case 2009: System.out.println("In: 2009: N/A");
            case 2008: System.out.println("In 2008: Kepler launched to study deep space.");
            case 2007: System.out.println("In 2007: N/A");
            case 2006: System.out.println("In 2006: Spacecraft returns with collections from a comet.");
            case 2005: System.out.println("In 2005: Spacecraft collies with comet.");
            case 2004: System.out.println("In 2004: N/A");
            case 2003: System.out.println("In 2003: Largest infrared telescope released.");
            case 2002: System.out.println("In 2002: N/A");
            case 2001: System.out.println("In 2001: First spacecraft lands on asteroid.");
            case 2000: System.out.println("In 2000: First spacecraft orbits an asteroid.");
            break; //This terminates the switch statement.
        }
       
        
    } //close main method 
} //close class