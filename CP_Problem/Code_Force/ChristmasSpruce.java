import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ChristmasSpruce {

    public static boolean logic(LinkedHashMap<Integer, ArrayList<Integer>> nodes, ArrayList<Integer> arr) {
        int flag = 0;
        for (Integer a : arr) {
            if (flag >= 3) {
                break;
            }

            if (nodes.containsKey(a))
                continue;
            else
                flag++;
        }

        return (flag >= 3) ? true : false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        LinkedHashMap<Integer, ArrayList<Integer>> nodes = new LinkedHashMap<>();
        for (int i = 2; i <= n; i++) {
            int inp = sc.nextInt();
            if (!nodes.containsKey(inp)) {
                ArrayList<Integer> x = new ArrayList<>();
                x.add(i);
                nodes.put(inp, x);
            } else {
                nodes.get(inp).add(i);
            }
        }

        String check = "YES";
        for (Map.Entry<Integer, ArrayList<Integer>> ele : nodes.entrySet()) {
            if (logic(nodes, ele.getValue())) {
                continue;
            } else {
                check = "NO";
                break;
            }
        }

        System.out.println(nodes);

        System.out.println(check);

    }

}
