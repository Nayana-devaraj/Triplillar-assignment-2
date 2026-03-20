package Module8Assignment4;

public class LongestWord {
    public static void main(String[] args) {
        String str = "Java is very powerful language";
        String[] words = str.split(" ");

        String longest = "";

        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        System.out.println("Longest word: " + longest);
    }
}
