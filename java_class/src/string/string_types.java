package string;

import java.util.Arrays;

public class string_types {

	public static void main(String[] args) {
	
		
		        String str = "Hello World";
		        
		        int length = str.length();
		        char charAtIndex = str.charAt(6);
		        int indexOfComma = str.indexOf(",");
		        String subString = str.substring(7);
		        String upperCase = str.toUpperCase();
		        String lowerCase = str.toLowerCase();
		        String replaced = str.replace("World", "Java");    
		        String[] split = str.split(",");
		        String trimmed = str.trim();
		        		        
		        System.out.println("Length: " + length);
		        System.out.println("Character at index 6: " + charAtIndex);
		        System.out.println("Index of ',': " + indexOfComma);
		        System.out.println("Substring from index 7: " + subString);
		        System.out.println("Uppercase: " + upperCase);
		        System.out.println("Lowercase: " + lowerCase);
		        System.out.println("Replaced 'World' with 'Java': " + replaced);
		        System.out.println("Split by ',': " + Arrays.toString(split));
		        System.out.println("Trimmed: " + trimmed);
		         
		        
		    }

	}


