package practice.algo.array;

import java.util.List;

//Sorted
public class TargetFirstOccurance {
    public static int targetFirstOccurance(List<Integer> arr, int target) {
        int left = 0;
        int right = arr.size() - 1;
        int firstIndex = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr.get(mid) == target) {
                firstIndex = mid;
                right = mid - 1;
            } else if (arr.get(mid) < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return firstIndex;
    }
}
