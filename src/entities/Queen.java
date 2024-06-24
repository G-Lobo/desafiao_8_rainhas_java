package entities;

public class Queen {

    private Board board;

    public Queen(Board board) {
        this.board = board;
    }

    public boolean isSafe(int row, int col) {
        int size = board.getSize();

        //verifica se a linha esta segura
        for (int i = 0; i < size; i++) {
            if (board.getCell(row, i) == 'Q') {
                return false;
            }
        }

        //verificar se a coluna esta segura
        for (int i = 0; i < row; i++) {
            if (board.getCell(i, col) == 'Q') {
                return false;
            }
        }

        //verifica se a diagonal esquerda superior esta segura
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board.getCell(i,j) == 'Q') {
                return false;
            }
        }

        //verifica se a diagonal direita superior esta segura
        for (int i = row, j = col; i >= 0 && j < size; i--, j++) {
            if (board.getCell(i,j) == 'Q') {
                return false;
            }
        }

        //verifica se a diagonal esquerda inferior esta segura
        for (int i = row, j = col; i < size && j >= 0; i++, j--) {
            if (board.getCell(i,j) == 'Q') {
                return false;
            }
        }

        //verifica se a diagonal direita inferior esta segura
        for (int i = row, j = col; i < size && j >= size; i++, j++) {
            if (board.getCell(i,j) == 'Q') {
                return false;
            }
        }
        return true;
    }

    public void placeQueen(int row, int col) {
        board.setCell(row, col, 'Q');
    }

    public void removeQueen(int row, int col) {
        board.setCell(row, col, '-');
    }


}
