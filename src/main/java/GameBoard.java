import java.util.Scanner;

public class GameBoard {

    public static void main(String[] args) {
        int width = 5;
        int height = 5;

        int[][] board = createBoard(width, height);

        int characterX = width / 2;
        int characterY = height / 2;
        board[characterY][characterX] = 1;

        playGame(board, width, height, characterX, characterY);
    }

    public static int[][] createBoard(int width, int height) {
        return new int[height][width];
    }

    public static void printBoard(int[][] board) {
        for (int y = 0; y < board.length; y++) {
            for (int x = 0; x < board[y].length; x++) {
                if (board[y][x] == 1) {
                    System.out.print("C ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }

    public static void playGame(int[][] board, int width, int height, int characterX, int characterY) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            printBoard(board);

            System.out.print("Enter move (W, A, S, D): ");
            char direction = scanner.next().toUpperCase().charAt(0);

            int newX = characterX;
            int newY = characterY;

            if (direction == 'W' || direction == 'S') {
                newY = moveVertical(direction, height, characterY);
            } else if (direction == 'A' || direction == 'D') {
                newX = moveHorizontal(direction, width, characterX);
            } else {
                System.out.println("Invalid move! Please enter W, A, S, or D.");
                continue;
            }

            board[characterY][characterX] = 0;
            board[newY][newX] = 1;

            characterX = newX;
            characterY = newY;
        }
    }

    public static int moveHorizontal(char direction, int width, int characterX) {
        if (direction == 'A') { // A 0 0 D, when using A do - 1
            return Math.max(characterX - 1, 0);
        }
        if (direction == 'D') { // A 0 0 D, when using D do + 1
            return Math.min(characterX + 1, width - 1);
        }
        return characterX;
    }

    public static int moveVertical(char direction, int height, int characterY) {
        if (direction == 'W') { // W 0 0 S when using W do - 1
            return Math.max(characterY - 1, 0);
        }
        if (direction == 'S') { // W 0 0 S when using S do + 1
            return Math.min(characterY + 1, height - 1);
        }
        return characterY;
    }
}