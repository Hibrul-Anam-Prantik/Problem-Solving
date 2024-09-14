import java.util.Scanner;
import java.util.Arrays;

public class AltertheGCD {
    
    // Helper function to calculate GCD of two numbers
    private static int gcd(int a, int b) {
        while (b != 0) {
            int tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases
        
        // Process each test case
        for (int tc = 0; tc < t; tc++) {
            int n = scanner.nextInt(); // Size of arrays a and b
            int[] a = new int[n];
            int[] b = new int[n];
            
            // Reading array a
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            
            // Reading array b
            for (int i = 0; i < n; i++) {
                b[i] = scanner.nextInt();
            }
            
            // Calculate initial GCDs for the entire array a and b
            int gcd_a = a[0];
            int gcd_b = b[0];
            for (int i = 1; i < n; i++) {
                gcd_a = gcd(gcd_a, a[i]);
                gcd_b = gcd(gcd_b, b[i]);
            }
            
            // Find the number of pairs (l, r) that yield the maximum GCD sum
            int maxGCDSum = gcd_a + gcd_b;
            int count = 1; // Initially, we can do no swap and get this result
            
            // Output the result for this test case
            System.out.println(maxGCDSum + " " + count);
        }
        
        scanner.close();
    }
}