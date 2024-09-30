package HackerRank_30DaysOfCode;

import java.util.Scanner;

public class Day14_Scope {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}

class Difference {
    private int[] elements;
    public int maximumDifference;

    // Add your code here
    Difference(int[] a) {
        elements = a;
    }
    void computeDifference() {
        // maximumDifference = 0;
        for (int element : elements) {  // enhanced for loop
            for (int i : elements) {  // // enhanced for loop
                if ((Math.abs(element - i)) > maximumDifference) {
                    maximumDifference = Math.abs(element - i);
                }
            }
        }
    }

} // End of Difference class


