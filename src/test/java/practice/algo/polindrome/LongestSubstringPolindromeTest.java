package practice.algo.polindrome;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestSubstringPolindromeTest {
    private LongestSubstringPolindrome longestSubstringPolindrome;

    @Before
    public void setUp() {
        longestSubstringPolindrome = new LongestSubstringPolindrome();
    }

    @Test
    public void getLongestSubstringPolindrome(){
        assertEquals("aba", longestSubstringPolindrome.longestSubstringPolindrome("babad"));
        assertEquals("abbbba", longestSubstringPolindrome.longestSubstringPolindrome("abbbbabad"));
    }
}
