package week1.day1;

public class PrimeNumber {
	public static void main(String[] args) {
		
		// Declare an int Input and assign a value 13
		int number =13;
		// Declare a boolean variable flag as false
		boolean flag=false;
		// Iterate from 2 to half of the input
		for (int i = 2; i < number/2; i++) {
			// Divide the input with each for loop variable and check the remainder
			if(number%i==0) {
				// Set the flag as true when there is no remainder
				flag=true;
				// break the iterator
				break;
			}
			
		}
		if(flag==false) {
			System.out.println(number + "is a prime number");
		}
		else {
			System.out.println(number + "is not a prime number");
		}

}
}

	 /*public static void main(String[] args) {

		    int num = 29;
		    boolean flag = false;
		    for (int i = 2; i <= num / 2; ++i) {
		      // condition for nonprime number
		      if (num % i == 0) {
		        flag = true;
		        break;
		      }
		    }

		    if (!flag)
		      System.out.println(num + " is a prime number.");
		    else
		      System.out.println(num + " is not a prime number.");
		  }
		}*/