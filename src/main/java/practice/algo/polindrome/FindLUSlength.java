package practice.algo.polindrome;

import java.util.HashMap;
import java.util.List;

public class FindLUSlength {
    public static int findLUSlength(String a, String b) {
        return a.equals(b) ? -1 : Math.max(a.length(), b.length());
    }


}
