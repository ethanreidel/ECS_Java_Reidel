import java.util.Scanner;
public class UserInputOfData
{
	public static void main (String[] args)
	{

		String firstname, lastname, Login;
		int grade, StudentID;
		double GPA;
		
		Scanner keyboard = new Scanner(System.in);
	
		System.out.println("Please enter the following information so I can sell it for a profit! " );;
		
		System.out.println("First name: " );
		firstname = keyboard.next();
	
		System.out.println("Last name: " );
		lastname = keyboard.next();
	
		System.out.println("Grade (9-12): " );
		grade = keyboard.nextInt();
	
		System.out.println("Student ID: " );
		StudentID = keyboard.nextInt();
	
		System.out.println("Login: " );
		Login = keyboard.next();
	
		System.out.println("GPA (0.0-4.0): " );
		GPA = keyboard.nextDouble();
	
		System.out.println("Your information: " );;
		System.out.println("Login: " + Login );
		System.out.println("ID: " + StudentID );
		System.out.println("Name:" + lastname + ", " + firstname);;
		System.out.println("GPA:" + GPA );;
		System.out.println("Grade: " + grade);;
		
		keyboard.close();
		
	}
}