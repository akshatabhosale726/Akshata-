package lab;

public class Invoicetest {
    public static void main(String[] args) {
        Invoice i1 = new Invoice();
        i1.accept();  
        i1.display();

        double amount = i1.calAmount();
        System.out.printf("Total Amount: %.2f\n", amount);
    
}
