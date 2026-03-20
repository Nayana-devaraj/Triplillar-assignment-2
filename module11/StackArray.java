package module11;

public class StackArray {
    int[] stack = new int[5];
    int top = -1;

    void push(int x) {
        if (top == stack.length - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = x;
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top--];
    }

    void display() {
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackArray s = new StackArray();

        s.push(10);
        s.push(20);
        s.push(30);

        s.display();
        System.out.println("Popped: " + s.pop());
        s.display();
    }
}
