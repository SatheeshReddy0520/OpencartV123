package PracticaAll;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class OneDimensional {

	public static void main(String[] args) {
	
		int [] array= {1,2,3};
		
		System.out.println(array[0]);
		
		
		
		//two Dimensional
		
		int [][] rect= { {1,2,3,},
				{4,5,6,}
		
		};
		
		System.out.println(rect[0][1]);
		System.out.println(rect[1][1]);
		
		//Multidimensional
		
		int [][][] cube= {
				
				{
				{1,2,3},
				{4,5,6}
				},
				{
				{1,2,3},
				{4,5,6}
				}
		};
				
		System.out.println(cube[0][1][2]);	
		System.out.println(cube[1][0][2]);
		
			
		//joggedarray
		
		int [][] joggedarray=new int[3][];
		
		joggedarray[0]=new int[] {1,2,3};
		joggedarray[1]=new int[] {4,5,6};
		joggedarray[2]=new int[] {7,8,9};
		
		System.out.println(joggedarray[0][2]);
		System.out.println(joggedarray[1][1]);
		System.out.println(joggedarray[2][2]);
		
		
		ArrayList<String> arraylist=new ArrayList<>();
		
		arraylist.add("Apple");
		arraylist.add("banana");
		arraylist.add("orange");
		arraylist.add("Apple");
		
		for(String fruits:arraylist) {
			System.out.println(fruits);
		}
		
		
		Set<String> hashset=new HashSet<>();
		
		hashset.add("red");
		hashset.add("blue");
		hashset.add("pink");
		hashset.add("red");
				
		for(String colours:hashset) {
			System.out.println(colours);
		}
		
		
	}

}
