import java.util.Random;

public class Students {
        public static void oneTimePad() {
                Random ran = new Random();
                String s = "0123456789ABCDEF";
                for (int i = 0; i < 100; i++) {
                        System.out.print(s.charAt(ran.nextInt(s.length())));
                }
        }
}