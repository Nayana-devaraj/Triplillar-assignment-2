package module9;

public class p5NQueens {

        public static int NO_OF_QUEENS = 4;

        public static void main(String[] args) {

            int [] board = {-1, -1, -1, -1};

            for (int i = 0; i < NO_OF_QUEENS; i++) {
                board[0] = i;
                for (int j = 0; j < NO_OF_QUEENS; j++) {
                    board[1] = j;
                    if (noKill(board, 1)) {
                        for (int k = 0; k < NO_OF_QUEENS; k++) {
                            board[2] = k;
                            if (noKill(board, 2)) {
                                for (int l = 0; l < NO_OF_QUEENS; l++) {
                                    board[3] = l;
                                    if (noKill(board, 3)) {
                                        displayQueens(board);
                                    }
                                }
                            }
                        }
                    }
                }

            }
        }

        private static void displayQueens(int[] board) {
            System.out.println("-------------");
            int n = board.length;
            for (int row = 0; row < n; row++) {
                System.out.println(" ");
                for (int value : board) {
                    if (value == row) {
                        System.out.print("Q\t");
                    } else {
                        System.out.print("*\t");
                    }
                }
                System.out.println();
            }
        }

        private static boolean noKill(int[] board, int currentColumnOfQueen) {

            for (int i = 0; i < currentColumnOfQueen; i++) {
                if (board[i] == board[currentColumnOfQueen])
                    return false;


                if ((currentColumnOfQueen - i) == Math.abs(board[currentColumnOfQueen] - board[i])) {
                    return false;
                }
            }
            return true;
        }

    }

