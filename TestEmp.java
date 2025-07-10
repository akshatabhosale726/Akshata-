package lab;

public class TestEmp {

    public static void main(String[] args) {
        Employee e1 = new Employee("xyz", 1, 1000.00);
        Employee e2 = new Employee("xyz", 1, 1000.00);
        Employee e3 = new Employee("abc", 2, 2000.00);

        System.out.println("Comparing e1 and e2 (same empId): " + e1.equals(e2));  // true
        System.out.println("Comparing e1 and e3 (different empId): " + e1.equals(e3));  // false
        System.out.println("Comparing e1 and null: " + e1.equals(null));  // false
        System.out.println("Comparing e1 with itself: " + e1.equals(e1));  // true

        System.out.println(e1);  // toString()
        System.out.println(e2);
        System.out.println(e3);
    }
}
