package exam_task;

public class reversebufferstring {

	public static void main(String[] args) {
		
		        int[] c = {1, 2, 3, 4, 5};
		        		        
		        StringBuffer sb = new StringBuffer();
		        for (int i = c.length - 1; i >= 0; i--) {
		            sb.append(c[i] + " ");
		        }
		        
		        System.out.println("Reversed Array:"+sb.toString());
		    }
	

	}


