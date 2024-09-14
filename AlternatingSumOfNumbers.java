import java.util.Scanner;

public class AlternatingSumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i ++) {
            int n = sc.nextInt();
            int sum = 0;
            for(int j = 0; j < n; j ++) {
                int a = sc.nextInt();
                if(j % 2 == 0) {
                    sum += a;
                } else {
                    sum -= a;
                }
            }
            System.out.println(sum);
        }
        sc.close();
    }
}
