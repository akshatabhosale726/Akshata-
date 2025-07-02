package lab;
import java.util.Scanner;

public class wrapper {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
	    int number = sc.nextInt();
	     System.out.println("Given number is: "+number);
	    
	    String binary = Integer.toBinaryString(number);
	    String octal = Integer.toOctalString(number);
	    String hex = Integer.toHexString(number);
	    
	    System.out.println("Binary Equivalant: "+binary);
	    System.out.println("Octal Equivalant: "+octal);
	    System.out.println("Hex Equivalant: "+hex);
	    sc.close();
	    
	}
}
