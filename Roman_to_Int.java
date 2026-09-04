import java.util.Map;
import java.util.HashMap;

public class Roman_to_Int {

    public static int romanToInt(String s) {
        Map<Character, Integer> values = new HashMap<>();
        values.put('I', 1);
        values.put('V', 5);
        values.put('X', 10);
        values.put('L', 50);
        values.put('C', 100);
        values.put('D', 500);
        values.put('M', 1000);

        int total = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            int current = values.get(s.charAt(i));

            if (i < n - 1 && current < values.get(s.charAt(i + 1))) {
                total -= current;
            } else {
                total += current;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));       // 3
        System.out.println(romanToInt("LVIII"));      // 58
        System.out.println(romanToInt("MCMXCIV"));    // 1994
    }
}