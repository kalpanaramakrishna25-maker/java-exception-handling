public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        try {
            String text = "ABC";

            int number = Integer.parseInt(text);

            System.out.println(number);

        } catch (NumberFormatException e) {
            System.out.println("Number Format Exception: Invalid number.");
        }
    }
}
