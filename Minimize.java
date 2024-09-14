import java.util.Scanner;

public class Minimize 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i ++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = a; // let's assume, cause c would be neutralized anyway, so the value of c does't reallhy matter
            System.out.println((c - a) + (b - c));
        }
        sc.close();
    }
}
