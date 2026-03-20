package module11;
import java.util.Stack;
public class BalancedParentheses {
    public static void main(String[] args) {

        String str = "((()))";
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    System.out.println("Not Balanced");
                    return;
                }
                stack.pop();
            }
        }

        if (stack.isEmpty())
            System.out.println("Balanced");
        else
            System.out.println("Not Balanced");
    }
}
