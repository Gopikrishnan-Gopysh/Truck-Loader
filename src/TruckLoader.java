import java.util.Scanner;

public class TruckLoader {

		public static void main(String[] args) {

			Scanner scan = new Scanner(System.in);

	//Declaring the arrays and the variables required

			String[] names;
			String[] weight;
			boolean[] danger;
			int records;
			String yesOrNo;
			String custN;
			String userOptions;
			boolean loop = true;

			System.out.println("Welcome to Truck Loader");
	//gets the users input for the number of records
			System.out.println("What is the maximum number of boxes that can fit inside the truck?");
			records = scan.nextInt();
			System.out.println();
	//Assigning array lengths based on user's input
			names = new String[records];
			weight = new String[records];
			danger = new boolean[records];
			
	//User inputs required data
			for (int i = 1; i <= records; i++) {

				System.out.println("Please enter the customer name for box " + i + ":");
				names[i - 1] = scan.next();
				System.out.println("Please enter the weight(kg) for box " + i + ":");
				weight[i - 1] = scan.next();
				System.out.println("Does box " +i+ " contain dangerous goods (y/n):?");
				yesOrNo = scan.next();

				if (yesOrNo.equalsIgnoreCase("y"))
					danger[i - 1] = true; 
				else
					danger[i - 1] = false;
				System.out.println();

			}
			System.out.println("All the information regarding the boxes has been entered." );

	//Looping the database options using while condition and using switch case to choose between options
			while (loop) {

				System.out.println("List (a)ll boxes information, search boxes by (c)ustomer name or (d)angerous cargo, or (q)uit?");
				userOptions = scan.next();
				System.out.println();

				switch (userOptions) {
				case "a":
					System.out.println("Here is the list of all the boxes:");
					for (int i = 0; i < records; i++)
						//Ternary operator/ Inline If= (?+;)
						System.out.println("Box " + (i+1) + " Customer name: " + names[i] + " Weight(kg): " + weight[i] +" " + (danger[i]? "Dangerous Goods": "Non Dangerous Goods"));
					System.out.println();
					break;

				case "c":
					System.out.println("What is the customer's name? ");
					custN = scan.next();
					
					for (int i = 0; i < records; i++)
						System.out.println("Box " + (i+1) + " Customer name: " + names[i] + " Weight(kg): " + weight[i] +" " + (danger[i]? "Dangerous Goods": "Non Dangerous Goods"));
					System.out.println();

					break;

				case "d":
					System.out.println("Search for(d)angerous or (n)on-dangerous?");
					userOptions = scan.next();
					System.out.println();

					switch (userOptions) {
						case "d":
							for (int i = 0; i < records; i++)
								System.out.println("Box "  + " Customer name: " + names+ " Weight(kg): " + weight +" " + (danger) != null? "Dangerous Goods": "Non Dangerous Goods");
							System.out.println();
						break;
						
						case "n":
							System.out.println("Here is the list of all the boxes:");
							for (int i = 0; i < records; i++)
								System.out.println("Box " + i + " Customer name: " + names[i] + " Weight(kg): " + weight[i] +" " + (danger[i]? "Dangerous Goods": "Non Dangerous Goods"));
							System.out.println();
						break;
					}
					break;

				case "q":
					System.out.println("Thank you for using the Truck Loader.");
					loop = false;
					break;

				}

			}

			scan.close();

		}
	}