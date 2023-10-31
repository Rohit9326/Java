import java.util.*;

public class greater_no_or_smaller_no_elseif {
    public static void main(String[] args) {
        System.out.println("enter the number :");
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        if (number1 == number2) {
            System.out.println("equal");
        } else if (number1 > number2) {
            System.out.println("number 1 is greater");
        } else {
            System.out.println("number 2 is greater");
        }
        sc.close();
    }
}
