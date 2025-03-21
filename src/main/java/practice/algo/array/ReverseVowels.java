package practice.algo.array;

import java.util.ArrayList;

public class ReverseVowels {
    public static String reverseVowels(String str) {
        ArrayList<Character> vowels = new ArrayList<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');

        char[] input = str.toCharArray();
        int start = 0;
        int end = str.length() - 1;

        while (start <= end) {
            if (vowels.contains(input[start]) && vowels.contains(input[end])) {
                char temp = input[start];
                input[start] = input[end];
                input[end] = temp;
                start++;
                end--;
            } else if (vowels.contains(input[start]) && !vowels.contains(input[end])) {
                end--;

            } else if (!vowels.contains(input[start]) && vowels.contains(input[end])) {
                start++;
            } else {
                start++;
                end--;
            }
        }
        return String.valueOf(input);
    }
}
