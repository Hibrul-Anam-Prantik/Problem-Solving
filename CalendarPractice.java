import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;

public class CalendarPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // MY CODE HERE
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, sc.nextInt());
        System.out.println(cal.getTime());
        sc.close();
    }
}
