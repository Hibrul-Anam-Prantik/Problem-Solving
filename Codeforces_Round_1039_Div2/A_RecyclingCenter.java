package Codeforces_Round_1039_Div2;

public class A_RecyclingCenter {
    public static void main(String[] args) throws Exception {
        java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String[] line1 = br.readLine().split(" ");
            int n = Integer.parseInt(line1[0]);
            int c = Integer.parseInt(line1[1]);
            int storedC = c;
            int[] w = new int[n];
            String[] weights = br.readLine().split(" ");
            for(int j = 0; j < n; j++) {
                w[j] = Integer.parseInt(weights[j]);
            }
            for(int j = 0; j < n; j++) {
                long d = w[j] * exponentiation(2, j);
                if(d > c) c--;
            }
            System.out.println(storedC - c);
        }
        br.close();
    }
    private static long exponentiation(int a, long b) {
        long result = 1;
        long base = a;

        while (b > 0) {
            if ((b & 1) == 1) {
                result *= base; // multiply result by base if b is odd
            }
            base *= base; // square the base
            b >>= 1; // divide b by 2 (right shift)
        }
        return result;
    }
}
