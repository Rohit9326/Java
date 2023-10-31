import java.util.*;

public class Input_no_and_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a + b;
        System.out.println("sum = " + c);
        sc.close();
    }
}
