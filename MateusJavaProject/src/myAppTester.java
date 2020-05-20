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
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to Software Engineering");
		System.out.println("What is your name?");
		
		String name = input.nextLine();
		
		System.out.println();
		System.out.println("Hello, " + name);
		System.out.println("Do you want to see your name in reverse?" + "\n1 for yes, else for no");
		
		String reverseInput = input.nextLine();
		
		if(reverseInput.equals("1")) {
			System.out.println();
			System.out.println("Name in reverse: ");
			strReverse(name);
		}
		
		input.close();
		
		System.out.println();
		System.out.println("\nYou reach the end of the program.\nGood bye, " + name + "!");
		
		/*
		 * Git now is on branch b1
		 * from now on until switching out branch b1
		 * any changes occur here will be tacked in branch b1
		 * and will not be reflected in any other branch unless b1
		 * is merged later with that branch
		 */
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
