package practice.algo.array;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;


public class FirstUniqueInSequence {
    public static int firstUnique(int[] A) {
        Map<Integer, Integer> digitCounts = new HashMap<>();

        IntStream.range(0, A.length).forEach(i -> {
            int count = 1;
            if (!digitCounts.containsKey(A[i])) {
                digitCounts.put(A[i], count);
            } else {
                digitCounts.put(A[i], digitCounts.get(A[i]) + 1);
            }
        });

        for (int i : A) {
            if (digitCounts.get(i) == 1) return i;
        }
        return -1;
    }
}
