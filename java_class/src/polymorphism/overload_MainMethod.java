package polymorphism;

public class overload_MainMethod {
	
	void main (int x)
	{
	System.out.println(x);	
	}
	
	void main(String name)
	{
	System.out.println(name);	
	}
	
	void main (String s1,String s2)
	{
		System.out.println(s1+s2);
	}
	
	
	

	public static void main(String[] args) {
		
		overload_MainMethod ovl=new overload_MainMethod();
		
		ovl.main(101);
		ovl.main("Nattu");
		ovl.main("Ramesh","suresh");
		

	}

}
