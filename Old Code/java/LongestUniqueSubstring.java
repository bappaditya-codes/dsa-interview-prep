import java.util.HashMap;
import java.util.Map;

public class LongestUniqueSubstring {

    public static int findLength(String text) {
        Map<Character, Integer> lastSeen = new HashMap<>();

        int left = 0;
        int maximumLength = 0;

        for (int right = 0; right < text.length(); right++) {
            char current = text.charAt(right);

            if (lastSeen.containsKey(current)) {
                left = Math.max(left, lastSeen.get(current) + 1);
            }

            lastSeen.put(current, right);

            maximumLength = Math.max(
                    maximumLength, right - left + 1
            );
        }

        return maximumLength;
    }

    public static void main(String[] args) {
        String text = "abcabcbb";

        System.out.println(findLength(text));
    }
}
