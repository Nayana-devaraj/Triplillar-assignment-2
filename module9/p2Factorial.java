package module9;

public class p2Factorial {

        public static long getFactorial(int n) {
            if (n <= 1) {
                return 1;
            }
            return n * getFactorial(n - 1);
        }

        public static void main(String[] args) {
            int number = 6;
            long result = getFactorial(number);
            System.out.println("The factorial of " + number + " is: " + result);
        }
    }

