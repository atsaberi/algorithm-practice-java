package practice.algo.array;

import java.util.List;

public class MinimumRotatedSorted {
    public static int minimumRotatedSorted(List<Integer> arr) {
        int left = 0;
        int right = arr.size() - 1;
        int minIndex = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr.get(mid) < arr.get(right)) {
                minIndex = mid;
                left = mid - 1;

            } else {
                left = mid + 1;
            }
        }
        return minIndex;
    }
}
