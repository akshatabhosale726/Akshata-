package lab;

public class Fibonacci {

	public static void main(String[] args) {
		 int count = 10; 
	        int n1 = 0, n2 = 1;

	        System.out.print("Fibonacci Series: ");
	        for (int i = 0; i < count; i++) {
	            System.out.print(n1 + " ");
	            int n3 = n1 + n2;
	            n1 = n2;
	            n2 = n3;
	        }
	        System.out.println();
	    }
	}
		
	
