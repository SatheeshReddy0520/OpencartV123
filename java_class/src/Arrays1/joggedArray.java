package Arrays1;

public class joggedArray {

	public static void main(String[] args) {
		
int[][] jaggedArray = new int[3][]; // Array of arrays
        
        jaggedArray[0] = new int[]{1, 2}; // First row with 2 elements
        jaggedArray[1] = new int[]{3, 4, 5}; // Second row with 3 elements
        jaggedArray[2] = new int[]{6}; // Third row with 1 element
        
        // Accessing elements
        System.out.println(jaggedArray[0][1]); 
        System.out.println(jaggedArray[1][2]); 
        System.out.println(jaggedArray[2][0]);
        
        
        
	}

}
