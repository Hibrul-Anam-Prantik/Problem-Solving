package HackerRank_30DaysOfCode;

import java.util.Scanner;

public class Day17_MoreExceptions
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt(), p = sc.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        sc.close();
    }
}

class Calculator
{
    public int power(int n, int p) throws Exception
    {
        if(n < 0 || p < 0) {
            throw new Exception("n and p should be non-negative");
        }
        else if(n > 0 && p ==0) {
            return 1;
        } else if(n == 0 && p > 0) {
            return 0;
        } else {
            int r = 1;
            while(p-- > 0)
            {
                r = r * n;
            }
            return r;
        }
    }
}
