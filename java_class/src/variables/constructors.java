package variables;

public class constructors {
	
	int x,y;
	
	constructors ()      // Default constructor
	{
		
		x=10;
		y=20;
	}
	
	constructors (int a, int b)   // parameterized constructors
	{
		x=a;
		y=b;
		
	}
	
	void sum ()
	{
		System.out.println(x+y);
	}
	
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	constructors cd=new constructors();   // it is  Default or invoke 
		
		
		
		constructors cd=new constructors(30,40);	 //it is  parametarised constructor
		
		
		cd.sum();
		
		

	}

}
