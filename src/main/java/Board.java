public class Board {
    private char[][] board;

    public Board() {
        this.board = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                this.board[i][j] = ' ';
            }
        }
    }

    public boolean place(int[] coordinates, char sign) {
        // invalid coordinates format
        if (coordinates.length != 2) {
            return false;
        }

        // coordinates not valid range
        if (coordinates[0] < 0 || coordinates[0] > 2 || coordinates[1] < 0 || coordinates[1] > 2) {
            return false;
        }

        // place the sign
        int x = coordinates[0];
        int y = coordinates[1];
        if (this.board[y][x] == ' ') {
            this.board[y][x] = sign;
            return true;
        }
        return false;
    }

    public void display() {
        for (char[] i : this.board) {
            for (char j : i) {
                System.out.print("|" + j);
            }
            System.out.println("|");
        }
    }

    public static void main(String[] args) {
        Board board = new Board();
        board.display();
    }
}
