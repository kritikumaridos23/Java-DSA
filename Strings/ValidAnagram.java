package Strings;
class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        int[] freq = new int[26];
        for(char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        for(char c : t.toCharArray()) {
            freq[c - 'a']--;
        }
        for(int x : freq) {
            if(x != 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        ValidAnagram obj = new ValidAnagram();
        String s = "anagram";
        String t = "nagaram";
        System.out.println(obj.isAnagram(s, t));
    }
}