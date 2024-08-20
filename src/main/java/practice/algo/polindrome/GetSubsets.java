package practice.algo.polindrome;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class GetSubsets {

    private static final Logger logger = LogManager.getLogger(GetSubsets.class);

    public static List<List<Integer>> getAllSubsets(List<Integer> set, int index) {

        List<List<Integer>> allSubsets = new ArrayList<>();
        if (set.size() == index)
            allSubsets.add(new ArrayList<>()); // Empty set
        else {
            allSubsets = getAllSubsets(set, index + 1);
            int item = set.get(index);
            List<List<Integer>> otherSubsets = new ArrayList<>();
            for (List<Integer> subset : allSubsets) {
                List<Integer> newSubset = new ArrayList<>();
                newSubset.addAll(subset);
                newSubset.add(item);
                otherSubsets.add(newSubset);
            }
            allSubsets.addAll(otherSubsets);
        }
        return allSubsets;
    }
}
