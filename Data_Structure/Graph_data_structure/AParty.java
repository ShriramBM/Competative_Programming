
import java.util.ArrayList;

import java.util.LinkedHashMap;

import java.util.Scanner;

// DFS party
public class AParty {

    static int count = 0;

    public static int logic(int root, LinkedHashMap<Integer, ArrayList<Integer>> tree, int cc) {

        if(cc>count) count=cc;

        for(int t: tree.get(root)){
            if(tree.containsKey(t)){
                logic(t, tree,cc+1);
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        LinkedHashMap<Integer, ArrayList<Integer>> tree = new LinkedHashMap<>();
        for (int i = 1; i <= n; i++) {

            int inp = sc.nextInt();
  
            if (tree.containsKey(inp)) {
                tree.get(inp).add(i);
            } else {
                ArrayList<Integer> d = new ArrayList<>();
                d.add(i);
                tree.put(inp, d);
            }
        }

        System.out.println(logic(-1, tree, 0));
        sc.close();

    }

}
