package polymorphism;

public class adder {

	    
	     /// METHOD OVERLOADING
	
	
	int a=5,b=6;
	
	void sum()                  // method have no parameters 
	{
	System.out.println(a+b);
	}
	void sum (int x,int y)      // method is  same having parameters 
	{
	System.out.println(x=y);
	}
	
	void sum(int x,double y)    // method same having parameters but data types is different
	{
	System.out.println(x+y);
	}
	void sum (double x , int y)  // method same having parameters but order of data types is different
	{
	System.out.println(x+y);
	}
	void sum(int a,int b, int c)  //example 
	{
	System.out.println(a+b+c);
	}
} 
