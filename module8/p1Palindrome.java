package module8;

public class p1Palindrome {

        public static boolean isPalindrome(String str) {
            // Convert string to character array
            char[] charArray = str.toCharArray();
            int left = 0;
            int right = charArray.length - 1;

            //  check for palindrome
            while (left < right) {
                if (charArray[left] != charArray[right]) {
                    return false; // Not palindrome
                }
                left++;
                right--;
            }
            return true; // Is palindrome
        }

        public static void main(String[] args) {
            String Str1 = "madam";
            String Str2 = "hello";

            System.out.println(" madam is a palindrome: " + isPalindrome(Str1));
            System.out.println(" hello is a palindrome: " + isPalindrome(Str2));
        }

}
