package string;

public class stringAtoZ {

	public static void main(String[] args) {
		
		
         String s = "abcdefghijklmnopqrstuvwxyz";
       
         char[]   c=s.toCharArray();  
         
        for (int i = 0; i < s.length(); i++)     
        {
           
            System.out.print(s.charAt(i));   
            
            
            System.out.print(i + 1);      
            
           
        
        }
    }
}
