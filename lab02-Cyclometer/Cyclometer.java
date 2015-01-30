// Robert Storer
// CSE002 - Lab 2
//1/30/2015
//Cycolmeter Assignment

//The purpose of this lab is to write a program that prints data about the 
//professor's cycling trips.
//The data measured will be elapsed time (seconds) and wheel rotation count
//(distance).
//This program should be able to print the number of minutes for two cycling trips
//, the number of rotation counts for each trip, the distance (in miles) of each
//trip, and the combined distance of the two trips.

//First, add a class and a main method.
//The main method tells the computer to start reading commands at this time.
public class Cyclometer {
    public static void main(String[] args) {
        
     //Now, I need to create variables to represent the number of seconds for
     //each trip and the distance (wheel rotation count) for each trip.
     //It is important to follow these steps when creating variables:
     //declare, assign, access
     
     int secsTrip1=480; //This declares and assigns an integer value for the # of seconds for trip 1.
     int secsTrip2=3220; //Same as line above, but for trip 2.
     int countsTrip1=1561; //This declares and assigns an integer value for the distance for trip 1.
     int countsTrip2=9037; //Same as line above, but for trip 2.
     
     //Before accessing these variables, I need to declare and assign intermediate variables/constants to
     //help convert our initial variables into useful values.
     
     double wheelDiameter=27.0, //double command with commas set the following variables to double
     PI=3.14159, 
     feetPerMile=5280,
     inchesPerFoot=12, //This line and the three above it help convert # rotations to linear distance values
     secondsPerMinute=60; //use semi colon to end list of variables of same type
     double distanceTrip1, distanceTrip2, totalDistance;
     
        //Now, I am going to print out the numbers I stored in variables above.
        //I will use a combination of text and the variables to have the computer print a report
        //of each trip in a coherent and readable way.
        //Here, I am going to print the minutes for each trip and the number of counts.
        System.out.println("Trip 1 took " + (secsTrip1/secondsPerMinute) + " minutes and had " + 
            countsTrip1 + " counts.");
        System.out.println("Trip 2 took " + (secsTrip2/secondsPerMinute) + " minutes and had " + 
            countsTrip2 + " counts.");
            
            //Next, I'm going to convert the counts into linear distances.
            distanceTrip1=countsTrip1*wheelDiameter*PI;
            //The above converts the Trip 1 rotation count into inches. The formula should be
            //recognizable to anyone who has had basic physics or calculus.
            
            //Now, I'll take the distance from inches to miles.
            distanceTrip1/=inchesPerFoot*feetPerMile;
            //This divides the previous designation for distanceTrip1 by the intermediate variables
            //inchesPerFoot and feetPerMile to get the distance in miles.
            
            //Now, I'll do the same thing for distanceTrip2
            distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
            
            //Now, write equation for total distance (trip 1 + trip 2)
            totalDistance=distanceTrip1+distanceTrip2;
            
                //Next, I'll print out the distances in miles.
                System.out.println("Trip 1 was " + distanceTrip1 + " miles.");
                System.out.println("Trip 2 was " + distanceTrip2 + " miles.");
                System.out.println("The total distance was " + totalDistance + " miles.");
        
        //never forget to close the class and main method
        
        
    }
        }