package Strings;
public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] freq = new int[26];
        for (char c : magazine.toCharArray()) {
            freq[c - 'a']++;
        }
        for (char c : ransomNote.toCharArray()) {
            freq[c - 'a']--;
            if (freq[c - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String ransomNote = "aa";
        String magazine = "aab";
        boolean result = canConstruct(ransomNote, magazine);
        System.out.println("Ransom Note: " + ransomNote);
        System.out.println("Magazine: " + magazine);
        System.out.println("Can Construct: " + result);
    }
}
