
//programmed by Jiao Xu   5/2/2018

import java.util.Scanner;

public class LabNumber8 {
	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

		// student information array
		String[] studentName = { "Kim", "Jill", "Tim", "John", "Micheal", "Antonella", "Vicky", "Ben", "Alli",
				"Anthony", "Brent", "Jonah" };
		String[] homeTown = { "Detroit", "Toledo", "New York", "Seatle", "LA", "Boston", "Atlanta", "Key West",
				"Chicago", "Toronto", "Nashiville", "New Orleans" };
		String[] favFood = { "Fries", "Apple", "Banana", "Pear", "Peach", "Pizza", "Noodle", "Chips", "Mango", "Rice",
				"Tomato", "Steak" };

		String cont = "yes";

		System.out.print("welcome to our Java Class. ");
		while (cont.equalsIgnoreCase("yes")) {

			// prompt user for a number and validate the input number
			int stuNum = Validator2.getInt(scnr,
					"Which student would you like to learn more about? (enter a number 1-12): ", 0, 12);

			// prompt user to enter more
			System.out.print("Student " + (stuNum + 1) + " is " + studentName[stuNum]
					+ ". What would you like to know about " + studentName[stuNum] + "?");
		//	boolean flag = true;
			//while (flag) {
				// pull the getString method to validate the information
				String choice = Validator2.getString(scnr, (" (enter or \"hometown\" or \"favorite food\"):"));

				try {
					// if entered is "hometown"
					if (choice.equalsIgnoreCase("hometown")) {

						String test = Validator2.getString(scnr, studentName[stuNum] + " is from " + homeTown[stuNum]
								+ ". would you like to know more? (enter \"yes\" or \"no\")");

						if (!test.equalsIgnoreCase("yes")) {
							break;
						}

						// if entered is "favorite food"
					} else if (choice.equalsIgnoreCase("favorite")) {

						String food = Validator2.getString(scnr, studentName[stuNum] + "'s favorite food is "
								+ favFood[stuNum] + ". would you like to know more?( enter\"yes\" or \"no\"):");
						if (!food.equalsIgnoreCase("yes")) {
							break;
						}

						//flag = false;
					} else {// enter other input
						System.out.println("Something hit this");

						throw new IllegalArgumentException("That data does not exist. Please try again");
					}
				} catch (IllegalArgumentException excpt) {
					System.out.print(excpt.getMessage());
					continue;
				}
			//}

		}
		System.out.println("Thanks!");

		scnr.close();
	}

}
