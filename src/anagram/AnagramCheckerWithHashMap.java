package anagram;

import java.util.HashMap;
import java.util.Map;

public class AnagramCheckerWithHashMap implements AnagramChecker {
    @Override
    public boolean isAnagram(String s1, String s2) {
        if (s1 == null || s2 == null || s1.length() != s2.length()) return false;

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s1.length(); i++){
            char ch = Character.toLowerCase(s1.charAt(i));
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < s2.length(); i++){
            char ch = Character.toLowerCase(s2.charAt(i));
            map.put(ch, map.getOrDefault(ch, 0) - 1);
        }

        for (int count : map.values()){
            if (count != 0) return false;
        }
        return true;
    }
}
