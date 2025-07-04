package program;
  import java.util.Scanner;
public class Program3 {

	private String name; 
	private int empid; 
	private double salary; 
	//methods 
	public void acceptRecord( ) {
		Scanner sc = new Scanner(System.in); 
		System.out.print("Name : ");
		name = sc.nextLine();
		System.out.print("Empid : ");
		empid = sc.nextInt(); 
		System.out.print("Salary : ");
		salary = sc.nextDouble(); 
	}
	public void printRecord( ) {
		System.out.println("Name : "+name);
		System.out.println("Empid : "+empid);
		System.out.println("Salary : "+salary);
	}
}






