// package HackerRank_30DaysOfCode;

import java.util.Scanner;

public class Day06_StringLoop 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < T; i++) 
        {
            String S = sc.nextLine();
            int N = S.length();
            String s1 = "", s2 = "";
            for (int j = 0; j < N; j++) 
            {
                if (j % 2 == 0) {
                    s1 += S.charAt(j);
                } else {
                    s2 += S.charAt(j);
                }
            }
            System.out.println(s1 + " " + s2);
        }
        sc.close();
    }
}
