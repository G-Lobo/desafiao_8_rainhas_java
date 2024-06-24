package entities;

import java.util.ArrayList;
import java.util.List;

public class Solver {
    private int size;
    private Board board;
    private List<char[][]> solutions;
    private Queen queen;

    public Solver(int size) {
        this.size = size;
        this.board = new Board(size);
        this.solutions = new ArrayList<>();
        this.queen = new Queen(board);
    }

    public void solve() {
        solve(0);
    }

    private void solve(int row) {
        if(row == size) {
            solutions.add(board.getBoardCopy());
            return;
        }

        for (int col = 0; col < size; col ++) {

            if (queen.isSafe(row,col)) {
             queen.placeQueen(row,col);
             solve(row + 1);
             queen.removeQueen(row,col);
            }
        }
    }

    //imprime a lista de soluçoes

    public void printSolutions() {
        int count = 1;
        for (char[][] solution : solutions) {
            System.out.println("solução Nº" + count + ":");
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    System.out.print(solution[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
            count++;
        }
    }
}
