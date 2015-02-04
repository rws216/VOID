//////////////////////////////////////////////////////////////////////////////
//Robert W. Storer
//CSE 002 - Homework Assignment 2
//Artihmetic Operations
//February 3, 2015
//////////////////////////////////////////////////////////////////////////////
//The goal of this assignment is to practice variable declaration, assignment
// and access and to have the computer compute and print different costs
// related to a shopping trip to Wal-mart. We were given data about the
//items purchased and PA sales tax. From here we can have the computer compute
//the results we need.
//////////////////////////////////////////////////////////////////////////////
//First, I'll define the class specified in the assignment.
public class Arithmetic {
    
    //Next, I'll add the main method. This must always happen after defining a class.
    public static void main (String[] args) {
        
        //Now, I can declare and assign the input variables. It is important to
        //do this in the correct order, as the computer reads code line by line
        //moving down.
        int nSocks = 3; //This is the number of pairs of socks I purchased.
        int nGlasses = 6; //This is the number of glasses I purchased.
        int nEnvelopes = 1; //This is the number of glasses I purchased.
        
        double SockCost = 2.58; //This is the cost per pair of sock (pre-tax).
        double GlassesCost = 2.29; //This is the cost per glass (pre-tax).
        double EnvelopeCost = 3.25; //This is the cost per box of envs. (pre-tax).
        
            //Now, I'll do the total pretax cost of the shopping trip.
            double TotalCost_pretax = (nSocks*SockCost)+(nGlasses*GlassesCost)+(nEnvelopes*EnvelopeCost); 
            
        
                 //Now, I will declare and assign the PA tax variable.
                 double PAtax = 0.06; //This is the PA tax rate.
                
                    //Now, I will declare and assign the output values.
                    //I'll start with the pretax costs for each item.
                    double pretaxSocksCost = nSocks*SockCost;
                    double pretaxGlassesCost = nGlasses*GlassesCost;
                    double pretaxEnvelopesCost = nEnvelopes*EnvelopeCost;
                    //Now, I'll do the sales tax for each item.
                    double TaxSocks = pretaxSocksCost*PAtax;
                    double TaxGlasses = pretaxGlassesCost*PAtax;
                    double TaxEnvelopes = pretaxEnvelopesCost*PAtax;
                    double TotalTax = TaxSocks+TaxGlasses+TaxEnvelopes;
                    
                        //The last output variable is the final after-tax cost.
                        double TotalCost_aftertax = TotalCost_pretax+(TotalCost_pretax*PAtax);
                        
                            //Now, have the computer print the name of each item,
                            //the number of each item purchased, and the cost per
                            //unit of each item.
                            System.out.printf("Socks\n");
                            System.out.printf(nSocks + "\n");
                            System.out.printf("$ %.2f\n", SockCost);
                            System.out.printf("          \n");
                            System.out.printf("Glasses\n");
                            System.out.printf(nGlasses + "\n");
                            System.out.printf("$ %.2f\n", GlassesCost);
                            System.out.printf("              \n");
                            System.out.printf("Boxes of Envelopes\n");
                            System.out.printf(nEnvelopes + "\n");
                            System.out.printf("$ %.2f\n", EnvelopeCost);
                            System.out.printf("            \n");
                            //The items are purposivley separated by a blank line.
                                
                                //Next, I am going to compute and print the output variables/
                                System.out.printf("Cost of Socks (pretax) $ %.2f\n", pretaxSocksCost);
                                System.out.printf("Cost of Glasses (pretax) $ %.2f\n", pretaxGlassesCost);
                                System.out.printf("Cost of Envelopes (pretax) $ %.2f\n", pretaxEnvelopesCost);
                                //The above three lines are the pretax costs for each item.
                                System.out.printf("Socks Sales Tax $ %.2f\n", TaxSocks);
                                System.out.printf("Glasses Sales Tax $ %.2f\n", TaxGlasses);
                                System.out.printf("Envelopes Sales Tax $ %.2f\n", TaxEnvelopes);
                                //The above three lines are the sales tax for each item.
                                System.out.printf("Total Trip Cost (pretax) $ %.2f\n", TotalCost_pretax);
                                System.out.printf("Total Sales Tax $ %.2f\n", TotalTax);
                                System.out.printf("Total Trip Cost (aftertax) $ %.2f\n", TotalCost_aftertax);
                                
                                //Note: I used printf because I was searching online for an easier
                                //way to have it print at most two decimal places and found the
                                //%.2f command.
                                
                                //Note: I include the text to clairfy what each value represents
                                
//Don't forget to close the class and main method.
            
    }
    
}

