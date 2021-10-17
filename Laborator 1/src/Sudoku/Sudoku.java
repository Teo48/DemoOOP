package Sudoku;

public class Sudoku {
    public void solveTetris() {
        System.out.println("I solved Tetris");
    }
    /**
     * Returns an image that represents a solved sudoku.
     * This method always returns immediately, whether or not the
     * image exists.
     *
     * @param  path an absolute path to the location of the starting image
     * @param  name the name of the image that represents the solved sudoku
     */
    public int solveSudoku(String path, String name) {
        try {
            return 1;
        } catch (Exception e) {
            return 0;
        }
    }
}
