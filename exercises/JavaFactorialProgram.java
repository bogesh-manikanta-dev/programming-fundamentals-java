import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the input integer n
        int n = scanner.nextInt();
        int factorial = 1;
        
        // Calculate factorial using a do-while loop
        do {
            if (n <= 1) {
                break;
            }
            factorial *= n;
            n--;
        } while (n > 1);
        
        // Print the final factorial result
        System.out.println(factorial);
        
        scanner.close();
    }
}