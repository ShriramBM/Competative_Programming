import java.util.Scanner;

// question Watermelon
public class WaterMelon {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num%2 == 0 && num>2){

            System.out.println("YES");
        }
        else System.out.println("NO");
    }
}
