package polymorphism;

public class staticKeyword {
	
	
	static int a=10;    // ststic variable 
    int b=20;           // non- static variable 
    
     static   void m1()         // ststic method 
  {
	  System.out.println("it is ststic ");
  }
      void m2()            // non static method 
  {
	  System.out.println("it is non-ststic ");
  }
   
  
  void m()
  {
	  System.out.println(a);
	  System.out.println(b);
	 m1();
	 m2();
  }
    
    
    


	public static void main(String[] args) {
		
		// 1) in public method can acces stuff directly 
		
		System.out.println(a);       
		m1();
		
		//2) static methods can access non-static stuff through object
		
		 staticKeyword st=new staticKeyword();
		
		 System.out.println(st.b);
		 st.m2();
		
		// 3) non static can access directly 
		  
		staticKeyword st1=new staticKeyword();
		st1.m();
		
		
		
	         
		
		
		
		
		
		
	}

}
