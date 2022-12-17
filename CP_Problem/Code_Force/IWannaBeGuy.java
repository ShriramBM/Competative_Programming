import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class IWannaBeGuy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int level = sc.nextInt();
        Set<Integer> size_ing = new HashSet<>();
        int x = sc.nextInt();
        for (int i = 0; i < x; i++)
            size_ing.add(sc.nextInt());

        int y = sc.nextInt();
        
        for (int j = 0; j < y; j++)
            size_ing.add(sc.nextInt());
        System.out.println((level == size_ing.size()) ? "I become the guy." : "Oh, my keyboard!");
        sc.close();
    }
}
