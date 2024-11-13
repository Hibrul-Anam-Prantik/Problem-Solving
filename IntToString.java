import java.util.Scanner;

public class IntToString
{
    public static void main(String[] args)
    {
        int n = takeInput();
        String s = makeStr(n);
        check(n, s);
    }

    public static int takeInput()
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        return n;
    }

    public static String makeStr(int n)
    {
        String s = Integer.toString(n);
        return s;
    }

    public static void check(int n, String s)
    {
        if(n == Integer.parseInt(s)) System.out.println("Good Job!");
        else System.out.println("Wrong Number.");
    }
}
