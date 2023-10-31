import java.util.*;

public class table_of_number_input {
    public static void main(String[] args) {
        System.out.println("enter the number :");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(i * number);
        }
        sc.close();

    }
}
