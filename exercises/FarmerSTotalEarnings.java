import java.util.Scanner; 
public class Solution { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        double pricePerKg = scanner.nextDouble(); 
        int quantitySold = scanner.nextInt(); 
        
        // Write your code here
double totalEarnings = pricePerKg * quantitySold;
System.out.printf("%.2f", totalEarnings);
        scanner.close(); 
    } 
}