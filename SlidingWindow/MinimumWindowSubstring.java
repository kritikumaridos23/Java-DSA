package SlidingWindow;
import java.util.*;
public class MinimumWindowSubstring {
    public static String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int required = map.size();
        int formed = 0;
        HashMap<Character, Integer> window = new HashMap<>();
        int left = 0, right = 0;
        int minLen = Integer.MAX_VALUE;
        int start = 0;
        while (right < s.length()) {
            char c = s.charAt(right);
            window.put(c, window.getOrDefault(c, 0) + 1);
            if (map.containsKey(c) &&
                window.get(c).intValue() == map.get(c).intValue()) {
                formed++;
            }
            while (left <= right && formed == required) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }
                char ch = s.charAt(left);
                window.put(ch, window.get(ch) - 1);
                if (map.containsKey(ch) &&
                    window.get(ch) < map.get(ch)) {
                    formed--;
                }
                left++;
            }
            right++;
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        String result = minWindow(s, t);
        System.out.println("s = " + s);
        System.out.println("t = " + t);
        System.out.println("Minimum Window Substring = " + result);
    }
}