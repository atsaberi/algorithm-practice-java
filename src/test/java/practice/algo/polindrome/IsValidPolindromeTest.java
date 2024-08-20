package practice.algo.polindrome;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IsValidPolindromeTest {
    private IsValidPolindrome isValidPalindrome;

    @Before
    public void setUp(){
        isValidPalindrome = new IsValidPolindrome();
    }

    @Test
    public void isInputPolinrome(){
        assertFalse(isValidPalindrome.isValidPolindrome("abdcca"));
        assertTrue(isValidPalindrome.isValidPolindrome("abcccba"));
        assertTrue(isValidPalindrome.isValidPolindrome("abbbckcbbbba"));
    }


}
