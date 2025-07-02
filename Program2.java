package lab;
import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.print("enter Name: ");
	 String name = sc.nextLine();
	 
	 System.out.print("Enter Roll: ");
	 int roll = sc.nextInt();
	 
	 System.out.print("Enter Marks: ");
	 double marks = sc.nextDouble();
	 
	 System.out.println("Name is: "+name);
	 System.out.println("Roll no.is: "+roll);
	 System.out.println("Marks are: "+marks);
	}
}
