import java.util.Scanner;
public class Solution { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt(); 
        int width = scanner.nextInt();

        // write your code here
int area = length * width;
System.out.print(area);
        scanner.close(); 
    } 
}