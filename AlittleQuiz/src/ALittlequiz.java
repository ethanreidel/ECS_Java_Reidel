import java.util.Scanner;


public class ALittlequiz 
{
	public static void main (String[] args)
	{

	
		Scanner keyboard = new Scanner(System.in);
	
		String capital;
		int math;
		double weight;
		
		
		System.out.println("What is the capital of California" );;
		System.out.println("         1. San Francisco");
		System.out.println("         2. Los Angeles");
		System.out.println("         3. Sacramento");
		capital = keyboard.next();
	
		if (capital.equals("San Francisco"))
		{
			System.out.println("That is incorrect, the capital of California is Sacramento.");
		}	
		if (capital.equals("Los Angeles"))
		{
			System.out.println("That is incorrect, the capital of California is Sacramento.");
		if (capital.equals("Sacramento"))
		{
			System.out.println("That is correct");
		}
		
		
		keyboard.close();
		}
		}
}