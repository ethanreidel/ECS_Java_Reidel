import java.util.Random;
import java.util.Scanner;

public class HiLow
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		int x = 1 + r.nextInt(100);
		
		System.out.print( 1 + r.nextInt(100) + "\t");
		
		int guess, answer;
		
		int num1 = 1 + r.nextInt(10);
		int num2 = 1 + r.nextInt(10);
		
		
		answer = r.nextInt(100);
		
		
		
		System.out.println("I'm thinking of a number between 1-100. Try to guess it.");
		System.out.print( 1 + r.nextInt(100) + "\t");
		guess = keyboard.nextInt();
		
		if ( guess > answer )
		{
			System.out.println("Sorry, that is too high. I was thinking of " + answer );
		}
		else if ( guess < answer )
		{
			System.out.println("Sorry, you are too low. I was thinking of " + answer);
		}
		if ( guess == answer )
		{
			System.out.println("You guessed it! What are the odds?!?");
		}
	}
}