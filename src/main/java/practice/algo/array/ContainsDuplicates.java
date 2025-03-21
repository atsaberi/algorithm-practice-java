package practice.algo.array;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicates {
    public static boolean containsDuplicates(int[] input) {
        // List<Integer> res = new ArrayList<>();  complexity for add O(1)--> worst case O(n)
        Set<Integer> res = new HashSet<>(); // add, contains ... it's always O(1)
        for (int d : input) {
            if (res.add(d)) return false;
            else return true;
        }
        return false;
    }
}
