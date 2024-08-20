package practice.algo.polindrome;

import static practice.algo.polindrome.IsPlindrome.isPolindrome;

public class IsRotatedPolindrome {
    public static boolean isRotatedPolindrome(String s) {
        boolean flag = false;

        if(isPolindrome(s))
            return(true);

        for (int i = 0; i < s.length(); i++) {
            String substr1 = s.substring(i, s.length());
            String substr2 = s.substring(0, i);

            if (isPolindrome(substr1+substr2))
                flag = true;
        }
        return (flag);
    }
}
