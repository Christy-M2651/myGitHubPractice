import java.util.Scanner;

/**
 * 
 */

/**
 * @author mateusaldi
 *
 */
public class myAppTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name, reverseInput;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to Software Engineering");
		System.out.println("What is your name?");
		
		name = input.nextLine();
		
		System.out.println();
		System.out.println("Hello, " + name);
		System.out.println("Do you want to see your name in reverse?" + "\n1 for yes, else for no");
		
		reverseInput = input.nextLine();
		
		if(reverseInput.equals("1")) {
			System.out.println();
			System.out.println("Name in reverse: ");
			strReverse(name);
		}
		
		input.close();
		
		System.out.println();
		System.out.println("\nYou reach the end of the program.\nGood bye, " + name + "!");
	}
	
	/**
	 * The strReverse method uses recursion to
	 * display a string backward.
	 * @param str The string to display backward.
	 */

	public static void strReverse(String str)
	{
		if (str.length() == 0)	// Reached the end of the string
		{
			return;
		}
		else
		{
			System.out.print(str.charAt(str.length()-1));
			strReverse(str.substring(0, str.length()-1));
		}
	}
}
