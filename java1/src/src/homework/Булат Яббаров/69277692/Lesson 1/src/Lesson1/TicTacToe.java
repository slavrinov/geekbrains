package Lesson1;

public class TicTacToe {
    public static void main(String[] args) {
        char[][] gameBoard = new char[3][3];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                gameBoard[i][j] = '.';
                System.out.print(gameBoard[i][j] + " ");
            }
            System.out.println();
        }
    }
}
