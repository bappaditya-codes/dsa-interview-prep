public class StringReversal {

    public static String reverse(String input) {
        if (input == null) {
            return null;
        }

        return new StringBuilder(input)
                .reverse()
                .toString();
    }

    public static void main(String[] args) {
        String input = "Java Developer";

        System.out.println(reverse(input));
    }
}
