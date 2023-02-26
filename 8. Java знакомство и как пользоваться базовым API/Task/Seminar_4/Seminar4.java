import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Seminar4
 */
public class Seminar4 {

    public static void main(String[] args) {
        Random random = new Random();
        Map<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < 100; i++) {
            int num = random.nextInt(10);
            Integer current = hm.get(num);
            hm.put(num, current == null ? 1 : current + 1 );
        }
        System.out.println(hm); 
    }
}