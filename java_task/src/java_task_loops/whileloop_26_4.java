package java_task_loops;

public class whileloop_26_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        // Part 1: Print multiples of 2, 3, 4, and 5
		
		        int limit = 20; //we will adjust this limit as needed
		        int number = 2;
		        
		        System.out.println("Multiples of 2, 3, 4, and 5 up to " + limit + ":");
		        
		        while (number <= limit) {
		            if (number % 2 == 0 || number % 3 == 0 || number % 4 == 0 || number % 5 == 0) {
		                System.out.print(number + " ");
		            }
		            number++;
		        }
		        
		       
		    }
		
	}


