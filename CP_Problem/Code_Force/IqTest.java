import java.util.Scanner;

import org.w3c.dom.events.Event;

public class IqTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int odd = 0;
        int even = 0;
        int even_at = 0;
        int odd_at = 0;
        for (int i = 0; i < n; i++) {
            if (sc.nextInt() % 2 == 0) {
                even++;
                even_at = i;
            } else {
                odd++;
                odd_at = i;
            }
        }
        if (even >= odd)
            System.out.println(odd_at + 1);
        else
            System.out.println(even_at+1);
        
        sc.close();

    }

}
