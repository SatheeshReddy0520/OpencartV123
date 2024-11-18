package exam_task;

public class exception {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			// Arithematic Exception
			
			try {
				int  a=10/0;	
			}
			catch(ArithmeticException e )
			{
			System.out.println(e);	
			}
			
			// null point exception 
			try {
				String s=null;
				System.out.println(s.length());
			}
			catch (NullPointerException  e)
			{
				System.out.println(e);
			}
			
			// number fotmat exception 
			
			try {
			String s="abc";
			int num=Integer.parseInt(s);
			}
			catch(NumberFormatException e)
			{
				System.out.println(e);
			}
			
			//array index out of bond exception 
			
			try {
				
				char c[]=new char[5];
				System.out.println(c[9]);
			}
			catch (ArrayStoreException e) {
				System.out.println(e);
			}
		}
}

