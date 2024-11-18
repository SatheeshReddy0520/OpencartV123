package string;

public class Reverse_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Taj Mahal";
		char[] c=s.toCharArray();
		String reverse = "";
		
		for (int i =c.length - 1; i >= 0; i--)
		{
			reverse=reverse+c[i];
		}
		{
			System.out.println(reverse);
		}
			
		String s1="Charminar";
		char[] c1=s1.toCharArray();
		String reverse1="";
		
		for(int k=c1.length-1;k>=0;k--) {
			reverse1=reverse1+c1[k];
		}
		System.out.println(reverse1);
		
	}	
		
	}


