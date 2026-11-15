import java.util.HashMap;
import java.util.Map;

public class CharacterFrequencyCounter {

    public static void countCharacters(String input) {
        Map<Character, Integer> frequency = new HashMap<>();

        for (char ch : input.toCharArray()) {
            frequency.put(
                ch, frequency.getOrDefault(ch, 0) + 1
            );
        }

        frequency.forEach((key, value) ->
            System.out.println(key + " = " + value)
        );
    }

    public static void main(String[] args) {
        countCharacters("programming");
    }
}
