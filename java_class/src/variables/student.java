package variables;

public class student {

	int stdid;
	String sname;
	char grd;        //grade
	
	void printstudentdata()             // class 
	{
		System.out.println(stdid + "    " + sname + "    " + grd);
	}
	
	//2
	void setstudentdata(int id,String name,char grade)           // method 
	{
	stdid=id;
	sname = name;
	grd=grade;
	}
	//3
	
	student (int id,String name,char grade)         //Constructor
			{
		stdid=id;
		sname = name;
		grd=grade;
			
			
	
	
	
}
}