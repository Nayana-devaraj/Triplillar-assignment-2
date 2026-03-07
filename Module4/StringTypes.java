package Module4;

public class StringTypes {
    public static void main(String[] args) {

        String s = "Hello";
        s = s + " Java";
        System.out.println("String: " + s);

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" Java");
        System.out.println("StringBuilder: " + sb);

        StringBuffer sbf = new StringBuffer("Hello");
        sbf.append(" Java");
        System.out.println("StringBuffer: " + sbf);
    }
}
