import java.util.*;
public class switch_case {
    public static void main(String[] args) {
        System.out.println("enter 1 for english (or) enter 2 for hindi (or) enter 3 for french");

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        switch(number){
            case 1 : System.out.println("english is selected");
            break;
            case 2 : System.out.println("hindi is selected");  
            break;
            case 3 : System.out.println("french is selected");
            break;
            default : System.out.println("you have entered incorrect number");
        }
        sc.close();
    }
}
