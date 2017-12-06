import java.util.Scanner;

public class HowOldSpecifically 
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		String name;
		int age = 15;
	
		System.out.println("Hey, what's your name?" );;
		name = keyboard.next();
	
		System.out.println("Okay " + name + ", how old are you?" );;
		age = keyboard.nextInt();
	
		
		
		
		if ( age < 16 )
		{
			System.out.println("You cannot drive.");
			
		}
		if ( age >=16 && age < 17 )	
		{	
			System.out.println("You can drive but not vote");
		}
		if ( age >=18 && age < 24)
		{
			System.out.println("You can vote but not rent a car.");
		}
		if ( age > 25)
		{
			System.out.println("You can pretty much do whatever you want.");
		}
		
		
		keyboard.close();
	
	
	}
}
