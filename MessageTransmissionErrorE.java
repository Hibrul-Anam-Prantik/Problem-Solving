import java.util.Scanner;

public class MessageTransmissionErrorE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String t = sc.nextLine();
        sc.close();
        int l = t.length();

        String s1 = t.substring(0, l / 2 + 1);
        String s2 = t.substring(l / 2);

        if (s1.equals(s2)) {
            System.out.println("YES\n" + s1);
        } else {
            System.out.println("NO");
        }
    }
}