
public class MoreVariablesAndPrinting 
{
	public static void main (String[] Args)
	{
		String myName, myEyes, myTeeth, myHair; 
		int myAge, myHeight, myWeight;
		double myHeightCm, myWeightKg;
		
		myName = "Ethan J. Reidel";
		myAge = 16;     // not a lie
		myHeight = 60;   // inches
		myWeight = 105; // lbs
		myWeightKg = 47.6272;
		myHeightCm = 152.4; 
		myEyes = "Blue";
		myTeeth = "White";
		myHair = "Brown";
		
		System.out.println( "Let's talk about " + myName + ".");
		System.out.println("He's " + myHeight + "or " + myHeightCm  + "cm"  );
		System.out.println( "He's " + myWeight + " pounds heavy." );
		System.out.println( "Actually, that's not too heavy.");
		System.out.println( "He's got " + myEyes + " eyes and " + myHair + "hair." );
		System.out.println( "His teeth are usually " + myTeeth + " depending on the coffee." );
		System.out.println( "If I add " + myAge + ", " + myHeight + ", and " + myWeight + " I get " + (myAge + myHeight + myWeight) + "." );
	
	}
}