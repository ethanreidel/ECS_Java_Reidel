import java.util.Scanner;

public class NameAgeSalary 
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		String name;
		int age, pay;
		
		
		System.out.println("Hello, what is your name? " );;
		name = keyboard.next();
	
		System.out.println("Hi," + name + "! How old are you?" );
		age = keyboard.nextInt();
		
		System.out.println("So you are " + age + "? I guess that's not too old, " + name + ". How much do you make per hour?");
		name = keyboard.next();
	
		pay = keyboard.nextInt();
		System.out.println("Wow, " + pay + " is a lot for your age!");
		
	}
}