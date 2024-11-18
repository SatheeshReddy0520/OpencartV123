package polymorphism;

public class cube {
	
	
	//CONSTRUCTORS OVERLOADING 
	
	
	
     double width, height, depth;
     
     cube()                             // 1 no parameters 
     {
    	 width=height=depth=0;
     }
     
     cube (double w, double h,double d)  // having params 
     {
    	 width=w;
    	 height=h;
    	 depth=d;
    	 
     }
    
     cube (double length)                // having 
     {
    	 width=height=depth=length;
     }
     
     double volume()
     {
       return (width*height*depth);
     }
     
}



