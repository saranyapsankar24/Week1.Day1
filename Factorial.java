package week1.day1;


public class Factorial {

	public static void main(String[] args) {

		// Declare your input as 5 and an integer variable fact as 1
		int number=6,fact=1;
		// Iterate from 1 to your input (tip: using loop concept)
		for(int i=1;i<=number;i++) {
			// Within the loop: Multiply fact with the iterator variable (Tip: Assign it to the 'fact' variable)
			fact=fact*i;
		}
		// Print factorial (fact)
		System.out.println("Factorial of the given" + number + "is" + fact);

	}
}
