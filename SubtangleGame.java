import java.util.*;

public class SubtangleGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases

        for (int testCase = 0; testCase < t; testCase++) {
            int l = scanner.nextInt(); // Length of array a
            int n = scanner.nextInt(); // Number of rows in matrix b
            int m = scanner.nextInt(); // Number of columns in matrix b

            int[] a = new int[l];
            for (int i = 0; i < l; i++) {
                a[i] = scanner.nextInt(); // Elements of array a
            }

            int[][] b = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    b[i][j] = scanner.nextInt(); // Elements of matrix b
                }
            }

            // Start the game with Tsovak choosing the first element in the matrix
            boolean tsovakTurn = true; // True if it's Tsovak's turn, false for Narek's turn
            int currentRow = 0;
            int currentCol = 0;
            boolean gameEnded = false;

            for (int k = 0; k < l; k++) {
                int target = a[k];
                boolean found = false;

                for (int i = currentRow; i < n && !found; i++) {
                    for (int j = currentCol; j < m && !found; j++) {
                        if (b[i][j] == target) {
                            found = true;
                            currentRow = i + 1; // Reduce the submatrix for the next player
                            currentCol = j + 1;
                        }
                    }
                }

                if (!found) {
                    // The current player cannot find the element, so they lose
                    if (tsovakTurn) {
                        System.out.println("N"); // Tsovak was playing, so Narek wins
                    } else {
                        System.out.println("T"); // Narek was playing, so Tsovak wins
                    }
                    gameEnded = true;
                    break;
                }

                // Alternate turns only if the game hasn't ended
                tsovakTurn = !tsovakTurn;
            }

            // If no player loses during the game, Tsovak wins by default
            if (!gameEnded) {
                if (tsovakTurn) {
                    System.out.println("N"); // Narek's turn means Tsovak has won
                } else {
                    System.out.println("T"); // Tsovak's turn means Narek has won
                }
            }
        }

        scanner.close();
    }
}