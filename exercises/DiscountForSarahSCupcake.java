import java.util.Scanner;

public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        // Read input values
        int costPerDozen = sc.nextInt();
        int quantityDozen = sc.nextInt();
        int discountPercentage = sc.nextInt();
        
        // Calculate the total cost before discount
        int totalCost = costPerDozen * quantityDozen;
        
        // Calculate the final amount after applying the discount
        // Note: Output requires no decimals, so we use integer arithmetic
        int finalAmount = totalCost - (totalCost * discountPercentage / 100);
        
        // Print the result
        System.out.print(finalAmount);
        
        sc.close();
    }
}