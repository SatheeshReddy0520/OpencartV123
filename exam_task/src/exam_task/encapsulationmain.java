package exam_task;

public class encapsulationmain {

	public static void main(String[] args) {
		
		encapsulationclass std=new encapsulationclass();
		
		std.setStdid(101);
		std.setName("Eegar");
	    std.setMarks(99);
	    System.out.println(std.getStdid());
	    System.out.println(std.getName());

	    System.out.println(std.getMarks());

	}

}
