import java.util.Scanner;

public class DumbCalculator 
{
	public static void main (String[] args)
	{
		double number1, number2, number3, average;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is the first number? " );
		number1 = keyboard.nextDouble();
		
		System.out.println("What is the second number? " );
		number2 = keyboard.nextDouble();
		
		System.out.println("What is the third number? " );
		number3 = keyboard.nextDouble();
	
		average = (number1+number2+number3)/3;
		System.out.println("The average of the three numbers is " +average);
	}
}
