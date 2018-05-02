//jiao xu 5/2/2018

import java.util.Scanner;

public class Validator {
	public static String getString(Scanner sc, String prompt) {
		System.out.println(prompt);
		String s = sc.next(); // read user entry
		sc.nextLine(); // discard any other data entered on the line

		return s;
	}

	public static int getInts(Scanner sc, String prompt) {
		int i = 0;
		boolean isValid = false;
		while (isValid == false) {
			System.out.print(prompt);
			if (sc.hasNextInt()) {
				i = sc.nextInt();
				isValid = true;
			} else {
				System.out.println("Error! Invalid integer value. Try again.\n");
			}
			sc.nextLine(); // discard any other data entered on the line
		}
		return i;
	}

	public static int getInt(Scanner sc, String prompt, int min, int max) {
		int i = 0;
		boolean isValid = false;
		while (isValid == false) {
			i = getInts(sc, prompt);
			
			i = i-1;//number of the student should be index + 1
			if ((i < min) || (i >=max)) {
				System.out.println("That student does not exist. Please try again.\n");
			}

			else
				isValid = true;
		}
		
		return i;
	}

}