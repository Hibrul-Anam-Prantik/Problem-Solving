package Codeforces_Round_1039_Div2;

import java.util.Arrays;

public class A_RecyclingCenter {
    public static void main(String[] args) throws Exception {
        java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String[] line1 = br.readLine().split(" ");
            int n = Integer.parseInt(line1[0]);
            int c = Integer.parseInt(line1[1]);
            int[] w = new int[n];
            String[] weights = br.readLine().split(" ");
            for(int j = 0; j < n; j++) {
                w[j] = Integer.parseInt(weights[j]);
            }
            Arrays.sort(w);
            int coins = 0;
            for (int j = 0; j < n; j++) {
                long weight = (long)w[j] * exponentiation(2, j); // after doubling j times
                if (weight > c) coins++;
                w[j] = 0;
            }
            System.out.println(coins);
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
// Accepted Solution:
/*
import java.util.*;

public class One {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long c= sc.nextLong();
            long arr[] = new long[n];
            for(int i=0; i<n; i++){
                arr[i]=sc.nextLong();
            }
            ArrayList<Long>list = new ArrayList<>();

            for(int i=0; i<n; i++){
                if(arr[i]<=c){
                    long val= (long)((Math.log(c)-Math.log(arr[i]))/Math.log(2));
//                    System.out.println(val);
                    list.add(val);
                }
            }

            Collections.sort(list);

            int cnt=0;
            int time=0;
            for(int i=0; i<list.size(); i++){
                if(list.get(i)>=time){
                    cnt++;
                    time++;
                }
            }
            System.out.println(n-cnt);
        }
    }
}

 */
// Accepted Solution-2:
/*
import java.util.*;
public class Main
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){

            int n=sc.nextInt();
            int c=sc.nextInt();

            int[] a= new int[n];
            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
            int big = 0;

            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                if(a[i]<=c) pq.offer(a[i]);
                else    big++;
            }

            int power=0;
            while(!pq.isEmpty()){
                int  x=pq.poll();
                if(x*Math.pow(2,power)>c)  big++;
                else power++;
            }
            System.out.println(big);
        }
	}

}
 */