package methods;

public class greetingsmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		greetings gr = new greetings();
		
		gr.m1();                        //1 
		
		String  s = gr.m2();            //2
		System.out.println(s);
		
		gr.m3(" vijay ");               //3
		
		String d = gr.m4(" Tharun ");   //4
		
		System.out.println(d);
	}

}
