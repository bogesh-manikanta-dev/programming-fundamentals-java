import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Check if an integer is available to read
        if (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            
            // Validate the constraints (must be greater than zero)
            if (num <= 0) {
                System.out.println("Invalid Input");
            } else {
                // Print the header exactly as expected
                System.out.println("Multiplication Table of " + num + ":");
                
                // Print the table from 1 to 10
                for (int i = 1; i <= 10; i++) {
                    System.out.println(num + " * " + i + " = " + (num * i));
                }
            }
        }
        
        scanner.close();
    }
}