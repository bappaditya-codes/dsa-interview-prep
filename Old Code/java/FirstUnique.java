import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUnique {

    public static Character findFirstUnique(String text) {
        Map<Character, Integer> frequency = new LinkedHashMap<>();

        for (char ch : text.toCharArray()) {
            frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry
                : frequency.entrySet()) {

            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return null;
    }

    public static void main(String[] args) {
        String text = "swiss";

        System.out.println(findFirstUnique(text));
    }
}
