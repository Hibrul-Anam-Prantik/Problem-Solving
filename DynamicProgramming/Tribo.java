package DynamicProgramming;

import java.util.HashMap;

public class Tribo
{
    public int n;

    public Tribo() {};

    public Tribo(int n) {
        this.n = n;
        run();
    }

    public static Double trib(int n) {
        return trib(n, new HashMap<>());
    }

    // DP implementation ->
    public static Double trib(int n, HashMap<Integer, Double> memo) {
        if(n == 0 || n == 1) return 0.0;
        if(n == 2) return 1.0;
        if(memo.containsKey(n)) {
            return memo.get(n);
        }
        Double result = trib(n - 1, memo) + trib(n - 2, memo) + trib(n - 3, memo);
        memo.put(n, result);
        return result;
    }

    public void run() {
        System.out.println(trib(n));
    }

    public static void main(String[] args) {
        Tribo trib = new Tribo(13);
    }
}
