package practice.algo.backtrack;

public class WordSearch {
    public static boolean exist(char[][] board, String word) {
        //edge cases
        if (word == null || word.length() == 0) return true;
        if (board == null || board.length == 0 || board[0].length == 0) return false;

        boolean[][] seen = new boolean[board.length][board[0].length];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                // Only start searching if the first character matches
                if (Character.toLowerCase(board[i][j]) ==
                        Character.toLowerCase(word.charAt(0)) &&
                        search(board, word, seen, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean search(char[][] board, String word, boolean[][] seen, int i, int j, int index) {
        // Base case: if we've matched all the characters in the word
        if (index == word.length()) {
            return true;
        }

        // Boundary and character check: return false if out of bounds or character mismatch or already visited
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length ||
                Character.toLowerCase(board[i][j]) != Character.toLowerCase(word.charAt(index)) || seen[i][j]) {
            return false;
        }

        seen[i][j] = true;

        // All four directions (up, down, left, right)
        boolean found =
                search(board, word, seen, i - 1, j, index + 1) || // Up
                        search(board, word, seen, i + 1, j, index + 1) || // Down
                        search(board, word, seen, i, j - 1, index + 1) || // Left
                        search(board, word, seen, i, j + 1, index + 1);   // Right

        seen[i][j] = false;

        return found;
    }
}