import java.util.Scanner;

public class Elephant {

    public static int logic(int dis) {

        if (dis == 0) {
            return 0;
        }

        if (dis - 5 >= 0) {
            return 1 + logic(dis - 5);
        }

        else if (dis - 4 >= 0) {
            return 1 + logic(dis - 4);
        }

        else if (dis - 3 >= 0) {
            return 1 + logic(dis - 3);
        }

        else if (dis - 2 >= 0) {
            return 1 + logic(dis - 2);
        }

        else if (dis - 1 >= 0) {
            return 1 + logic(dis - 1);
        }

        else {
            return 0;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(logic(sc.nextInt() ));
        sc.close();
    }

}
