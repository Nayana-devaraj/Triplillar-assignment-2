package module11;

public class QueueArray {
    int[] queue = new int[5];
    int front = 0, rear = -1;

    void enqueue(int x) {
        if (rear == queue.length - 1) {
            System.out.println("Queue Overflow");
            return;
        }
        queue[++rear] = x;
    }

    int dequeue() {
        if (front > rear) {
            System.out.println("Queue Underflow");
            return -1;
        }
        return queue[front++];
    }

    void display() {
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueArray q = new QueueArray();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();
        System.out.println("Dequeued: " + q.dequeue());
        q.display();
    }
}
