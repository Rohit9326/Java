import java.util.*;

public class sum_of_first_n_natural_no {
    public static void main(String[] args) {
        System.out.println("enter the number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("sum of natural no = " + sum);
        sc.close();
    }
}
