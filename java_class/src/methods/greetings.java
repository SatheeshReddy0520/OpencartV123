package methods;

public class greetings {

	//     1) no params    // no return value
	
     void m1()
	{
		System.out.println(" hello ");
	
	}


// 2) no params    // returns some value  // return = string 


		String m2()
		{
		return (" How are you ");
	
		}


// 3) takes params  // no return value 

        void  m3 (String name )
        {
        	System.out.println(" hi " + name );

}
 
//4) takes params   //return value
        
        
      String  m4(String name)
      
      {
    	  return ("hello" + name );
      
        
      }
}


