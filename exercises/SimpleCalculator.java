import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            String op = sc.next();
            
            if (op.length() != 1) {
                System.out.println("Invalid Operation");
            } else {
                char operation = op.charAt(0);
                
                switch (operation) {
                    case '+':
                        System.out.println(num1 + num2);
                        break;
                    case '-':
                        System.out.println(num1 - num2);
                        break;
                    case '*':
                        System.out.println(num1 * num2);
                        break;
                    case '/':
                        if (num2 == 0) {
                            System.out.println("Error: Division by zero");
                        } else {
                            System.out.println(num1 / num2);
                        }
                        break;
                    default:
                        System.out.println("Invalid Operation");
                        break;
                }
            }
        }
        sc.close();
    }
}