package program;

public class Arraysum {
    public static void main(String[] args) {
        int[] arr = new int[] {10, 20, 30, 40};
        for (int ele : arr)
            System.out.println(ele);
        
        int sum = arrsum(arr);
        System.out.println("Sum: " + sum);
    }

    public static int arrsum(int[] arr) {
        int total = 0;
        for (int ele : arr)
            total = total + ele; 
        return total;
    }
}
