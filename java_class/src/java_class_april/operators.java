package java_class_april;

public class operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		      //Arithematic operators 
				
				
				int a=4;
				int b=8;
				
			System.out.println(a+b);  //12
			System.out.println(b-a); //4 
			System.out.println(a*b);  // 32
			System.out.println(a/b);  //0
			System.out.println(a%b); 
			
			
			//Relational opetators 
			
			System.out.println(a<b);   //T
			System.out.println(a>b);   // f
			System.out.println(a<=b);  // t
			System.out.println(a>=b);  // f
			System.out.println(a==b);  //f
			System.out.println(a!=b);  //t
			
			
			
			//Logical operators 
			
		 boolean h=true;
		 boolean j=false;
		 
		 
		 System.out.println(h && j);      // false 
		 
		 System.out.println(h || j);      //true
		 System.out.println(!h);          //false
		 System.out.println(!j);          //true
		 
		       ///Assignment operators
		 
		 //left=right
		 
		 int c;
		 c =a;
		 System.out.println(c); 
		 c=b;  
		 System.out.println(c);
		 
		      ///incement/decrement operators 
		 
		     c=20;	     
		     c+=5;
		    
		     System.out.println(c++);
		     
		  c=20;
		  c=c-5;
		  System.out.println(c--);

			
			}

	}


