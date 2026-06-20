import java.util.Scanner;


public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int side1 = scanner.nextInt();
        int side2 = scanner.nextInt();
        int side3 = scanner.nextInt();
        
        // Check triangle inequality theorem and positive constraints
        if (side1 <= 0 || side2 <= 0 || side3 <= 0 || 
            (side1 + side2 <= side3) || 
            (side1 + side3 <= side2) || 
            (side2 + side3 <= side1)) {
            System.out.println("Not a valid triangle");
        } 
        // Check if all sides are equal
        else if (side1 == side2 && side2 == side3) {
            System.out.println("Equilateral");
        } 
        // Check if exactly two sides are equal
        else if (side1 == side2 || side2 == side3 || side1 == side3) {
            System.out.println("Isosceles");
        } 
        // If all sides are different
        else {
            System.out.println("Scalene");
        }

        // Your code to determine the type of triangle based on 'side1', 'side2', 'side3' goes here

        scanner.close();

    }

}