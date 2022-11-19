import java.util.Scanner;

public class Domino {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int mul = 0;
        int i = 1;
        while (mul <= (m * n)) {
            mul = i * 2;
            i++;
        }
        System.out.println(i-1);
    }
}
