import java.util.Scanner;

public class WrongSubtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (number % 10 == 0)
                number = number / 10;
            else
                number --;
        }
        System.out.println(number);
    }

}
