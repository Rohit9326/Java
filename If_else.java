import java.util.*;

public class If_else {
    public static void main(String[] args) {
        System.out.println("enter your age :");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age > 18) {
            System.out.println("adult");
        } else {
            System.out.println("not adult");
        }
        sc.close();
    }

}
