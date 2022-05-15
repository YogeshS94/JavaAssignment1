package week1.day1;

public class FibonacciSeries {
	// input(range): 8 
	// output: 0, 1, 1, 2, 3, 5, 8, 13
	public static void main(String[] arg) {
		int input = 8;
		int a = 0;
		int b = 1;
		int sum = 0;
		
		for(int i = 1;i<=input;i++) {
			System.out.println(a);
			sum = a + b;
			a = b;
			b = sum;
		}		
	}
}