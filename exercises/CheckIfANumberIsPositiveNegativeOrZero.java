import java.util.Scanner;

public class Solution {

    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();


        // Your code to determine if 'number' is positive, negative, or zero goes here
        if (number > 0) {
            System.out.print("Positive");
        } else if (number < 0) {
            System.out.print("Negative");
        } else {
            System.out.print("Zero");
        }

        scanner.close();

    }

}