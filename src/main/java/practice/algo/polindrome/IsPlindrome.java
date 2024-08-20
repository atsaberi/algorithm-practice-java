package practice.algo.polindrome;

class IsPlindrome {
    static boolean isPolindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.toCharArray()[left] != s.toCharArray()[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
