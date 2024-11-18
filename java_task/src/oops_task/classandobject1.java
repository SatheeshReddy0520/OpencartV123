package oops_task;

public class classandobject1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		classandobject check = new classandobject();
		
		for (int i=check.x; i<=check.y; i++)
			
			if (i%2==0)
			{
				check.a++;
			}
			else 
			{
				check.b++;
			}
		System.out.println("There are " +check.a +" Even Numbers Between " +check.x +" to " +check.y);
		System.out.println("There are " +check.b +" Odd Numbers Between " +check.x +" to " +check.y);
		
	}
	
}

