package week1.day1;

// Assignment-1
// 1.Create a class TwoWheeler 2.Declare the given variables with appropriate values
//
// int noOfWheels
// short noOfMirrors
// long chassisNumber
// boolean isPunctured
// String bikeName
// double runningKM
//
// Create object for TwoWheeler and call all the variables inside main method and print the values.

public class TwoWheeler {

	int noOfWheels = 2;
	short noOfMirrors = 2;
	long chassisNumber = 234325432L;
	boolean isPunctured = false;
	String bikeName = "FZ Version1";
	double runningKM = 48000.12;
	
	
	public static void main(String[] arg) {
		System.out.println("Main Method - Calling all global variables");
		TwoWheeler myBike = new TwoWheeler();
		System.out.println("No of Wheels: " + myBike.noOfWheels);
		System.out.println("No of Mirrors in Bike: " + myBike.noOfMirrors);
		System.out.println("Chassis Number: " + myBike.chassisNumber);
		System.out.println("Is Tyre punctured: " + myBike.isPunctured);
		System.out.println("Bike Name (Model): " + myBike.bikeName);
		System.out.println("KM run: " + myBike.runningKM);	
	}
}
