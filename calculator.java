import java.util.*;

public class calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number :");
        int a = sc.nextInt();
        System.out.println("enter the second number :");
        int b = sc.nextInt();
        System.out.println("enter the operator (+,-,*,/,%)");
        char operator = sc.next().charAt(0); 
        
        /* here charAt(0) is used because  When the user enters their operator, it’s read as a string, but you only want the first character of that string (which should be the operator itself). So charAt(0) allows you to get that first character from the user’s input. If the user enters more than one character, charAt(0) ensures that only the first one is considered. */ 

        switch (operator) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Invalid Division");
                } else {
                    System.out.println(a / b);
                }
                break;
            case '%':
                if (b == 0) {
                    System.out.println("Invalid Division");
                } else {
                    System.out.println(a % b);
                }
                break;
            default:
                System.out.println("Invalid Operator");
        }
        sc.close();
    }
}
