import java.util.Scanner;

public class TheStrictTeacher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt(); // nCells
            int m = sc.nextInt(); // nTeachers
            int q = sc.nextInt(); // nQueries

            int b1 = sc.nextInt(); // teacher
            int b2 = sc.nextInt();

            int qD = sc.nextInt(); // David

            int n1 = Math.abs(qD - b1);
            int n2 = Math.abs(qD - b2);

            int moves = Math.min(n1, n2);
            System.out.println(moves);
        }
        sc.close();
    }
}
