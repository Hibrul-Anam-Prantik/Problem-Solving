import java.util.Scanner;

public class LazyNarek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // number of test cases

        for (int tc = 0; tc < t; tc++) {
            int n = scanner.nextInt(); // number of strings
            int m = scanner.nextInt(); // length of each string
            String[] strings = new String[n];

            for (int i = 0; i < n; i++) {
                strings[i] = scanner.next(); // reading each string
            }

            // We now process each test case to find the best scoren - scorec
            System.out.println(calculateMaxScore(strings));
        }

        scanner.close();
    }

    public static int calculateMaxScore(String[] strings) {
        int totalScoreNarek = 0; // Narek's total score
        int totalScoreChatGPT = 0; // ChatGPT's total score

        // Variables to track the occurrences of 'n', 'a', 'r', 'e', 'k' in order
        int countN = 0, countA = 0, countR = 0, countE = 0, countK = 0;

        for (String s : strings) {
            // Count the occurrences of 'n', 'a', 'r', 'e', 'k' in this string
            for (char c : s.toCharArray()) {
                if (c == 'n') {
                    countN++;
                } else if (c == 'a' && countN > 0) {
                    countA++;
                    countN--; // consume one 'n'
                } else if (c == 'r' && countA > 0) {
                    countR++;
                    countA--; // consume one 'a'
                } else if (c == 'e' && countR > 0) {
                    countE++;
                    countR--; // consume one 'r'
                } else if (c == 'k' && countE > 0) {
                    countK++;
                    countE--; // consume one 'e'
                }
            }
        }

        // Compute total scoren: each complete "narek" gives Narek 5 points
        totalScoreNarek = countK * 5;

        // Compute total scorec: all leftover letters not used by Narek contribute to
        // ChatGPT's score
        totalScoreChatGPT = countN + countA + countR + countE + countK;

        // Return the difference: scoren - scorec
        return totalScoreNarek - totalScoreChatGPT;
    }
}