package lab;
import java.util.Scanner;
public class Pattern {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter no. of Rows: ");
    	int rows = sc.nextInt();
    	
        for (int i = 0; i < rows; i++) {
        
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }
            
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
            sc.close();
        }
    }
    
}