package module11;
import java.util.LinkedList;
import java.util.Queue;

public class PrinterQueue {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.add("Document1");
        queue.add("Document2");
        queue.add("Document3");

        while (!queue.isEmpty()) {
            System.out.println("Printing: " + queue.poll());
        }
    }
}
