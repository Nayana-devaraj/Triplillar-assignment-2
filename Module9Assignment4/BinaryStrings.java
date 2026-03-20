package Module9Assignment4;

public class BinaryStrings {
    public static void generate(String str, int n) {
        if (n == 0) {
            System.out.println(str);
            return;
        }

        generate(str + "0", n - 1);
        generate(str + "1", n - 1);
    }

    public static void main(String[] args) {
        generate("", 3);
    }
}
