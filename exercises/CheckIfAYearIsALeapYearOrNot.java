import java.util.Scanner;

public class Solution {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        // Read the year input
        int year = scanner.nextInt();
        
        // Check leap year conditions
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.print("Leap year");
        } else {
            System.out.print("Not a leap year");
        }
        
        scanner.close();
    }
}