package exam_task;

public class arrays {

	public static void main(String[] args) {
		
		
		        int[] originalArray = {1, 2, 3, 4, 5};
		        int[] reversedArray = new int[originalArray.length];

		        for (int i = 0; i < originalArray.length; i++) {
		            reversedArray[i] = originalArray[originalArray.length - 1 - i];
		        }

		        System.out.print("Original Array: ");
		        for (int num : originalArray) {
		            System.out.print(num + " ");
		        }

		        System.out.print("\nReversed Array: ");
		        for (int num : reversedArray) {
		            System.out.print(num + " ");
		        }
		    }
		


}

