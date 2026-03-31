package anagram;

public class AnagramCheckerWithCharCounting implements AnagramChecker {
    @Override
    public boolean isAnagram(String s1, String s2) {
        if (s1 == null || s2 == null || s1.length() != s2.length()) return false;

        int[] alphabet = new int[26];

        for (int i = 0; i < s1.length(); i++){
            char ch = Character.toLowerCase(s1.charAt(i));
            int index = ch - 'a';
            alphabet[index]++;
        }

        for (int i = 0; i < s2.length(); i++){
            char ch = Character.toLowerCase(s2.charAt(i));
            int index = ch - 'a';
            alphabet[index]--;
        }

        for (int count : alphabet){
           if (count != 0) return false;
        }
        return true;
    }
}
