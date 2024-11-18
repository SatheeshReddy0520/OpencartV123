package oops_task;

public class grades {

	
	String name;
	int marks;
	
	
	void print()
	{
		
		 if (marks >= 90 && marks <=100) {
	            System.out.println(name + " has an A grade.");
	            
	        } else if (marks >= 80 && marks<90 ) {
	            System.out.println(name + " has a B grade.");
	            
	        } else if (marks >= 70 && marks <80) {
	            System.out.println(name + " has a C grade.");
	            
	        } else if (marks >= 60 && marks <70) {
	            System.out.println(name + " has a D grade.");
	            
	        } else {
	            System.out.println(name + " has an F (fail) grade.");
	        }
	    }
}
