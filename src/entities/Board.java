package entities;

public class Board {

    private int size;
    private char[][] board;


    public Board(int size) {
        this.size = size;
        this.board = new char[size][size];
        initializaBoard();
    }

    public void initializaBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = '-';
            }
        }
    }

    public void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Método para criar e salvar uma cópia do estado atual do tabuleiro para as resoluçoes
    public char[][] getBoardCopy() {
        char[][] copy = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                copy[i][j] = board[i][j];
            }
        }
        return copy;
    }

    public char getCell(int row, int col) {
        return board[row][col];
    }

    public void setCell(int row, int col, char value) {
        board[row][col] = value;
    }

    public int getSize() {
        return size;
    }
}
