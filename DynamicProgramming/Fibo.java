package DynamicProgramming;

import java.util.HashMap;

public class Fibo
{
    public int n;

    public Fibo() {};

    public Fibo(int n) {
        this.n = n;
        run();
    }

    public static Double fib(int n) {
        return fib(n, new HashMap<>());
    }

    // DP implementation ->
    private static Double fib(int n, HashMap<Integer, Double> memo) {
        if(n == 0 || n == 1) return (double)n;
        if(memo.containsKey(n)) return memo.get(n);
        Double result = fib(n - 1, memo) + fib(n - 2, memo);
        memo.put(n, result);
        return result;
    }

    public void run() {
        System.out.println(fib(n));
    }

    public static void main(String[] args) {
        Fibo fib = new Fibo(12);
    }
}
