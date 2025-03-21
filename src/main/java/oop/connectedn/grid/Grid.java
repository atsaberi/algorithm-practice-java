package oop.connectedn.grid;

enum GridState {
    EMPTY,
    YELLOW,
    RED;
}

public class Grid {
    private int row;
    private int col;
    private int[][] grid;

    public Grid(int row, int col) {
        this.row = row;
        this.col = col;
        initGrid();
    }

    public void initGrid() {
        this.grid = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                grid[i][j] = GridState.EMPTY.ordinal();
            }
        }
    }

    public int[][] getGrid() {
        return this.grid;
    }


}
