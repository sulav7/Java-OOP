import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three digits number");
        int a = sc.nextInt(); // a = 343
        int b = a % 10; // 523%10 = 3
        int c = a / 10; // 523 / 10 = 52
        int d = c % 10; // 52 % 10 = 2
        int e = c / 10; // 52 / 10 = 5
        int f = (b * 100) + (d * 10) + e;
        if (a == f) {
            System.out.println("no is palindrome");
        } else {
            System.out.println("number is not palindrome");
        }

    }
}
