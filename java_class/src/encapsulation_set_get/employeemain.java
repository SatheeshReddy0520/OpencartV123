package encapsulation_set_get;

public class employeemain {

	public static void main(String[] args) {
	
         employee emp=new employee();
         
        emp.setEmpid(10123);
        emp.setName("Farooq");
        emp.setSalary(10000);
        
        
        System.out.println(emp.getEmpid());
        System.out.println(emp.getName());
        System.out.println(emp.getSalary());
		
	}

}
