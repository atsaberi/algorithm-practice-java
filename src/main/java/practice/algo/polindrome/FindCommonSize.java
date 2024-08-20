package practice.algo.polindrome;

import java.util.HashMap;
import java.util.List;

public class FindCommonSize {
    private static int findCommonSize(String a, String b) {
    HashMap<Integer, String> commonsMap = new HashMap<>();
    int length = Math.min(a.toCharArray().length - 1, b.toCharArray().length - 1);
    for (int i = 0; i < length - 1; i++) {
        if (!List.of(b.toCharArray()).contains(i)) {
            commonsMap.put(i, String.valueOf(b.toCharArray()[i]));
        }
    }
    return 1;
}
}
