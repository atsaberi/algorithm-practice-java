package practice.algo.array;

public class SquaredList {
    public static int[] sortedSquares(int[] nums) {
        int[] sortedSquared = new int[nums.length];
        int length = nums.length;
        int start = 0;
        int end = length - 1;
        int p = length - 1;

        while (start <= end) {
            if (nums[start] * nums[start] < nums[end] * nums[end]) {
                sortedSquared[p] = nums[end] * nums[end];
                p--;
                end--;
            } else {
                sortedSquared[p] = nums[start] * nums[start];
                p--;
                start++;
            }
        }
        return sortedSquared;
    }
}


