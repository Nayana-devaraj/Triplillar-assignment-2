package module9;

public class p3Fibonacci {
        static void printFibonacci(int count) {
            for (int i = 0; i < count; i++) {
                System.out.print(fibonacci(i) + " ");
            }
        }

        static int fibonacci(int n) {
            if (n <= 1) {
                return n;
            }
            return fibonacci(n - 1) + fibonacci(n - 2);
        }

        public static void main(String[] args) {
            int count = 5; //
            System.out.println("Fibonacci series of " + count + " numbers:");
            printFibonacci(count);
        }
    }
