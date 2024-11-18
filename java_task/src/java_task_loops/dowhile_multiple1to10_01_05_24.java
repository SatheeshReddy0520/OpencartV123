package java_task_loops;

public class dowhile_multiple1to10_01_05_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//multiple numbers with 1 to 10
		
		  int number = 1;
	        do {
	            int multiplier = 1;
	            do {
	                System.out.println(number + " * " + multiplier + " = " + (number * multiplier));
	                multiplier++;
	            } while (multiplier <= 10);
	            System.out.println();
	            number++;
	        } while (number <= 10);

	        // numbers from 1 to 10 with increment
	        System.out.println("Using for loop to print numbers from 1 to 10 with increment:");
	        for (int i = 1; i <= 10; i++) {
	            System.out.print(i + " ");
	        }
	        System.out.println();

	        //  numbers from 10 to 1 with decrement
	        System.out.println("Using for loop to print numbers from 10 to 1 with decrement:");
	        for (int i = 10; i >= 1; i--) {
	            System.out.print(i + " ");
	        }
	        System.out.println();
	    }

	

	        
	    
	}


