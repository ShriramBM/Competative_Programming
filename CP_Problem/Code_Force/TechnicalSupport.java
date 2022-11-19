import java.util.Scanner;
import java.util.Stack;

public class TechnicalSupport {

    public static String logic1(String qa, int n) {
        if (qa.charAt(n - 1) == 'Q')
            return "NO";
        else {
            for (int i = 0; i < n - 1; i++) {
                if (qa.charAt(i) == 'Q' && qa.charAt(i + 1) == 'Q') {
                    return "NO";
                }
            }
            return "YES";
        }

    }

    public static String logic2(String qa, int n) {
        Stack<Character> stact = new Stack<>();

        for (int i = 0; i < n; i++) {
            if (stact.isEmpty()) {
                stact.push(qa.charAt(i));
            } else if (stact.peek() == 'Q' && qa.charAt(i) == 'A') {
                stact.pop();
            } else
                stact.push(qa.charAt(i));
        }
        if (stact.isEmpty()) {

            return "YES";
        } else {
            if(stact.contains('Q')) return "NO";
            else return "YES";

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();

        while (test-- > 0) {

            int n = sc.nextInt();
            String qa = sc.next();
            System.out.println(logic2(qa, n));
        }
    }
}
