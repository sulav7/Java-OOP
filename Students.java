import java.util.Random;

public class Students {
        public static void oneTimePad() {
                int st = 45;
                System.out.println(st);
                Random ran = new Random();
                String s = "0123456789ABCDEF";
                for (int i = 0; i < 100; i++) {
                        System.out.print(s.charAt(ran.nextInt(s.length())));
                }
        }

}