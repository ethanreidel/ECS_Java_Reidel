import java.util.Random;
import java.util.Scanner;

public class HiLowLimited
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
		//xd this is useless
		
		
		System.out.println("I'm thinking of a number between 1-100. Try to guess it.");
		System.out.print( 1 + r.nextInt(100) + "\t");
		
		System.out.println("First Guess:");
		guess = keyboard.nextInt();
		
		if ( guess > answer )
		{
			System.out.println("Sorry, that is too high.");
		}
		else if ( guess < answer )
		{
			System.out.println("Sorry, you are too low. ");
		}
		if ( guess == answer )
		{
			System.out.println("You guessed it! What are the odds?!?");
		}
		System.out.println("Guess # 2:");
		guess = keyboard.nextInt();
		
		if ( guess > answer )
		{
			System.out.println("Sorry, that is too high.");
		}
		else if ( guess < answer )
		{
			System.out.println("Sorry, you are too low. ");
		}
		if ( guess == answer )
		{
			System.out.println("You guessed it! What are the odds?!?");
		}
		System.out.println("Guess # 3:");
		guess = keyboard.nextInt();
		
		if ( guess > answer )
		{
			System.out.println("Sorry, that is too high.");
		}
		else if ( guess < answer )
		{
			System.out.println("Sorry, you are too low. ");
		}
		if ( guess == answer )
		{
			System.out.println("You guessed it! What are the odds?!?");
		}
		System.out.println("Guess # 4:");
		guess = keyboard.nextInt();
		
		if ( guess > answer )
		{
			System.out.println("Sorry, that is too high.");
		}
		else if ( guess < answer )
		{
			System.out.println("Sorry, you are too low. ");
		}
		if ( guess == answer )
		{
			System.out.println("You guessed it! What are the odds?!?");
		}
		System.out.println("Guess # 5:");
		guess = keyboard.nextInt();
		
		if ( guess > answer )
		{
			System.out.println("Sorry, that is too high.");
		}
		else if ( guess < answer )
		{
			System.out.println("Sorry, you are too low. ");
		}
		if ( guess == answer )
		{
			System.out.println("You guessed it! What are the odds?!?");
		}
		System.out.println("Guess # 6:");
		guess = keyboard.nextInt();
		
		if ( guess > answer )
		{
			System.out.println("Sorry, that is too high.");
		}
		else if ( guess < answer )
		{
			System.out.println("Sorry, you are too low. ");
		}
		if ( guess == answer )
		{
			System.out.println("You guessed it! What are the odds?!?");
		}
		System.out.println("Guess # 7:");
		guess = keyboard.nextInt();
		
		if ( guess > answer )
		{
			System.out.println("Sorry, that is too high.");
		}
		else if ( guess < answer )
		{
			System.out.println("Sorry, you didn't guess it in 7 tries. You lose. ");
		}
		if ( guess == answer )
		{
			System.out.println("You guessed it! What are the odds?!?");
		}
		
		
		
	}
}