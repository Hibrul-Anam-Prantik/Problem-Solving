import java.util.Scanner;

public class MessageTransmissionErrorE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String t = sc.nextLine();
        sc.close();
        int length = t.length();

        // Try every possible overlap length from 1 up to length/2
        for (int s = 1; s < length / 2 + 1; s++) {
            String prefix = t.substring(0, length - s);
            String suffix = t.substring(length - s);

            // Check if the overlap condition is satisfied
            if (t.startsWith(prefix) && t.endsWith(suffix) && prefix.length() == suffix.length() && prefix.equals(suffix)) {
                System.out.println("YES");
                System.out.println(prefix);
                return;
            }
        }
        
        // If no valid overlap is found, print NO
        System.out.println("NO");
        
    }
}