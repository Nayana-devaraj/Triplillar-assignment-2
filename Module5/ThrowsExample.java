package Module5;

public class ThrowsExample {

    static void check() throws ArithmeticException {
        int a = 10 / 0;
    }

    public static void main(String[] args) {
        try {
            check();
        } catch (Exception e) {
            System.out.println("Exception handled");
        }
    }
}
