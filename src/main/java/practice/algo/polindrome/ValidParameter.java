package practice.algo.polindrome;

public class ValidParameter {
    public static boolean validPalindrome(String s) {
        return validPalindrome(s, false);
    }

    public static boolean validPalindrome(String s, boolean flag) {
        int left = 0;
        int right = s.length() - 1;


        while (left < right) {
            if (s.toCharArray()[left] != s.toCharArray()[right]) {
                if (flag) return false;

                else
                    return (validPalindrome(s.substring(left, right), true)
                            || validPalindrome(s.substring(left + 1, right + 1), true));

            } else {
                left++;
                right--;
            }
        }
        return true;
    }
}
