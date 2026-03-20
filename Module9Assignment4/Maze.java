package Module9Assignment4;

public class Maze {
    static int N = 4;

    static int[][] maze = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {0, 1, 0, 0},
            {1, 1, 1, 1}
    };

    static int[][] solution = new int[N][N];

    // Function to check if move is safe
    static boolean isSafe(int x, int y) {
        return (x >= 0 && y >= 0 && x < N && y < N && maze[x][y] == 1);
    }

    // Backtracking function
    static boolean solveMaze(int x, int y) {

        // Destination reached
        if (x == N - 1 && y == N - 1) {
            solution[x][y] = 1;
            return true;
        }

        if (isSafe(x, y)) {

            solution[x][y] = 1;

            // Move Right
            if (solveMaze(x, y + 1))
                return true;

            // Move Down
            if (solveMaze(x + 1, y))
                return true;

            // Backtrack
            solution[x][y] = 0;
            return false;
        }

        return false;
    }

    // Print solution
    static void printSolution() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(solution[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        if (solveMaze(0, 0)) {
            System.out.println("Path found:");
            printSolution();
        } else {
            System.out.println("No path exists");
        }
    }

}
