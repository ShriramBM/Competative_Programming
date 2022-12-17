import java.util.Scanner;

public class SoldierAndBananaOptimized {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int per_banana = sc.nextInt();
        int total_doller = sc.nextInt();
        int total_banana = sc.nextInt();

        if ((((total_banana * (total_banana + 1)) / 2) * per_banana) > total_doller)
            System.out.println((((total_banana * (total_banana + 1)) / 2) * per_banana) - total_doller);
        else
            System.out.println(0);
        
        sc.close();
    }
}
