package practice.algo.array;

import java.util.ArrayList;
import java.util.HashSet;


/***
 * Input: board =
 * [["5","3",".",".","7",".",".",".","."],
 * ["6",".",".","1","9","5",".",".","."]
 * ,[".","9","8",".",".",".",".","6","."]
 * ,["8",".",".",".","6",".",".",".","3"]
 * ,["4",".",".","8",".","3",".",".","1"]
 * ,["7",".",".",".","2",".",".",".","6"]
 * ,[".","6",".",".",".",".","2","8","."]
 * ,[".",".",".","4","1","9",".",".","5"]
 * ,[".",".",".",".","8",".",".","7","9"]]
 * Output: true
 *
 */
public class ValidSuduko {
    private char[][] board;


    public void validSuduko(char[][] board) {
        this.board = board;
    }

    public static boolean isValidSuduko(char[][] board) {

        for (int i = 0; i < 10; i++) {
            HashSet<Character> row = new HashSet<>();
            HashSet<Character> col = new HashSet<>();
            HashSet<Character> cube = new HashSet<>();

            for (int j = 0; j < 10; j++) {
                //      if(board[i][j] != "." &&)
            }

        }


        return false;

    }


    private ArrayList<Character> seen(char[] arr) {
        ArrayList<Character> validDigits = new ArrayList<Character>();
        for (int i = 0; i < 10; i++) {
            validDigits.add(Character.valueOf((char) i));

        }

        return validDigits;
    }

    private boolean validRowCol(char[] arr) {
        for (char c : arr) {
            //        if (!validDigits.contains(c)) return false;
        }
        return true;
    }
}
