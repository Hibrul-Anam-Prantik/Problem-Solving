import java.util.Scanner;
public class GamingArray 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int g = sc.nextInt(); 
        GameArray game = new GameArray();
        for(int i = 0; i < g; i++) 
        {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int j = 0; j < n; j++) 
            {
                arr[j] = sc.nextInt();
            }
            String winner = game.gamingArray(arr);
            System.out.println(winner);
        }
        sc.close();
    }
}

class GameArray 
{
    public String gamingArray(int[] arr) 
    {
        String player1 = "BOB";
        String player2 = "ANDY";
        String winner = "";
        int n = arr.length;
        for(int g = 0; ; g++)
        {
            int max = arr[0];
            int maxIndex = 0;
            for(int i = 1; i < n; i++)  // finding the max element
            {
                if(arr[i] > max) {
                    max = arr[i];
                    maxIndex = i;
                }
            }
            n = maxIndex + 1;   // controlling the array size
            for(int i = maxIndex; i < n; i++)  // erase max elemsnts & the rest
            {
                arr[i] = 0;
            }
            if(maxIndex == 0) {  // deciding the winner
                if(g % 2 == 0) {
                    winner = player1;
                } else {
                    winner = player2;
                }
                break;
            }
        }
        return winner;
    }
}
