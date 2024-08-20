package practice.algo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import practice.algo.polindrome.GetSubsets;
import practice.algo.polindrome.LongestPolindrome;

import java.util.ArrayList;
import java.util.List;


public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {

        logger.info("***************** longest possible polindrome ****************");
        String input = "abccccdd";
        // Longest Polindrome
        logger.info("Length of the longest possible polindrome for " + input + ":  " + LongestPolindrome.longestPolindrome(input));

        // Find LUS Length
        //System.out.println(FindLUSlength.findLUSlength("aaa", "bbba"));

        // Check for valid Polindrom
        //System.out.println(IsValidPolindrome.isValidPolindrome("abdcca"));

        // Find longest substring polindrom
        //System.out.println(LongestSubstringPolindrome.longestSubstringPolindrome("babad"));

        // Check if the string is a rotated polindrom
        //System.out.println(IsRotatedPolindrome.isRotatedPolindrome("aaaad"));


        // Get all the subsets
        ArrayList<Integer> set = new ArrayList<>();
        set.add(1);
        set.add(2);
        set.add(3);

        List<List<Integer>> subsets = GetSubsets.getAllSubsets(set, 0);

        logger.info("***************** All  for set [1,2,3] subsets ****************");
        subsets.forEach(s -> logger.info("subset: " + s));
        logger.info("Number of subsets: " + subsets.size());


        logger.info("***************** Word Machine ****************");
        String S = "13 DUP 4 POP 5 DUP + DUP + - ";
        logger.info("Result of the command:: " + S + ":  " + WordMachine.wordMachine(S));

    }
}