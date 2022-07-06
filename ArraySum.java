import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        System.out.println("Enter the size of an array"); // 4
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int myArr[] = new int[s];
        int sum = 0;
        System.out.println("Enter the elements of an array"); // 1,2,3,4,5
        for (int i = 0; i < s; i++) {
            myArr[i] = sc.nextInt();
            sum = sum + myArr[i];
        }

        System.out.println("the sum of array is " + sum);
    }
}
