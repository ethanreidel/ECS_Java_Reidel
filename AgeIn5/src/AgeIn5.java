import java.util.Scanner;

public class AgeIn5 
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
	
		String name;
		int age, years = +21, yearsago = 11;
		
		
		System.out.println("Hello, what is your name? " );;
		name = keyboard.next();
		
		System.out.println("Hi," + name + "! How old are you?" );
		name = keyboard.next();
	
		System.out.println("Did you know that in five years you will be " + years + " years old? and five years ago you were " + yearsago + 
				", Imagine that!" );
		name = keyboard.next();
	
		keyboard.close();
	}
}
