package Arrays1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class listsAndSets {

	public static void main(String[] args) {
		
		// One-Dimensional Array
        int[] numbersArray = {1, 2, 3, 4, 5};
        System.out.println("One-Dimensional Array:");
        for (int i = 0; i < numbersArray.length; i++) {
            System.out.println("Element at index " + i + ": " + numbersArray[i]);
        }
        
        // Two-Dimensional Array
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("\nTwo-Dimensional Array:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        // ArrayList (List)
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        System.out.println("\nArrayList:");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }
        
        // HashSet (Set)
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Red");
        hashSet.add("Green");
        hashSet.add("Blue");
        hashSet.add("Red"); // Duplicates are ignored
        System.out.println("\nHashSet:");
        for (String color : hashSet) {
            System.out.println(color);
        }
    
	}

}
