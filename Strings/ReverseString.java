package Strings;
import java.util.Arrays;
public class ReverseString {
    public static void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;
        while (i < j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        System.out.println("Original String: " + Arrays.toString(s));
        reverseString(s);
        System.out.println("Reversed String: " + Arrays.toString(s));
    }
}