package practice.algo.polindrome;

import java.util.ArrayList;

public class GetSubsets {
    public static ArrayList<ArrayList<Integer>> getSubsets(ArrayList<Integer> set, int index) {
        ArrayList<ArrayList<Integer>> allsubsets = new ArrayList<>();
        if (set.size() == index)
            allsubsets.add(new ArrayList<>()); // Empty set
        else
        {
            allsubsets = getSubsets(set, index+ 1);
            int item= set.get(index);
            ArrayList<ArrayList<Integer>> otherSubsets = new ArrayList<>();
            for (ArrayList<Integer> subset : allsubsets) {
                ArrayList<Integer> newSubset = new ArrayList<>();
                newSubset.addAll(subset);
                newSubset.add(item);
                otherSubsets.add(newSubset);
            }
            allsubsets.addAll(otherSubsets);
        }
        return allsubsets;
    }
}
