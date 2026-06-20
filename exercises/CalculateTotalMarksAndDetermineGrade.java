import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // write your code here
        int totalMarks = 0;
        boolean isValid = true;
        
        
        for (int i = 0; i < 5; i++) {
        
            int mark = scanner.nextInt();
            
            
            if (mark < 0 || mark > 100) {
                isValid = false;
            }
            
            totalMarks += mark;
        }
        
        
        if (!isValid) {
            System.out.println("Invalid input");
        } else {
        
        
        
        char grade;
        if (totalMarks >= 450) {
            grade = 'A';
        } else if (totalMarks >= 400) {
            grade = 'B';
        } else if (totalMarks >= 350) {
            grade = 'C';
        } else if (totalMarks >= 300) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        
        
        System.out.println("Total Marks: " +totalMarks );
        System.out.println("Grade: " +grade );
        }
        scanner.close();

    }  

}