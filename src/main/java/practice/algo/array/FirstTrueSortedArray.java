package practice.algo.array;

import java.util.List;


// template for finding the first element,
// need to just replace the feasible function based on the question
public class FirstTrueSortedArray {
    public static int firstTrueSortedArray(List<Boolean> arr) {
        int left = 0;
        int right = arr.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr.get(mid) == true) { // ====> feasible condition
                if (arr.get(mid - 1) == false)
                    return (mid);
                right = mid - 1;
            } else left = mid + 1;
        }
        return -1;
    }
}

