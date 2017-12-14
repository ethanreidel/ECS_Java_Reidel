import java.util.Random;
import java.util.Scanner;

public class KeepGuessing
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		int x = 1 + r.nextInt(100);
		
		
		int guess, answer;
		
		answer = r.nextInt(10);
		
		
		System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
		System.out.println("Your guess:");
		guess = keyboard.nextInt();
		
		while ( guess != answer )
		{
			System.out.println("That is incorrect. Guess again.");
			System.out.println("Your guess:");
			guess = keyboard.nextInt();
			
		}
		if ( guess == answer )
		{
			System.out.println("That's right! You're a good guesser.");
		}
		
		
		
		
		
		
		
		
		
	}
}