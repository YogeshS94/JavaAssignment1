package week1.day1;

// always use uppercase to start the class name eg: Mobile, MobileApp
public class Mobile {
	
	// always use camecase to start the method eg: use, useMe, useMobileApp
	// always use public void methodName() {}
	public void makeCall() {
		System.out.println("Call Harry now");
	}
	
	public void sendMsg() {
		System.out.println("Can v meet at 7 pm tomorrow");
		
	}
	
	// need public static void main method to call the methods and create an object and to print
	public static void main(String[] arg) {
		System.out.println("This is the main method. Object are created here and call the methods using object");
		
		// to create object -> Mobile myMob = new Mobile();
		Mobile myPhone = new Mobile();
		myPhone.makeCall();
		myPhone.sendMsg();
		System.out.println("Execution Done");
	}

}
