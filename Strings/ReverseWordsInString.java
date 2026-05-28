package Strings;
public class ReverseWordsInString {
    public static String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder result = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            if (i != 0) {
                result.append(" ");
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String s = "  the sky   is blue  ";
        String ans = reverseWords(s);
        System.out.println("Input: " + s);
        System.out.println("Output: " + ans);
    }
}