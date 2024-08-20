package practice.algo.polindrome;

import java.util.HashSet;

public class LongestPolindrome {
    public static int longestPalindrome(String s) {
        HashSet<Character> hs = new HashSet<>();
        int count = 0;
        count = getCharactersCount(s, hs, count);
        if (!hs.isEmpty())
            return count + 1;
        return count;
    }

    private static int getCharactersCount(String s, HashSet<Character> hs, int count) {
        for (char c : s.toCharArray())
            if (hs.contains(c)) count++;
            else hs.add(c);
        return count;
    }
}
