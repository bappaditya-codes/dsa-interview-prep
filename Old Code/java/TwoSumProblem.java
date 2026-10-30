import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem {

    public static int[] findTwoSum(int[] numbers, int target) {
        Map<Integer, Integer> indices = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i];

            if (indices.containsKey(complement)) {
                return new int[]{indices.get(complement), i};
            }

            indices.put(numbers[i], i);
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;

        System.out.println(
            "Indices: " + Arrays.toString(findTwoSum(numbers, target))
        );
    }
}
