public class Day09_Recursion {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorial(n));
    }

    public static int factorial(int n ) {
        if(n == 0) {
            return 1;
        } else {
            return n * factorial(n -1);
        }
    }
}
