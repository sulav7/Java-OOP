import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter diameter of a circle");
        int diameter = sc.nextInt();
        int radius = diameter / 2;
        int area = (22 / 7) * radius * radius;
        System.out.println("The area of circle is " + area);

    }
}
