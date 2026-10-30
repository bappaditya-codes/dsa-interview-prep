public class SecondLargestElement {

    public static int findSecondLargest(int[] numbers) {
        if (numbers == null || numbers.length < 2) {
            throw new IllegalArgumentException(
                "At least two distinct elements are required."
            );
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int number : numbers) {
            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest && number < largest) {
                secondLargest = number;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            throw new IllegalArgumentException(
                "No second-largest distinct element exists."
            );
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 5, 20, 8, 20};

        System.out.println(
            "Second Largest: " + findSecondLargest(numbers)
        );
    }
}
