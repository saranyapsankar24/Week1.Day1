package week1.day1;

public class PositiveOrNegativeNumber {
	public static void main(String[] args) {
		int number=35;
		if (number>0) {
			System.out.println("The number is positive");

		}
		else {
			if(number==0) {
				System.out.println("The number is neither positive nor negative");
			}
			else
			{
				System.out.println("The number is negative");
			}
		}
	}


}
