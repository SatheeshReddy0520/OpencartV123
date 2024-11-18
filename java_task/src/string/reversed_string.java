package string;

public class reversed_string {

	public static void main(String[] args) {
		
		
		String s= "Taj Mahal";
		
		char [] c=s.toCharArray();
		
		String reverse="";
		
		for(int i=c.length-1;i>=0;i--)
		{
			reverse=reverse+c[i];
		}
				System.out.println(reverse);
}
}