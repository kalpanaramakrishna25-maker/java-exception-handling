public class NullPointerExceptionExample {
    public static void main(String[] args) {
        try {
            String text = null;

            System.out.println(text.length());

        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception: Object is null.");
        }
    }
}
