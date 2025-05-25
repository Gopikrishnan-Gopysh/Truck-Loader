import java.util.InputMismatchException;
import java.util.Scanner;

public class TruckLoader {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Declaring the required arrays
        String yesOrNo;
        String searchNameOfCustomer;
        String searchToken;
        String[] nameOfCustomers;
        String[] weightOfBoxes;
        int boxNumber = 0;
        boolean[] dangerousItemInBoxes;
        boolean keepRunning = true;

        System.out.println("Welcome to Truck Loader");

        //Gets number of records
        System.out.println("What is the maximum number of boxes that can fit inside the truck?");
        
        
        for (int i = 0; i < 3; i++) {
        	boxNumber = 0;
			try {
				boxNumber = scan.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Box count should be numeric! Try again");
			} 
		}
        
        if(boxNumber == 0) {
        	System.out.println("Max tries exceeded. Please re-run the entire program");
        	scan.close();
        	return;
        }
        
		System.out.println();

        //Assigning array lengths based on user's input
        //new means instantiate an object variable. instantiate is not possible for primitive vars
        nameOfCustomers = new String[boxNumber];
        weightOfBoxes = new String[boxNumber];
        dangerousItemInBoxes = new boolean[boxNumber];

        //Gets the required data
        //++ is a unary operator
        for (int i = 0; i < boxNumber; i++) {

            System.out.println("Please enter the customer name for box " + (i+1) + ":");
            nameOfCustomers[i] = scan.next();
            
            System.out.println("Please enter the weight(kg) for box " + (i+1) + ":");
            weightOfBoxes[i] = scan.next();
            
            System.out.println("Does box " + (i+1) + " contain dangerous goods (y/n):?");
            yesOrNo = scan.next();
            
            //using if condition to assign value to dangerousness of box
            dangerousItemInBoxes[i] = yesOrNo.equalsIgnoreCase("y");

            System.out.println();
        }
        
        System.out.println("All the information regarding the boxes has been entered.");

        //Looping using 'while condition'
        //Using 'switch case' to switch code pathway
        while (keepRunning) {

            System.out.println("List (a)ll boxes information, search boxes by (c)ustomer name or (d)angerous cargo, or (q)uit?");
            searchToken = scan.next();
            System.out.println();

            switch(searchToken) {
                //output of the all the data 
                case "a":
                    System.out.println("Here is the list of all the boxes:");
 
                    for (int i = 0; i < boxNumber; i++) {
                        //(?:) = Ternary operator/ In-line If 
                        System.out.println("Box " + (i+1) + " Customer name: " + nameOfCustomers[i] + " Weight(kg): " + weightOfBoxes[i] + " " + (dangerousItemInBoxes[i] ? "Dangerous Goods" : "Non Dangerous Goods"));
                    }
                    System.out.println();

                    break;

                    //output of the data based on customer name
                case "c":
                    System.out.println("What is the customer's name? ");
                    searchNameOfCustomer = scan.next();
                    boolean nfound = false;
                    for (int i = 0; i < boxNumber; i++) {
                        if (nameOfCustomers[i].equalsIgnoreCase(searchNameOfCustomer)) {
                            System.out.println("Box " + (i+1) + " Customer name: " + nameOfCustomers[i] + " Weight(kg): " + weightOfBoxes[i] + " " + (dangerousItemInBoxes[i] ? "Dangerous Goods" : "Non Dangerous Goods"));
                            nfound = true;
                        }
                    }
                    
                    if(!nfound) {
                        System.out.println(searchNameOfCustomer + "not found");
                    }
                    
                    System.out.println();

                    break;

                    //output of the data based on contents of the box	
                case "d":
                    System.out.println("Search for(d)angerous or (n)on-dangerous?");
                    searchToken = scan.next();
                    System.out.println();
                    
                    boolean dfound = false;
                    for (int i = 0; i < boxNumber; i++){
                    	//&& is a unary operator
                        if (dangerousItemInBoxes[i] && searchToken.equalsIgnoreCase("d")) {
                            System.out.println("Box " + (i + 1) + " Customer name: " + nameOfCustomers[i] + " Weight(kg): " + weightOfBoxes[i] + " " + (dangerousItemInBoxes[i] ? "Dangerous Goods" : "Non Dangerous Goods"));
                            dfound = true;
                        }
                   
                        //! is a unary operator
                        if (!dangerousItemInBoxes[i] && searchToken.equalsIgnoreCase("n")) {
                            System.out.println("Box " + (i + 1) + " Customer name: " + nameOfCustomers[i] + " Weight(kg): " + weightOfBoxes[i] + " " + (dangerousItemInBoxes[i] ? "Dangerous Goods" : "Non Dangerous Goods"));
                            dfound = true;
                        }
                        
                    }
                    
                    if(!dfound) {
                    	System.out.println("No " + (searchToken.equalsIgnoreCase("d")? "dangerous " : "non-dangerous ") + "items found");	
                    }

                    System.out.println();

                    break;

                case "q":
                    //quit statement
                 System.out.println("Thank you for using the Truck Loader.");
                    keepRunning = false;
                    break;

            }

        }

        scan.close();

    }
}
