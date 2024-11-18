package dowhile_01_05;

public class multiplby10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int p = 1;
		
      do {
          System.out.println("10 * " + p + " = " + (6 * p));
          
          p++;
          
      } while (p <= 10);

      
      
      //print numbers from 1 to 10 increment
      
      for (int j = 1; j <= 10; j++) {
          System.out.print(j + " ");
      }
      System.out.println(); 

      // print numbers from 10 to 1 decrement
      for (int k = 10; k >= 1; k--) {
          System.out.print(k + " ");
	}

}
}