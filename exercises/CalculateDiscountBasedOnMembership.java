import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String membership = scanner.next();
        double billAmount = scanner.nextDouble();
        
        if (billAmount <= 0) {
            System.out.println("Invalid amount");
        } else if (membership.equals("Gold")) {
            double finalAmount = billAmount * 0.70;
            System.out.println("Final Amount after Discount: " + finalAmount);
        } else if (membership.equals("Silver")) {
            double finalAmount = billAmount * 0.80;
            System.out.println("Final Amount after Discount: " + finalAmount);
        } else if (membership.equals("Regular")) {
            double finalAmount = billAmount * 0.93;
            System.out.println("Final Amount after Discount: " + finalAmount);
        } else {
            System.out.println("Invalid membership");
        }
        
        scanner.close();
    }
}