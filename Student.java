import java.util.Random;

public class Student {
    public static void main(String[] args) {
        Random ran = new Random();
        String s = "0123456789ABCDEF";
        for (int i = 0; i < 100; i++) {
            System.out.print(s.charAt(ran.nextInt(s.length())));
        }
    }
}