package interface_123;

public interface interface123 {
	interface Animal {
	    // Abstract method (does not have a body)
	    void makeSound();

	    // Default method
	    default void sleep() {
	        System.out.println("This animal is sleeping");
	    }
	}

	class Dog implements Animal {
	    public void makeSound() {
	        System.out.println("Woof");
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	        Dog myDog = new Dog();
	        myDog.makeSound();
	        myDog.sleep();
	    }
	}


}
