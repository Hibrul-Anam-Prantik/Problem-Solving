import java.util.Scanner;

public class Day10_BinaryNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String binaryString = Integer.toBinaryString(n);
        int maxCount = 0;
        int currentCount = 0;
        
        for (char c : binaryString.toCharArray()) {
            if (c == '1') {
                currentCount++;
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                }
            } else {
                currentCount = 0;
            }
        }
        System.out.println(maxCount);
        sc.close();
    }
}
