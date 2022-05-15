package week1.day1;

// Assignment2
// 1. Create a Car class
// 2. create methods for this class
// example:
// applyBreak()
// applyGear()
// switchonAc()
// applyAcclerate()
//
// Create object for same(current) class and call all the methods
//
// Create a MyCar class and create object for existing(car) class and call the methods of car class


public class Car {
	public void applyBreak() {
		System.out.println("Apply Break when obstacle acquires and Drive slow");
	}
	
	public void applyGear() {
		System.out.println("Change the gear and drive fast in highway");
	}
	
	public void swichonAc() {
		System.out.println("Switch on AC and keep it at low level");
	}
	
	public void applyAcclerate() {
		System.out.println("Apply Acclerate when the road is free");
	}
	
	public static void main(String[] arg) {
		Car obj1 = new Car();
		obj1.applyBreak();
		obj1.applyGear();
		obj1.applyAcclerate();
		obj1.swichonAc();
	}
}