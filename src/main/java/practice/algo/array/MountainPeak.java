package practice.algo.array;

import java.util.List;

public class MountainPeak {
    public static int mountainPeak(List<Integer> mountain) {
        int first = 0;
        int last = mountain.size() - 1;
        int peak = -1;

        while (first <= last) {
            int mid = first + (last - first) / 2;

            if (mountain.get(mid) > mountain.get(mid + 1)) {
                peak = mid;
                last = mid - 1;
            } else {
                first = mid + 1;
            }
        }

        return peak;
    }
}
