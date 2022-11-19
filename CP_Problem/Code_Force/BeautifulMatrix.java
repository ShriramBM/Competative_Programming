import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[5][5];

        int row = 0;
        int col = 0;
        outter:
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (sc.nextInt() == 1) {
                    System.out.println(Math.abs(3-(i+1))+Math.abs(3-(j+1)));
                    break outter;
                }
            }
        }
        
    }
}
