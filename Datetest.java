package lab;

public class Datetest {

	public static void main(String[] args) {
		Date dt1 = new Date();
		dt1.display();
		
		Date dt2 = new Date(1,1,2000);
		dt2.display();
		dt2.accept();
		dt2.display();

	}

}
