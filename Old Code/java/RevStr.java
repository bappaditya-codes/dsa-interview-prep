import java.util.HashSet;
import java.util.Set;

public class RevStr {

    static String reverse(String text) {
        char[] chars = text.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }

        return new String(chars);
    }

    // Check whether a string is a palindrome
    static boolean isPalindrome(String text) {
        int left = 0;
        int right = text.length() - 1;

        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    // Check whether any two numbers add up to the target
    static boolean hasPairWithSum(int[] numbers, int target) {
        Set<Integer> seen = new HashSet<>();

        for (int number : numbers) {
            int needed = target - number;

            if (seen.contains(needed)) {
                return true;
            }

            seen.add(number);
        }

        return false;
    }

    public static void main(String[] args) {
        String word = "level";
        int[] numbers = {2, 7, 11, 15};
        int target = 9;

        System.out.println("Original string: " + word);
        System.out.println("Reversed string: " + reverse(word));
        System.out.println("Is palindrome: " + isPalindrome(word));

        System.out.println("Numbers add up to " + target + ": "
                + hasPairWithSum(numbers, target));
    }
}
