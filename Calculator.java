import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(
                "Press 1 for additon, press 2 for subtraction, press 3 for multiplication, press 4 for divison");
        int c = sc.nextInt();
        int sum = a + b;
        int subtraction = a - b;
        int multiplication = a * b;
        float divison = a / b;
        if (c == 1) {
            System.out.println("the sum of two digits is " + sum);
        } else if (c == 2) {
            System.out.println("the difference of two digits is " + subtraction);
        } else if (c == 3) {
            System.out.println("the product of two digits is " + multiplication);
        } else if (c == 4) {
            System.out.println(divison);
        } else {
            System.out.println("Invalid number choosen");
        }
    }
}
