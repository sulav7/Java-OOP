import java.util.*;

public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of a rectangle");
        double l = sc.nextDouble();

        System.out.println("Enter breadth of a rectangle");
        double b = sc.nextDouble();
        double area = l * b;
        double perimeter = 2 * (l + b);
        System.out.printf("the area of rectangle is " + "%.02f", area);
        System.out.printf("the perimeter of rectange is " + "%.02f", perimeter);
    }
}
