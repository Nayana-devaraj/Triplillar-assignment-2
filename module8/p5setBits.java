package module8;

public class p5setBits {
        public static int countSetBits(int n) {
            int count = 0;
            while (n > 0) {
                count += (n & 1);
                n >>= 1;
            }
            return count;
        }

        public static void main(String[] args) {
            int number = 25;
            int result = countSetBits(number);
            System.out.println("Set bits in " + number + " (binary: " + Integer.toBinaryString(number) + "): " + result);
        }
    }

