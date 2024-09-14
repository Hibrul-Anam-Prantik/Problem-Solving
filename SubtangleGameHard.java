import java.util.*;

public class SubtangleGameHard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int testCase = 0; testCase < t; testCase++) {
            int l = scanner.nextInt();
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            scanner.nextLine(); // Consume newline after integer input

            int[] a = new int[l];
            for (int i = 0; i < l; i++) {
                a[i] = scanner.nextInt();
            }
            scanner.nextLine(); // Consume newline after integer input

            int[][] b = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    b[i][j] = scanner.nextInt();
                }
            }
            scanner.nextLine(); // Consume newline after matrix input

            // Store the positions of each number in the matrix
            Map<Integer, List<int[]>> positions = new HashMap<>();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    positions.computeIfAbsent(b[i][j], k -> new ArrayList<>()).add(new int[] { i, j });
                }
            }

            // Initialize the current search area
            int curRow = 0;
            int curCol = 0;
            boolean tsovakTurn = true; // Tsovak starts first

            boolean gameEnded = false;

            for (int i = 0; i < l; i++) {
                int target = a[i];
                boolean found = false;

                if (positions.containsKey(target)) {
                    // Check for valid positions in the submatrix starting from (curRow, curCol)
                    List<int[]> possiblePositions = positions.get(target);
                    for (int[] pos : possiblePositions) {
                        int row = pos[0];
                        int col = pos[1];
                        if (row >= curRow && col >= curCol) {
                            // Valid position found
                            curRow = row + 1;
                            curCol = col + 1;
                            found = true;
                            break;
                        }
                    }
                }

                if (!found) {
                    // Current player cannot find the element
                    System.out.println(tsovakTurn ? "N" : "T");
                    gameEnded = true;
                    break;
                }

                // Alternate turns
                tsovakTurn = !tsovakTurn;
            }

            if (!gameEnded) {
                // If the game did not end during the loop, Tsovak wins by default
                System.out.println(tsovakTurn ? "N" : "T");
            }
        }

        scanner.close();
    }
}