package avstract1;

abstract class  Animal {
	    String name;

	    // Abstract method (does not have a body)
	    abstract void makeSound();

	    // Regular method
	    void sleep() {
	        System.out.println(name + " is sleeping");
	    }
	}

	class Dog extends Animal {
	    Dog(String name) {
	        this.name = name;
	    }

	    // Providing implementation for abstract method
	    void makeSound() {
	        System.out.println(name + " says: Woof");
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	        Dog myDog = new Dog("German");
	        myDog.makeSound();
	        myDog.sleep();
	    }
	

	

	
		

	}


