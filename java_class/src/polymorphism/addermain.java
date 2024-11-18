package polymorphism;

public class addermain {

	public static void main(String[] args) {
	
		adder ad=new adder();
		
		ad.sum();          // 1
		ad.sum(10, 20);    // 2
		ad.sum(12.55, 10); // 3
		ad.sum(30, 040.7); // 4
		
		ad.sum(10, 20, 30);// 5 example

	}

}
