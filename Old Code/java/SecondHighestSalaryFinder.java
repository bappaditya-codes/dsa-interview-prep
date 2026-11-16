import java.util.Arrays;
import java.util.List;

public class SecondHighestSalaryFinder {

    public static void main(String[] args) {

        List<Integer> salaries =
                Arrays.asList(30000, 50000, 70000, 60000, 70000);

        Integer secondHighest = salaries.stream()
                .distinct()
                .sorted((a, b) -> b.compareTo(a))
                .skip(1)
                .findFirst()
                .orElse(null);

        System.out.println("Second Highest Salary: " + secondHighest);
    }
}
