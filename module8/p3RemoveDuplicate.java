package module8;

public class p3RemoveDuplicate {
        public static void main(String[] args) {
            String input = "Nayana";

            String result = removeDuplicateChars(input);

            System.out.println("Original String: " + input);
            System.out.println("String after removing duplicates: " + result);
        }

        public static String removeDuplicateChars(String str) {
            // StringBuilder will store our final result
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < str.length(); i++) {
                char currentChar = str.charAt(i);

                if (sb.indexOf(String.valueOf(currentChar)) == -1) {
                    sb.append(currentChar);
                }
            }

            return sb.toString();
        }
    }

