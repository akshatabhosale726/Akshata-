package lab;
import java.util.Scanner;

public class Invoice {
    private String part_no;
    private String description;
    private int quantity;
    private double price;

    public Invoice() {
        // default constructor
    }
public Invoice(String part_no, String description, int quantity, double price) {
        this.part_no = part_no;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }
 // Getter methods
    public String getpart_no() {
        return part_no;
    }

    public String getdescription() {
        return description;
    }

    public int getquantity() {
        return quantity;
    }

    public double getprice() {
        return price;
    }
// Setter methods
    public void setpart_no(String part_no) {
        this.part_no = part_no;
    }

    public void setdescription(String description) {
        this.description = description;
    }

    public void setquantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 0;
        }
    }

    public void setprice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            this.price = 0.00;
        }
    }
 public void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Part_no: ");
        part_no = sc.nextLine();

        System.out.println("Enter Description: ");
        description = sc.nextLine();

        System.out.println("Enter Quantity: ");
        int quantity = sc.nextInt();
        setquantity(quantity);

        System.out.println("Enter price: ");
        double price = sc.nextDouble();
        setprice(price);
    }
    public void display() {
        System.out.printf("Invoice: %s - %s - %d - %.2f\n", this.part_no, this.description, this.quantity, this.price);
    }

    public double calAmount() {
        return this.quantity * this.price;
    }
}
