package practice.algo.polindrome;

public class IsValidPolindrome {

    public static boolean isValidPolindrome(String s) {
        return isValidPolindrome(s,false);
    }

    private static boolean isValidPolindrome(String s,boolean flag) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.toCharArray()[left] != s.toCharArray()[right]) {
                if (flag) return false;
                else
                    return (isValidPolindrome(s.substring(left,right),true) ||
                            isValidPolindrome(s.substring(left + 1,right + 1),true));

            } else {
                left++;
                right--;
            }
        }
        return true;
    }
}
