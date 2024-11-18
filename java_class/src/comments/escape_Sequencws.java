package comments;

public class escape_Sequencws {

	public static void main(String[] args) {
	
		//  Escape sequence:
		
/*		     Backslash(\)with character :\t,\b,\n,\’,\”,\\
			\t----inserts a tab space
			\b--- inserts a backspace
			\n----inserts a new line
			\’-----inserts single quote
			\”----inserts double quote
			\\----inserts backslash                        */
			
			System.out.println("this is\tjava");     // \t----inserts a tab space
			

			System.out.println("this is\bjava");    // \b--- inserts a backspace
			
			
			System.out.println("this is\njava");    // \n----inserts a new line
			
			
			System.out.println("this is \'java\'");    // \’-----inserts single quote
			
			
			System.out.println("this is \"java\" ");    // \”----inserts double quote
			
			System.out.println("this is\\java\\");    // \”----inserts double quote
	}

}







