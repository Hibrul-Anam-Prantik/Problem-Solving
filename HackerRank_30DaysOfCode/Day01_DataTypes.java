// package HackerRank_30DaysOfCode;

import java.util.*;

public class Day01_DataTypes 
{
    public static void main(String[] args) 
    {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
 
        /* Declare second integer, double, and String variables. */
        int n1 = scan.nextInt(); double n2 = scan.nextDouble(); scan.nextLine(); String str = scan.nextLine();
        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        
        /* Print the sum of both integer variables on a new line. */
        System.out.println(i + n1); System.out.println(d + n2); System.out.println(s + str);
        /* Print the sum of the double variables on a new line. */
		
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */

        scan.close();
    }
}
