package dowhile_01_05;

public class multipleby1_dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int i = 1;
        do {
            System.out.println("1 * " + i + " = " + (1 * i));
            i++;
        } while (i <= 10);

        
        
        //print numbers from 1 to 10
        
        for (int j = 1; j <= 10; j++) {
            System.out.print(j + " ");
        }
        System.out.println(); 

        // print numbers from 10 to 1
        for (int k = 10; k >= 1; k--) {
            System.out.print(k + " ");
        }
    }

	}


