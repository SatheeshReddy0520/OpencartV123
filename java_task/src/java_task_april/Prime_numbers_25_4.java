package java_task_april;

public class Prime_numbers_25_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 int num=14;
	        if (num > 1) {
	            boolean isPrime = true;
	            for (int i = 2; i <= num; i++) {
	                if (num % i == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }
	            if (isPrime) {
	                System.out.println(num + " is a prime number");
	            } else {
	                System.out.println(num + " is not a prime number");
	          
	        }
	    }


	
	}
	}


