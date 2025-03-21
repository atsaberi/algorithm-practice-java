package practice.algo.test;

public class BattleShips2 {
    public static int nbBattleships(char[][] board) {
        int nbRows = board.length;
        int nbCols = board[0].length;
        int nbShips = 0;

        if (board[0][0] == 'X')
            nbShips++;

        for (int row = 0; row < nbRows; row++) {
            for (int col = 0; col < nbCols; col++) {
                if (board[row][col] == 'X') {
                    if (row == 0 && col - 1 >= 0 && board[row][col - 1] != 'X')
                        nbShips++;
                    if (col == 0 && row - 1 >= 0 && board[row - 1][col] != 'X')
                        nbShips++;

                    if (col - 1 > 0 && row - 1 >= 0 && board[row][col - 1] != 'X' && board[row - 1][col] != 'X')
                        nbShips++;
                }
            }
        }
        return nbShips;
    }

    public static float shipsPercentage(char[][] board) {
        int nbRows = board.length;
        int nbCols = board[0].length;
        float percentage = 0f;

        int total = nbRows * nbCols;
        int nbShipCells = 0;

        for (int row = 0; row < nbRows; row++) {
            for (int col = 0; col < nbCols; col++) {
                if (board[row][col] == 'X')
                    nbShipCells++;
            }
        }

        percentage = ((float) nbShipCells / total);

        return percentage;

    }
}
