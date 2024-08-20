package practice.algo.polindrome;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestPolindromeTest {
    private LongestPolindrome longestPolindrome;

    @Before
    public void setUp() {
        longestPolindrome = new LongestPolindrome();
    }

    @Test
    public void getLongestPossiblePolindromeLength() {
        String s = "abcccccdd";
        assertEquals(6, longestPolindrome.longestPolindrome(s)) ;

    }
}
