import java.util.Random;
import java.util.Scanner;

public class CollatzSequence
{


public static void main(String[] args)
	{
	
		Random randomNumber = new Random();
		Scanner kbd = new Scanner(System.in);
		int computerValue = randomNumber.nextInt(100);
		int n;
		
		System.out.println("Let's create a COLLATZ SEQUENCE!");
		System.out.println("Rules:");
		System.out.println("If the number is even, divide it by two.");
		System.out.println("If the number is odd, multiply it by 3 and add 1.");
		System.out.println("Repeat this decision until you reach 1.");
		System.out.println("Starting number: " + computerValue );
		
		
	}

}