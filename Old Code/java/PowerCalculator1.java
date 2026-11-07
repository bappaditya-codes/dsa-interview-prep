public class PowerCalculator1 {

    public static double calculate(double base, int exponent) {
        long power = exponent;

        if (power < 0) {
            base = 1 / base;
            power = -power;
        }

        double result = 1;

        while (power > 0) {
            if (power % 2 == 1) {
                result *= base;
            }

            base *= base;
            power /= 2;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(calculate(2, 10));
    }
}
