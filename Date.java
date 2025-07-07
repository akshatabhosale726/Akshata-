package lab;
import java.util.Scanner;

public class Date {
		private int day;
		private int month;
		private int year;
		
		public Date() {
			this(1,1,2000);
		}
		
   //parameterized Constructor
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	//getter method
	public int geDday() {
		return day;
	}
	public int getMonth() {
		return month;
	}
	public int getYear() {
		return year;
	}
	//Setter method
	public void setDay(int day) {
		this.day = day;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Day: ");
		 day = sc.nextInt();
		System.out.println("Enter Month: ");
		 month = sc.nextInt();
		System.out.println("Enter Year: ");
		 year = sc.nextInt();
    }
	
	public void display() {
		System.out.printf("Date: %d-%d_%d\n",this.day,this.month,this.year);
		}

}
