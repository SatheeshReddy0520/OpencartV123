package polymorphism;

public class Counter {
    // Static variable to keep track of the count
    private static int count = 0;

    // Static method to increment the count
    public static void increment() {
        count++;
    }

    // Static method to get the current count
    public static int getCount() {
        return count;
    }

    public static void main(String[] args) {
        // Access static method without creating an instance of the class
        Counter.increment();
        Counter.increment();
        
        // Access static method to get the count
        System.out.println("Count: " + Counter.getCount()); // Output will be: Count: 2
    }
}
