import java.util.ArrayList;
import java.util.Collections;

public class Practice {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Lamborgini");
        cars.add("Ford");
        cars.add("Mazda");
        Collections.sort(cars);
        // System.out.println(cars.get(0));
        // System.out.println(cars.set(0, "bugatti"));
        // System.out.println(cars.remove(1));
        // System.out.println(cars);
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));

        }

    }
}