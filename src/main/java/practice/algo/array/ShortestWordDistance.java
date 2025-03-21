package practice.algo.array;

public class ShortestWordDistance {
    public static int shortestWordDistance(String[] wordArray, String word1, String word2) {
        int[] index1 = {};
        int[] index2 = {};

        index1 = findWord(wordArray, word1);
        index2 = findWord(wordArray, word1);

        for (int i = 0; i < index1.length; i++) {
        }


        return 0;
    }

    private static int[] findWord(String[] wordArray, String word) {
        int[] indices = {};
        for (int i = 0; i < wordArray.length; i++) {
            if (wordArray[i] == word) {
                indices[i] = i;
            }
        }
        if (indices.length == 0) {
            System.out.println(word + "doesn't exist");
        }
        return (indices);
    }

    private int[] findMinMax(int[] indice) {
        int[] minmax = {};
        int min = 0;
        int max = Integer.MAX_VALUE;
        for (int i = 0; i < indice.length; i++) {
            if (indice[i] > min) min = indice[i];
            if (indice[i] < max) max = indice[i];
        }

        return (minmax);
    }
}
