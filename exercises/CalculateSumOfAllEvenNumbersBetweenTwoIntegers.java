import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the start and end integers
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        
        int sum = 0;
        
        // Loop through the range inclusive
        for (int i = start; i <= end; i++) {
            // Check if the number is even
            if (i % 2 == 0) {
                sum += i;
            }
        }
        
        // Output the final sum
        System.out.println(sum);
        
        scanner.close();
    }
}