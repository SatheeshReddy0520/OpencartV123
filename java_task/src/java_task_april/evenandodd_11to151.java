package java_task_april;

public class evenandodd_11to151 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int evencount = 0,oddcount = 0;
		
		for(int i = 11;i<=151;i++)
		{
		 if(i % 2 == 0)
		 {
		   evencount++;
		   }
		 else
		 {
		   oddcount++;
		}
		}
		System.out.println("Number of even numbers:" +evencount);
		System.out.println("number of odd numbers:" +oddcount);
		

	}

}
	


