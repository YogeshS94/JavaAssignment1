package week1.day1;

public class PrimeNumber {
	//input: 13
	// output: 13 is a Prime Number
	
	public static void main(String[] arg) {
		int input = 23;
		boolean f = false;
		for(int i =2; i<input; i++) {
			if (input%i == 0) {
				f = true;
				break;
			}
		}
		if (f == true)
			System.out.println("Given number " + input + " Not a prime number");
		else
			System.out.println("Given number " + input + " is prime number");
			
	}
}
