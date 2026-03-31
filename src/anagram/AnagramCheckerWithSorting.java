package anagram;

import java.util.Arrays;

public class AnagramCheckerWithSorting implements AnagramChecker {
    @Override
    public boolean isAnagram(String s1, String s2) {
        if (s1 == null || s2 == null || s1.length() != s2.length()) return false;

        char[] symbols1 = s1.toLowerCase().toCharArray();
        char[] symbols2 = s2.toLowerCase().toCharArray();

        Arrays.sort(symbols1);
        Arrays.sort(symbols2);

        return Arrays.equals(symbols1, symbols2);
    }
}
