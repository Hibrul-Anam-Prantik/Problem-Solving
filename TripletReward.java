import java.io.*;
import java.util.*;

public class TripletReward {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> a = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ace's Points: ");
        a.add(sc.nextInt()); a.add(sc.nextInt()); a.add(sc.nextInt());
        ArrayList<Integer> b = new ArrayList<>();
        System.out.println("Bob's Points: ");
        b.add(sc.nextInt()); b.add(sc.nextInt()); b.add(sc.nextInt());
        sc.close();
        List<Integer> c = Result.compareTriplets(a, b);
        // System.out.println(r.compareTriplets(a, b));
        System.out.println(c);
    }
}

// Solution
class Result {

    /*
     * Complete the 'compareTriplets' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> score = new ArrayList<>(Arrays.asList(0, 0));
        int a1 = 1, b1 = 1;
        for(int i = 0; i < 3; i ++) 
        {
            if(a.get(i) > b.get(i)) {
                score.set(0, a1++);
            } else if(b.get(i) > a.get(i)) {
                score.set(1, b1++);
            } 
        }
        return score;
    }
}


