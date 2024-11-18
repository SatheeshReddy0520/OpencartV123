package java_task_april;

public class else_if_25_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int m=350;
		
		if (m<=500 && m>=450)
		{
			System.out.println("A grade");
		}
		else if (m<=449 && m>=400)
		{
			System.out.println("B grade");
		}
		else if (m<=399 && m>=350)
		{
			System.out.println("C grade");
		}
		else if (m<=348 && m>=300)
		{
			System.out.println("D grade");
		}
		else if (m<300)
		{
			System.out.println("Fail");
		}
		else 
		{
			System.out.println("invalid");
		}
	}

}
