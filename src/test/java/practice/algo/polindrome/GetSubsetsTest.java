package practice.algo.polindrome;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class GetSubsetsTest {
    private GetSubsets getSubsets;

    @Before
    public void setUp() {
        getSubsets = new GetSubsets();
    }

    @Test
    public void nbAllTheSubsets() {
        // Get all the subsets
        List<Integer> set = new ArrayList<>();
        set.add(1);
        set.add(2);
        set.add(3);

        assertEquals(8, getSubsets.getAllSubsets(set, 0).size());

    }
}
