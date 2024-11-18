package inheritance;

// parent class
public class vehicle {

	 void drive() {
	        System.out.println("Driving the vehicle...");
	    }
	
}

// child class
class Car extends vehicle {
    void accelerate() {
        System.out.println("Accelerating the car...");
    }
}
