import java.util.Arrays;

public class DuplicateElementRemover {

    public static int removeDuplicates(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return 0;
        }

        int uniqueIndex = 0;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] != numbers[uniqueIndex]) {
                numbers[++uniqueIndex] = numbers[i];
            }
        }

        return uniqueIndex + 1;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 1, 2, 2, 3, 4, 4};

        int size = removeDuplicates(numbers);

        System.out.println(
            Arrays.toString(Arrays.copyOf(numbers, size))
        );
    }
}
