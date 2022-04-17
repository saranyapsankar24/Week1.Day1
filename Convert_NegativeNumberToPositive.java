package week1.day1;

public class Convert_NegativeNumberToPositive {

	public static void main(String[] args) {

		int number=-40;
		if(number<0) {
			int positiveNumber=Math.abs(number);
			System.out.println("The number" + number+ "is converted to" + positiveNumber);	
		}

	}
}


