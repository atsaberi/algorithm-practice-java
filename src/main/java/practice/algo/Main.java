package practice.algo;

import practice.algo.polindrome.GetSubsets;
import practice.algo.polindrome.IsValidPolindrome;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Longest Polindrome
        //System.out.println(LongestPlindrome.longestPalindrome("abccccdd"));

        // Find LUS Length
        //System.out.println(FindLUSlength.findLUSlength("aaa", "bbba"));

        // Check for valid Polindrom
        System.out.println(IsValidPolindrome.isValidPolindrome("abdcca"));

        // Find longest substring polindrom
        //System.out.println(LongestSubstringPalindrome.longestSubstringPalindrome("babad"));

        // Check if the string is a rotated polindrom
       // System.out.println(IsRotatedPolindrome.isRotatedPolindrome("aaaad"));


        // Get all the subsets
        ArrayList<Integer> set = new ArrayList<>();
        set.add(1);
        set.add(2);
        set.add(3);

        ArrayList<ArrayList<Integer>> subsets = GetSubsets.getSubsets(set, 0);
        //subsets.forEach(subset -> System.out.println(subset));
        //System.out.println(subsets.size());


        String S = "13 DUP 4 POP 5 DUP + DUP + - ";
        System.out.println(WordMachine.wordMachine(S));




    }
}