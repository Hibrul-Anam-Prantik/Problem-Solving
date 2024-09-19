import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day11_2DArray_HourGlassSum {
    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();
        
        Scanner sc = new Scanner(System.in);
        // Making List
        for( int i = 0; i < 6; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for(int j = 0; j < 6; j ++) {
                row.add(sc.nextInt());
            }
            arr.add(row);
        }
        sc.close();
        
        int maxSum = Integer.MIN_VALUE;
        int tempSum;

        // Loop through the array to find all possible hourglass sums
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                // Extract the hourglass sum
                tempSum = hourGlassSum(arr, i, j);
                // Update the maximum sum if needed
                if (tempSum > maxSum) {
                    maxSum = tempSum;
                }
            }
        }

        System.out.println("Max Hourglass Sum: " + maxSum);

        // bufferedReader.close();
    }

    // Function to calculate the sum of an hourglass starting at (row, col)
    public static int hourGlassSum(List<List<Integer>> arr, int row, int col) {
        int sum = 0;
        sum += arr.get(row).get(col) + arr.get(row).get(col + 1) + arr.get(row).get(col + 2); // top row
        sum += arr.get(row + 1).get(col + 1); // middle element
        sum += arr.get(row + 2).get(col) + arr.get(row + 2).get(col + 1) + arr.get(row + 2).get(col + 2); // bottom row
        return sum;
    }
}