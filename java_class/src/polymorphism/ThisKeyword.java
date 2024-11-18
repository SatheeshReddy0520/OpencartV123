 package polymorphism;

public class ThisKeyword {
	
	int x,y;
	
	//ThisKeyword (int a,int b)        // constructor
	
//	{
	//	x=a;
	//	y=b;
		
//	}
	void setdata(int x,int y)            // Method 
	{
	this.x=x;
	this.y=y;
		
	}
	
	void print()
	{
		System.out.println(x);
		System.out.println(y);
	}
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
	
	//	ThisKeyword th=new ThisKeyword(10,20);   // 1
	//	th.print();
	
		ThisKeyword th=new ThisKeyword();          // 2 
		
		th.setdata(10, 20);                    
		th.print();
		
	}

}
